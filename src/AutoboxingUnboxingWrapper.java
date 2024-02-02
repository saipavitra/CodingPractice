

public class AutoboxingUnboxingWrapper {
	public void method1() {
		// TODO Auto-generated method stub

	}
	
	public void method2() {
		// TODO Auto-generated method stub

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//collection concept accepts only object so that why wrapper class is used 
		//converting datatype (int) to Integer (Wrapper) is autoboxing
		int a=22;
		Integer b=a;
		//or 
		Integer f=Integer.valueOf(a);
		System.out.println(b+" "+f);
		
		//converting wrapper class to datatype is known is unboxing
		Integer c=23;
		int d=c;
		//or
		int g=c.intValue();
		System.out.println(d+" "+g);
		
		AutoboxingUnboxingWrapper obj = new AutoboxingUnboxingWrapper();
		obj.method1();
		obj.method2();
	}

}

//upcasting vs downcasting 
//upcasting is converting child to parent , hence typecast is needed eg : Parent obj=new Child() -> typecasting of a child object to a parent object.
//downcasting is converting parent to child , hence typecasting will not be required
//Exception : if we forcefully do any typecasting for downcasting process this will throw "ClassCastException"

//static vs non static 
//static method - object creation will not happen and JVM will recognize the static keyword as soon as it sees , it tries to execute as object is not needed
//non static method - object creation will happen , memory allocation will happen  , during abstraction static methods will not be used as non static methods will be used for defining of the methods in other class in abstraction