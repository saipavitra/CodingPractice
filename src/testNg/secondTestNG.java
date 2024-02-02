package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class secondTestNG {

	@Test(dataProvider="loadPage",groups= {"smoke","regression"})
	private void play(String capabilitykey , String capabilityValue) {
		// TODO Auto-generated method stub
      System.out.println(capabilitykey);
      System.out.println(capabilityValue);
      System.out.println(Thread.currentThread().getId());
	}
	@Test(dataProvider="carrierPage",dataProviderClass=secondTestNG.class)// dataProviderClass helps us in accessing the variables  from other class. as dataproviders are private in nature
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getId());
	}
	@Test(priority=1,enabled =false)//enabled=false is equivalent to @ignore in junit
	public void eatzz() {
		
		System.out.println(Thread.currentThread().getId());
	}
	@Test(priority=1,enabled =false,groups="smoke")//enabled=false is equivalent to @ignore in junit
	public void playzz() {
		System.out.println(Thread.currentThread().getId());
		
	}
	@Test(priority=1,enabled =false,groups="sanity")//enabled=false is equivalent to @ignore in junit
	public void playzz1() {
		System.out.println(Thread.currentThread().getId());
		
	}
	@Test(priority=1,enabled =true,groups="regression")//enabled=false is equivalent to @ignore in junit
	public void playzz2() {
		System.out.println("regression suite");
		System.out.println(Thread.currentThread().getId());
	}
	@DataProvider(name="loadPage",indices= {0,2},parallel=true)// acts as an key value pair //indices - used to take 0th index and 2nd index values for test data based on the number which provided
	private Object[][] data(){
		Object[][] obj=new Object[][]{
		{"load1", "123456"}, 
		{"load2", "123457"}, 
		{"load3", "123459"}, 
		{"load4", "123450"}
		
	};
	return obj;
	}
	
	@DataProvider(name="carrierPage",indices= {0,2})// dataproviders methods will be private in nature
	private Object[][] data1(){
		Object[][] obj=new Object[][]{
		{"load1", "123456"}, 
		{"load2", "123457"}, 
		{"load3", "123459"}, 
		{"load4", "123450"}
	
		
	};
	return obj;
	}
}

