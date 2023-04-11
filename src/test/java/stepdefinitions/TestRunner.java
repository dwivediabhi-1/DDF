package stepdefinitions;


import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src//test//java//features",
			glue = "stepdefinitions",
			//tags = "@tag3",
			plugin = { "pretty",  "html:test-output", "html:target/cucumber-report/cucumber.html",
	                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/",
	                "json:target/cucumber-reports/Cucumber.json" }
		)
public class TestRunner {
	


}
