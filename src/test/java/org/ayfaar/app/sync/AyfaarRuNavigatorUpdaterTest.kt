package org.ayfaar.app.sync

import com.google.gson.Gson
import com.mscharhag.oleaster.matcher.Matchers.expect
import org.junit.Test

@Suppress("UNCHECKED_CAST")
class AyfaarRuNavigatorUpdaterTest {

    @Test
    fun sync() {
        AyfaarRuNavigatorUpdater("", "").sync()
    }

    @Test
    fun parseData() {
        val list = Gson().fromJson("[[\"подборка: условия их развития, направления развития и способности - в димидиомитт. формах, симплиспарентивных..., схемы синтеза, Творцы-регуляторы,интерпретаторы)\"],[\"ПОДБОРКА НАЧАЛЬНОЙ СЛОЖНОСТИ\",\"\",\"\",\"\",\"\",\"ПОДБОРКА ПРОДВИНУТОЙ СЛОЖНОСТИ\"],[\"СТАТЬИ\",\"\",\"\",\"\",\"24.09.18\",\"СТАТЬИ\"],[\"Ориса\",\"ссылки\",\"Ииссиидиологов\",\"ссылки\",\"\",\"Ориса\",\"ссылки\",\"Ииссиидиологов\",\"ссылки\"],[\"О медитациях, способностях и готовности к этим процессам\",\"https://ayfaar.ru/articles/o_meditaciyah_sposobnostyah_i_gotovnosti_k_etim_processam\",\"Воздействие медитации и практик повышения осознанности на мозг и психику\",\"https://ayfaar.ru/articles/vozdeystvie_meditacii_i_praktik_povysheniya_osoznannosti_na_mozg_i_psihiku\",\"\",\"О способностях и медитациях\",\"https://ayfaar.ru/articles/o_sposobnostyah_i_meditatsii\"],[\"О насущном интересе, экспрессии генов и духовном росте\",\"https://ayfaar.ru/articles/ob_interese_i_duhovnom_roste\",\"Контактёрство - миф или реальность\",\"https://ayfaar.ru/articles/kontaktjorstvo-mif-ili-realnost\",\"\",\"Амплиатизация мозга, будущие профессии\",\"https://ayfaar.ru/articles/ampl_mozga_i_buduschie_professii\"],[\"Тренировка мозга для ЗКК-Медитации\",\"https://ayfaar.ru/articles/trenirivka_mozga_dlia_ZKK-meditatsii\",\"Медитация - мозг «за» или «против»?\",\"https://ayfaar.ru/articles/meditatsiya-mozg-za-ili-protiv\",\"\",\"О пути позитивизма, духовном развитии и посвящениях\",\"https://ayfaar.ru/articles/o_puti_pozitivizma_1\"],[\"Гамма-ритмы мозга и глубинная Медитация\",\"https://ayfaar.ru/articles/gamma_ritmi_i_meditatsiya\",\"Медитация на основе Айфааровских песен\",\"https://ayfaarpesni.org/about-songs/?id\\u003d9\",\"\",\"Виваксы и 328 плаапсий, виваксы и функции мозга\",\"https://ayfaar.ru/articles/vivaksi_mozg__i_328\"],[\"О глубинной медитации\",\"https://ayfaar.ru/articles/o_glubinnoy_meditacii\",\"Человек будущего. Кто он и где его найти?\",\"https://ayfaar.ru/articles/chelovek-budushchego\",\"\",\"Об уровнях психических переживаний. Часть третья\",\"https://ayfaar.ru/articles/ob_urovnyah_peregivaniy_3\"],[\"В медитации открыт доступ к тому, что нам недоступно в обычном осознанном состоянии\",\"https://ayfaar.ru/articles/v_meditacii_otkryt_dostup_k_tomu_chto_nam_nedostupno_v_obychnom_osoznannom_sostoyanii\",\"Телепатия с некоторых позиций ииссиидиологии\",\"https://ayfaar.ru/articles/telepatiya_s_nekotoryh_poziciy_iissiidiologii\",\"\",\"О принципе раскрытия экстраординарных способностей\",\"https://ayfaar.ru/articles/o_printsipe_raskritija_sposobnostey\"],[\"Можем ли вернуться в \\\"Звёздный Дом\\\"? Часть 5\",\"http://pleiades-light.ru/zvezdnyj-dom-5/\",\"Просветление сознания – возможности и ограничения\",\"https://ayfaar.ru/articles/prosvetlenie_soznaniya__vozmojnosti_i_ogranicheniya\",\"\",\"О сути \\\"божественных проявлений\\\"\",\"https://ayfaar.ru/articles/o_suti_bojestvennyh_proyavleniy\"],[\"Просветление сознания – возможности и ограничения\",\"https://ayfaar.ru/articles/prosvetlenie_soznaniya__vozmojnosti_i_ogranicheniya\",\"Определение осознанности и «наука созерцания»\",\"https://ayfaar.ru/articles/opredelenie_osoznannosti_i_nauka_sozercaniya\",\"\",\"О сути просветления. Часть первая\",\"https://ayfaar.ru/articles/o_suti_prosvetleniya\"],[\"О доверии и доверчивости, о Жизни и Ангелах\",\"http://pleiades-light.ru/o-doverii-i-angelah/\",\"Что нас ждёт в медитации? Изменённое состояние сознания\",\"https://ayfaar.ru/articles/chto_nas_jdet_v_meditacii\",\"\",\"О сути просветления. Часть вторая\",\"https://ayfaar.ru/articles/o_suti_prosvetleniya_2\"],[\"Об эволюции наших биоплазменных Форм и развитии Ииссиидиологии\",\"http://pleiades-light.ru/ob-evolyutsii-nashih-bioplazmennyh-form-i-razvitii-iissiidiologii/\",\"Базовые состояния сознания\",\"https://ayfaar.ru/projects/meditacii/blog/bazovye_sostoyaniya_soznaniya_iz_kontakta_s_kuratorskimi_aspektami\",\"\",\"О трансмутации и трансформации Самосознания\",\"https://ayfaar.ru/articles/transmutatsii_transformatsii\"],[\"О способностях и медитациях. Часть 1\",\"http://pleiades-light.ru/o-sposobnostyah-i-meditatsiyah-1/\",\"\",\"\",\"\",\"О сердце. Часть первая\",\"https://ayfaar.ru/articles/2018-07_o_serdtse\"],[\"О способностях и медитациях. Часть 2\",\"http://pleiades-light.ru/o-sposobnostyah-i-meditatsiyah-2/\",\"\",\"\",\"\",\"О подцентровых компенсаторах\",\"https://ayfaar.ru/articles/podtsentrovie_kompensatori\"],[\"О медитациях, способностях и готовности к этим процессам\",\"https://ayfaar.ru/articles/o_meditaciyah_sposobnostyah_i_gotovnosti_k_etim_processam\",\"\",\"\",\"\",\"О внутреннем диалоге\",\"https://ayfaar.ru/articles/o_vnutrennem_dialoge\"],[\"О применении информации, полученной в медитациях\",\"https://ayfaar.ru/articles/o_primenenii_informacii_poluchennoy_v_meditaciyah\",\"\",\"\",\"\",\"Что такое духовное самопожертвование и как приблизиться к этому состоянию?\",\"https://ayfaar.ru/articles/chto_takoe_duhovnoe_samopojertvovanie\"],[\"Все ответы находятся внутри нас – главное задать правильный вопрос\",\"https://ayfaar.ru/articles/vse_otvety_nahodyatsya_vnutri_nas\",\"\",\"\",\"\",\"Блиц-ответы. 5 марта 2018\",\"https://ayfaar.ru/articles/blic-otvety_5_marta_2018\"],[\"О позитивизме, способностях и честном подходе к себе\",\"http://pleiades-light.ru/o-pozitivizme-1/\",\"\",\"\",\"\",\"Познавательные возможности кодовой Медитации ниже, чем у глубинной\",\"https://ayfaar.ru/articles/poznavatelnye_vozmojnosti_kodovoy_meditacii_nije_chem_u_glubinnoy\"],[\"О медитациях на ЗКК низкочастотных уровней\",\"https://ayfaar.ru/articles/o_meditaciyah_na_zkk_nizkochastotnyh_urovney\",\"\",\"\",\"\",\"Медитация на Звуковые Космические Коды отличается от обычной медитации техникой и нейрофизиологической составляющей\",\"https://ayfaar.ru/articles/meditaciya_na_zvukovye_kosmicheskie_kody_otlichaetsya_ot_obychnoy_meditacii_tehnikoy_i_neyrofiziologicheskoy_sostavlyayushchey\"],[\"Тренировка мозга для ЗКК-Медитации\",\"https://ayfaar.ru/articles/trenirivka_mozga_dlia_ZKK-meditatsii\",\"\",\"\",\"\",\"Почему в медитации не рекомендуется скрещивать руки и ноги\",\"https://ayfaar.ru/articles/pochemu_v_meditacii_ne_rekomenduetsya_skreshchivat_ruki_i_nogi\"],[\"В медитации открыт доступ к тому, что нам недоступно в обычном осознанном состоянии\",\"https://ayfaar.ru/articles/v_meditacii_otkryt_dostup_k_tomu_chto_nam_nedostupno_v_obychnom_osoznannom_sostoyanii\",\"\",\"\",\"\",\"Почему при медитации на различные ЗКК возникают разные ощущения\",\"https://ayfaar.ru/articles/pochemu_pri_meditacii_na_razlichnye_zkk_voznikayut_raznye_oshchushcheniya\"],[\"Даже в медитации мы ограничены мерностью существования\",\"https://ayfaar.ru/articles/daje_v_meditacii_my_ogranicheny_mernostyu_sushchestvovaniya\"],[\"О медитации и роли сна\",\"https://ayfaar.ru/articles/o_meditacii_i_roli_sna\"],[\"Можно ли посредством медитации развить альтруизм\",\"https://ayfaar.ru/articles/mojno_li_posredstvom_meditacii_razvit_altruizm\"],[\"подборка продвинутой сложности (ссылка на другую подборку)\",\"\",\"\",\"\",\"\",\"подборка начальной сложности (ссылка на другую подборку)\"],[\"ВИДЕО (цветной блок)\"],[\"О целях, желаниях и образах в медитации\",\"\",\"https://youtu.be/r5fICkPYdfg\",\"\",\"\",\"ВИДЕО (цветной блок)\"],[\"Есть ли границы нашего сознания? О глубинной медитации\",\"\",\"https://youtu.be/eHHRHkSx40A\",\"\",\"\",\"О звуковых кодах для медитаций. О медитации на другие цивилизации и влиянии медитации на физиологию\",\"\",\"https://youtu.be/rSwg9nh0Ncw\"],[\"Медитация и обретение способностей\",\"\",\"https://youtu.be/PUJnnYlbMCY\"],[\"Как естественным путем, а не с помощью технологий прийти к выдающимся человеческим способностям\",\"\",\"https://youtu.be/TqIlt5gtH3Y\",\"\",\"\",\"О контактах с другими цивилизациями в медитации\",\"\",\"https://youtu.be/U69eSV68t9k\"],[\"О медитациях на точку и палец. Об изменённом состоянии сознания\",\"\",\"https://youtu.be/dm_APzDxNN4\"],[\"АУДИО (белый блок)\"],[\"О Системе Восприятия\",\"\",\"http://ii.ayfaar.org/r/2012-06-05_03\",\"\",\"\",\"АУДИО (белый блок)\"],[\"Некоторые необычные способности людей могут относиться к проявлениям других Прото-Форм\",\"\",\"http://ii.ayfaar.org/r/2010-01-16_02\",\"\",\"\",\"О высокочастотных проявлениях других Прото-Форм через наше сознание\",\"\",\"http://ii.ayfaar.org/r/2010-11-28_03\"],[\"\",\"\",\"\",\"\",\"\",\"Мы каждое мгновение распаковываем один сценарий\",\"\",\"http://ii.ayfaar.org/r/2014-06-17_08-k\"],[\"\",\"\",\"\",\"\",\"\",\"Фокусировка в одном сценарии обусловлена ограничением био-Творцов\",\"\",\"http://ii.ayfaar.org/r/2014-06-17_07-k\"],[],[\"подборка продвинутой сложности (ссылка на другую подборку)\"],[\"\",\"\",\"\",\"\",\"\",\"подборка начальной сложности (ссылка на другую подборку)\"]]",
                List::class.java) as List<List<String>>

        list.parseData().let { (newbieBlock, advancedBlock) ->
            expect(newbieBlock?.articles?.oris).toHaveSize(22)
            expect(newbieBlock?.articles?.others).toHaveSize(10)
            expect(newbieBlock?.videos).toHaveSize(5)
            expect(newbieBlock?.audios).toHaveSize(2)

            expect(advancedBlock?.articles?.oris).toHaveSize(19)
            expect(advancedBlock?.articles?.others).toBeEmpty()
            expect(advancedBlock?.videos).toHaveSize(1)
            expect(advancedBlock?.audios).toHaveSize(3)
        }
    }

