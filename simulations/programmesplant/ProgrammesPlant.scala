package programmesplant
import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

class ProgrammesPlant extends Simulation {
    
    val httpConf = httpConfig
			.baseURL("")
			.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
			.acceptEncodingHeader("gzip, deflate")
			.acceptLanguageHeader("en-us,en;q=0.5")
			.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:13.0) Gecko/20100101 Firefox/13.0.1")


	setUp(StandardEditorScenario.scn.users(150).ramp(150).protocolConfig(httpConf))
	
	
}