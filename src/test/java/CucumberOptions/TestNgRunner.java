package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
					glue = "StepDefinition",
					tags = "@RegressionTest or @SmokeTest",
					monochrome= true,
					plugin = {"pretty", "html:target/cucmber.html", "json:target/cucumber.json"}
					)
public class TestNgRunner extends AbstractTestNGCucumberTests{

}
 