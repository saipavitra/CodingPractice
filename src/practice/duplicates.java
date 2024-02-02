package practice;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sen="Welcome to World";
		int c=0;
		String dup="";
		for (int i=0;i<sen.length();i++)
		{
			for(int j=i+1;j<sen.length();j++)
			{
				if(sen.charAt(i)==sen.charAt(j))
				{
					c++;
				}
			}
			if(dup.contains(String.valueOf(sen.charAt(i))))
					{
				
					}
			else
			{
			if(c>0)
			{
				
				System.out.println(sen.charAt(i)+" has count "+(c+1));
				dup=dup+sen.charAt(i);
			}
			}
			c=0;
		}
		System.out.println(dup);
	}

}
