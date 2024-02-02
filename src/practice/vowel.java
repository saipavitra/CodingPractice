package practice;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sen="Welcome";
		String com="";
		for(int i=0;i<sen.length();i++)
		{
		if(sen.charAt(i)=='a' || sen.charAt(i)=='e' ||sen.charAt(i)=='i' ||sen.charAt(i)=='o' ||sen.charAt(i)=='u')
		{
		com=com+String.valueOf(sen.charAt(i));
		}
		}
		System.out.println(com);
	}

}
