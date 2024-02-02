package practice;

public class capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen="WelCome";
		String com="";
		for(int i=0;i<sen.length();i++)
		{
		if(Character.isUpperCase(sen.charAt(i)))
		{
		com=com+String.valueOf(sen.charAt(i));
		}
		}
       System.out.println(com);
	}

}
