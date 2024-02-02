package practice;

public class concateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Sai Pavitra Kumarii";//output: S.P.Kumarii
		String finalword="";
		String word[]=name.split(" ");
		System.out.println(word.length);
		System.out.println(name.length());
		for(int i=0;i<word.length-1;i++)
		{
			if(Character.isUpperCase(word[i].charAt(0)))
			{
		finalword=finalword+word[i].charAt(0)+".";
			}
		}
	
		for(int j=0;j<word[2].length();j++)
		{
		finalword=finalword+word[2].charAt(j);
		}

		System.out.println(finalword);
		}
	}

