package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"AllFeatureFiles"},
		glue= {"StepDefination"},
		dryRun=false
		
		)


public class Runner extends AbstractTestNGCucumberTests {

}
