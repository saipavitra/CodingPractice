package testNg;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class runnerTestNG {
	
	@Parameters({"user","pass"})
	@Test(groups= {"smoke","regression"})
	public void dispaly(String name, String pass) {
		SoftAssert softAssert = new SoftAssert();//with the help of soft assert , Tc continues to execute eventhough , assert is failed 
		// TODO Auto-generated method stub
	System.out.println(Thread.currentThread().getId());
     System.out.println(name +" "+pass);
     softAssert.assertAll();
	}

}
