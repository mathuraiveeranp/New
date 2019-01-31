package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features={"src\\main\\java\\featureFiles\\Login.feature","src\\main\\java\\featureFiles\\CreateLead.feature"},
glue= {"stepDefinitions"},monochrome=true,/* tags={"@Negative"},*/
dryRun=false, snippets=SnippetType.CAMELCASE)
public class RunnerJUnit {
	
		
}
