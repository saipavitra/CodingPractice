package practice;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen="WelWcomee";
		int count=0;
		int k=0;
		String str="";
		for(int i=0;i<sen.length();i++)
		{
		for(int j=0;j<sen.length();j++)
		{
		if(sen.charAt(i)==sen.charAt(j))
		{
		count=count+1;
		}
		}
		if(str.contains(String.valueOf(sen.charAt(i)))==false)
		{
		str=str+sen.charAt(i);
		System.out.println(sen.charAt(i) +" count is "+count);	
		}
		count=0;
		}
	}

}
