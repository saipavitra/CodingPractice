package cucumber_TestNg;


import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src", glue = "stepDefinitions")
public class runner extends AbstractTestNGCucumberTests {

	@DataProvider(parallel=true)
@Override
public Object[][] scenarios() {
	// TODO Auto-generated method stub		
			return super.scenarios();	
	
}
}

//when cucumber is integrated with TestNg i.e dataprovider , all the examples will be executed parallely.
//when there testNg is not integrated with cucumber as there won't be any feature files , hence it will be executed standalone for that TC .

	
