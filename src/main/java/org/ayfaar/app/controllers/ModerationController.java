package org.ayfaar.app.controllers;

import lombok.Builder;
import one.util.streamex.StreamEx;
import org.ayfaar.app.dao.CommonDao;
import org.ayfaar.app.model.PendingAction;
import org.ayfaar.app.services.moderation.ModerationService;
import org.ayfaar.app.services.user.UserPresentation;
import org.ayfaar.app.services.user.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("api/moderation")
@PreAuthorize("authenticated")
public class ModerationController {
    @Inject CommonDao commonDao;
    @Inject ModerationService service;
    @Inject UserService userService;

    @RequestMapping("status")
    public CurrentStatus get() {
        // show only my users (this user can be linked with another as children for personal moderation)
        final List<PendingActionPresentation> pendingActions = StreamEx.of(commonDao.getList(PendingAction.class, "confirmedBy", null))
                .filter(a -> AuthController.getCurrentAccessLevel().accept(a.getAction().getRequiredAccessLevel()))
                .sortedBy(PendingAction::getId).reverseSorted()
                .map(PendingActionPresentation::new)
                .toList();
        return CurrentStatus.builder()
                .pendingActions(pendingActions)
                .build();
    }

    @RequestMapping("{id}/confirm")
    public void confirm(@PathVariable Integer id) {
        final PendingAction event = commonDao.getOpt(PendingAction.class, id).get();
        service.confirm(event);
    }

    private class PendingActionPresentation {
        public Integer id;
        public String text;
        public UserPresentation initiatedBy;
        public PendingActionPresentation(PendingAction action) {
            id = action.getId();
            text = action.getMessage();
            initiatedBy = userService.getPresentation(action.getInitiatedBy()).get();
        }
    }

    @Builder
    private static class CurrentStatus {
        public List<PendingActionPresentation> pendingActions;
    }
}
