package programmesplant
import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import Headers._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

object StandardEditorScenario {

    val scn = scenario("Standard Editor Scenario")
		.exec(http("request_index_page_1")
					.get("/")
			)
		.pause(11)
		.exec(http("request_programme_edit_95_1")
					.get("/2014/ug/programmes/edit/95")
			)
		.pause(1)
		.exec(http("request_3")
					.get("/js/ckeditor/lang/en-gb.js")
					.headers(headers_3)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.exec(http("request_4")
					.get("/js/ckeditor/skins/moono/editor_gecko.css")
					.headers(headers_4)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(1)
		.exec(http("request_5")
					.get("/js/ckeditor/styles.js")
					.headers(headers_5)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(28)
		.exec(http("request_programme_save_95_1")
					.post("/2014/ug/programmes/edit")
					.headers(headers_6)
						.fileBody("ProgrammesPlant_request_6.txt")
			)
		.pause(1)
		.exec(http("request_7")
					.get("/js/ckeditor/skins/moono/editor_gecko.css")
					.headers(headers_4)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.exec(http("request_8")
					.get("/js/ckeditor/lang/en-gb.js")
					.headers(headers_3)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(1)
		.exec(http("request_9")
					.get("/js/ckeditor/styles.js")
					.headers(headers_5)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(14)
		.exec(http("request_programme_save_95_2")
					.post("/2014/ug/programmes/edit")
					.headers(headers_10)
						.fileBody("ProgrammesPlant_request_10.txt")
			)
		.pause(1)
		.exec(http("request_11")
					.get("/js/ckeditor/skins/moono/editor_gecko.css")
					.headers(headers_4)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.exec(http("request_12")
					.get("/js/ckeditor/lang/en-gb.js")
					.headers(headers_3)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(1)
		.exec(http("request_13")
					.get("/js/ckeditor/styles.js")
					.headers(headers_5)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(10)
		.exec(http("request_14")
					.get("/")
			)
		.pause(11)
		.exec(http("request_programme_edit_275_1")
					.get("/2014/ug/programmes/edit/275")
			)
		.pause(1)
		.exec(http("request_16")
					.get("/js/ckeditor/lang/en-gb.js")
					.headers(headers_3)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.exec(http("request_17")
					.get("/js/ckeditor/skins/moono/editor_gecko.css")
					.headers(headers_4)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(1)
		.exec(http("request_18")
					.get("/js/ckeditor/styles.js")
					.headers(headers_5)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(17)
		.exec(http("request_19")
					.post("http://safebrowsing.clients.google.com/safebrowsing/downloads")
					.headers(headers_19)
					.queryParam("""wrkey""", """AKEgNivWR5R3VuWZkksY37neGbaoC6Naq_ZeSY3iGGrZo762q7jmK2akcPzmjDQNMDa_r_0qAttD5mDiSy9aDjPVfM_YuflghQ==""")
					.queryParam("""client""", """navclient-auto-ffox""")
					.queryParam("""pver""", """2.2""")
					.queryParam("""appver""", """13.0.1""")
						.fileBody("ProgrammesPlant_request_19.txt")
			)
		.pause(137 milliseconds)
		.exec(http("request_20")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChNnb29nLW1hbHdhcmUtc2hhdmFyEAEYod0GIMDeBioJHa8BAP____8PMhShrgEA____________________Dw")
					.headers(headers_20)
			)
		.pause(516 milliseconds)
		.exec(http("request_21")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChNnb29nLW1hbHdhcmUtc2hhdmFyEAAYwcoGIIDNBjItQaUBAP_____________f________________9__________ff_________8A")
					.headers(headers_20)
			)
		.pause(419 milliseconds)
		.exec(http("request_22")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChNnb29nLW1hbHdhcmUtc2hhdmFyEAAYgc0GIIDSBjJVgaYBAP_3_7_v-______-_______________________________f_________________________________________________v__________AA")
					.headers(headers_20)
			)
		.pause(80 milliseconds)
		.exec(http("request_programme_save_275_1")
					.post("/2014/ug/programmes/edit")
					.headers(headers_23)
						.fileBody("ProgrammesPlant_request_23.txt")
			)
		.pause(1)
		.exec(http("request_24")
					.get("/js/ckeditor/skins/moono/editor_gecko.css")
					.headers(headers_4)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.exec(http("request_25")
					.get("/js/ckeditor/lang/en-gb.js")
					.headers(headers_3)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(122 milliseconds)
		.exec(http("request_26")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChNnb29nLW1hbHdhcmUtc2hhdmFyEAAYgdIGIMDUBjItAakBAP_________n__________________v3__7__3________________8A")
					.headers(headers_20)
			)
		.pause(1)
		.exec(http("request_27")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChNnb29nLW1hbHdhcmUtc2hhdmFyEAAYwdQGIIDXBjItQaoBAP_______________7_________-________________f_________8A")
					.headers(headers_20)
			)
		.pause(395 milliseconds)
		.exec(http("request_28")
					.get("/js/ckeditor/styles.js")
					.headers(headers_5)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(44)
		.exec(http("request_29")
					.get("/js/ckeditor/plugins/magicline/images/icon.png")
					.headers(headers_29)
					.check(status.is(404))
			)
		.pause(1)
		.exec(http("request_programme_save_275_2")
					.post("/2014/ug/programmes/edit")
					.headers(headers_30)
						.fileBody("ProgrammesPlant_request_30.txt")
			)
		.pause(1)
		.exec(http("request_31")
					.get("/js/ckeditor/skins/moono/editor_gecko.css")
					.headers(headers_4)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.exec(http("request_32")
					.get("/js/ckeditor/lang/en-gb.js")
					.headers(headers_3)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(1)
		.exec(http("request_33")
					.get("/js/ckeditor/styles.js")
					.headers(headers_5)
					.queryParam("""t""", """D08E""")
					.check(status.in(Seq(200, 304)))
			)
		.pause(4)
		.exec(http("request_index_page_2")
					.get("/")
			)
		.pause(6)
		.exec(http("request_35")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChNnb29nLW1hbHdhcmUtc2hhdmFyEAAYgeEGIIDmBipAJrEBAP______________________________________________________________________________BzIZgbABAP__________________________Hw")
					.headers(headers_20)
			)
		.pause(211 milliseconds)
		.exec(http("request_36")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchABGMHlByCA6AcyLcHyAQD7_________________7_______7____3_____________________AA")
					.headers(headers_20)
			)
		.pause(58 milliseconds)
		.exec(http("request_37")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchABGMH5ByCA_AcqGln9AQD___________________________8AMhjB_AEA_________________________wA")
					.headers(headers_20)
			)
		.pause(146 milliseconds)
		.exec(http("request_38")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchAAGIGbECCAoBAyVYENBABHMvj_____________B-T8XxHt____-39REhan___3__ne___3__________________________2__3___________________________wA")
					.headers(headers_20)
			)
		.pause(439 milliseconds)
		.exec(http("request_39")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchAAGIGgECCApRAyVQEQBAD__3-1___v___z________________________v___v9f_______________________f_____7__3_____________________________wA")
					.headers(headers_20)
			)
		.pause(430 milliseconds)
		.exec(http("request_40")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchAAGIGlECCAqhAyVYESBAD______-_________________________-_________________________________________e_______3______v______________3_wA")
					.headers(headers_20)
			)
		.pause(437 milliseconds)
		.exec(http("request_41")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchAAGIGqECCArxAyVQEVBAB_f_9_7___________________________________3__3___________________________97___-____________________________wA")
					.headers(headers_20)
			)
		.pause(448 milliseconds)
		.exec(http("request_42")
					.get("http://safebrowsing-cache.google.com/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchAAGMHAECCAwxAqEwohBAD__________________38yHkEgBAD_______________________________7_AQ")
					.headers(headers_20)
			)
}