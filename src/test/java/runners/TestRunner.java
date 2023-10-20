package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests",
		glue= {"stepDefinitions"},
//		plugin = { "pretty",
//				"json:target/cucumber-reports/cucumber.json",
//				"junit:target/cucumber-reports/cucumber.xml",
//				"html:target/cucumber-reports/cucumber.html"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

		monochrome = true
		)
 

public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
//	    Reporter.setSystemInfo("Selenium", "3.7.0");
//	    Reporter.setSystemInfo("Maven", "3.5.2");
//	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
	

}