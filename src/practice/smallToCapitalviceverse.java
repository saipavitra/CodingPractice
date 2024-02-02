package practice;

public class smallToCapitalviceverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="Welcome To MY HOME";
String wordSplitted[]=word.split(" ");
String rev="";
for(int k=0;k<wordSplitted.length;k++)
{
for(int i=0;i<wordSplitted[k].length();i++)
{
if(Character.isUpperCase(wordSplitted[k].charAt(i)))
{
	rev=rev+Character.toLowerCase(wordSplitted[k].charAt(i));
}
else
{
	rev=rev+Character.toUpperCase(wordSplitted[k].charAt(i));
}
}
rev=rev+" ";
}
System.out.println(rev.trim());
	}

}
