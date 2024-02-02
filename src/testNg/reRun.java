package testNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class reRun implements IRetryAnalyzer {
    int a=0;
    int b=5;
	//reruns the failed Test Cases
	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		if(a<b)
		{
			a++;
			return true;  //condition=pass  test case=fail
			
		}
		return false; //condition=fail  test case=pass
	}
}

