package practice;

public class AsciiValueOfVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="aeiou";
String word="welcome";
int num;
for(int i=0;i<a.length();i++)
{
	num=a.charAt(i);
	for(int j=0;j<word.length();j++)
	{
		int number=word.charAt(j);
				if(number==num)
				{
				System.out.println(word.charAt(j) +" value's ascii key value is "+number);	
				}
	}
}
	}

}
