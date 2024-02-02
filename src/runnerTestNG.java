import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class runnerTestNG {

	@Test(priority=2,invocationCount=2,enabled=true) // if invocation count is equal to 2 , then the method will be executed twice
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=-2, alwaysRun=true) // if the priority is in negative , that will be executed on priority later on positives will get executed
	public void test2()
	{
		System.out.println("Test2");
		SoftAssert s=new SoftAssert();
		s.assertEquals("Expected", "Actual");
		s.assertTrue(true);
		s.assertAll();// this type of assert  will read from lines 16 to 19 if the assert fails in between , a line will be printed in the console stating that it is failed, if the assert is failed after AssertAll() function , a line stating that it is failed will not be printed
		
	}
	
	@Test(dependsOnMethods={"test2","test1"}, alwaysRun=true) // if dependsOnMethods annotation is alone used , this method will execute only after test2 and test1 methods gets executed , and if alwaysRun is true , then this method will run even if one of the dependent method fails
	public void test3()
	{
		System.out.println("Test1");
	}
	
}


//alwaysRun: -> When set to true, this method will run even if it depends on a method that has failed
//Test Annotations and its listeners -> ( refer this for detailed references)-> https://www.softwaretestinghelp.com/testng-annotations-and-listeners/ 
