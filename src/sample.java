abstract class sunstar {

	void printInfoo()
	{
		System.out.println("abstract");
	};
}

class employee extends sunstar {
	void printInfo()
	{
		String name = "avinash";
		int age = 21;
		float salary = 222.2F;

		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
	void printInfoo()
	{
		System.out.println("abstract 1");
	};
}

class sample {
	public static void main(String args[])
	{
		sunstar s = new employee();
		s.printInfoo();
	}
}