    @Test
    fun uploadDataTest() {
//        uploadData("test")
    }

    @Test
    fun getYoutubeIdFromUrlTest() {
        listOf(
                "http://www.youtube.com/watch?feature=player_embedded&v=dm_APzDxNN4",
                "http://www.youtube.com/v/dm_APzDxNN4?fs=1&hl=en_US&rel=0",
                "http://www.youtube.com/embed/dm_APzDxNN4?rel=0",
                "http://www.youtube.com/watch?v=dm_APzDxNN4&feature=feedrec_grec_index",
                "http://www.youtube.com/watch?v=dm_APzDxNN4",
                "http://youtu.be/dm_APzDxNN4",
                "http://www.youtube.com/watch?v=dm_APzDxNN4#t=0m10s",
                "http://youtu.be/dm_APzDxNN4",
                "http://www.youtube.com/embed/dm_APzDxNN4",
                "http://www.youtube.com/v/dm_APzDxNN4",
                "http://www.youtube.com/watch?v=dm_APzDxNN4",
                "https://www.youtube.com/watch?v=dm_APzDxNN4",
                "http://www.youtube-nocookie.com/v/dm_APzDxNN4?version=3&hl=en_US&rel=0").forEach {url ->
            extractVideoIdFromUrl(url).let { id ->
                println(url)
                expect(id).toEqual("dm_APzDxNN4")
            }
        }
    }
}