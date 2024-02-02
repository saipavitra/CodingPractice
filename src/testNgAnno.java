import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNgAnno {

	//Note : this class will be trigger even though main method is not there as we have some annotation
	@BeforeClass // runs before each class is triggered
	public void displayClass() {
		// TODO Auto-generated method stub
		System.out.println("Before Class");
	}
	
	@BeforeMethod // runs before each test annotations based on sorting order 
	public void displayMethod() {
		// TODO Auto-generated method stub
		System.out.println("Before Method");
	}
	
	@Test(priority=1)// just like a method 
	public void displayTest() {
		// TODO Auto-generated method stub
		System.out.println("Test1");
	}
	
	@Test // just like a method 
	public void displayTestt1() {
		// TODO Auto-generated method stub
		System.out.println("Test2");
		SoftAssert sa=new SoftAssert();//testng's class
		String url="";
		sa.assertTrue(url.contains("sss"));
		sa.assertEquals("actual", "expected");
		sa.assertAll();//hightlights the failed TCs which are declared under sofAssrt 
	}
	
	@AfterClass // runs after each class is triggered
	public void displayClass1() {
		// TODO Auto-generated method stub
		System.out.println("After class");
	}
	
	@AfterMethod // runs after each test annotations has been triggered
	public void displayMethod1() {
		// TODO Auto-generated method stub
     System.out.println("After Method");
	}
	
	
	
}
