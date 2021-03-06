package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = { "src/test/resources/features" }, 
		monochrome = true, 
		dryRun = false, 
		glue= {"gluecode", "support"},
		tags = "@web",
		snippets = SnippetType.CAMELCASE)
public class RunTest {

}
