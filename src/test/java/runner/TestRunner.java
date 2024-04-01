package runner;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features",
				 glue={"stepdefinitions","hooks"},
				 publish=true,
				 plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
	

}

//"pretty","html:target/CucumberReports/CucumberReport.html"}