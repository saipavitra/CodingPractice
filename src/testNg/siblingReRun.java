package testNg;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(otherRerun.class)//listeners considers the below methods and checks if any of the methods fails in between , the mentioned class present in the listener will be executed
public class siblingReRun {

	@Test
	private void play() {
		// TODO Auto-generated method stub
     System.out.println("Playing......");
	}
	
	@Test
//	@Test(retryAnalyzer=reRun.class)//re-runs the failed Test cases if user gets to know the failure of Tc which will happen
	private void watch() {
		// TODO Auto-generated method stub
		Assert.assertTrue(false);

	}
}


