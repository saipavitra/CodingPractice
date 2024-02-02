import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)//runs the Test Suite (where many classes will be present)
@SuiteClasses({runnerJunit.class,SecondrunnerJnuit.class})//acts as a Test suite for executing Test cases
public class CombinedRunnerJunit {
	@Test
	public void result() {
		
		//note : results will be captured under console tab
		// TODO Auto-generated method stub
     Result r=JUnitCore.runClasses(runnerJunit.class,SecondrunnerJnuit.class);//datas will be stored under Result "r" variable
     r.getRunCount();//counts the test annotation tags Test cases
     r.getIgnoreCount();//counts the ignore tagged Test cases
     r.getFailureCount();//counts the failed Test cases 
     r.getRunTime();//counts the Run Time of the Test case execution
     r.wasSuccessful();//success result is captured 
     List<Failure> failures = r.getFailures();
     for(int i=0;i<failures.size();i++)
     {
    	 failures.get(i).getTestHeader();//failed Test case's Header will be captured
    	 failures.get(i).getMessage();// Error messages will be captured
    	 failures.get(i).getException();//type of exception will print
     }
	}
}
