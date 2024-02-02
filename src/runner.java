import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src", glue = "stepDefinitions", tags="@RegressionTest or @SmokeTest" , plugin = {
		"pretty", "html:target/CucumberHTMLRep.html"})
public class runner {

}
