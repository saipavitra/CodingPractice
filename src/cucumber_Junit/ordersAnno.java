package cucumber_Junit;


import org.junit.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class ordersAnno {
	
@Before(order=1)
	public void run(){
		// TODO Auto-generated method stub
System.out.println("This is the first method to get triggered");
	}
@Before(order=2)
public void run1(){
	// TODO Auto-generated method stub
	System.out.println("This is the second method to get triggered");
}

@Test
public void test()
{
	
}
@After(order=1) //orders will execute in descending order for after class because corresponding class of order 1's before will executed first hence this after class will be executed at the last
public void run3(){
	// TODO Auto-generated method stub
	System.out.println("This is the second method to get triggered");
}
@After(order=2, value="@Smoke") //if the runner class's tag name indicates smoke only then this will get executed
public void run4(){
	// TODO Auto-generated method stub
	System.out.println("This is the first method to get triggered");
}
}
