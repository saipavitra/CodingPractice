package cucumber_Junit;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\stepDefinitions\\featureFile1.feature", glue = "cucumber_Junit", tags="@RegressionTest" , plugin = {
		"pretty", "html:target/CucumberHTMLRep.html", "json:target/CucumberHTMLRep.json", "junit:target/CucumberHTMLRep.xml"}, monochrome=true, snippets=SnippetType.UNDERSCORE)
public class Runner {

}