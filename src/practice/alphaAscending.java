package practice;

import java.util.Arrays;

public class alphaAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String words="Welcome";
//char a[]=words.toCharArray();
//Arrays.sort(a);
//System.out.println(a);
		
// or
		
String words="Welcome";
char a[]=words.toCharArray();
int temp;
String word="";
for(int i=0;i<words.length();i++)
{
 for(int j=i+1;j<words.length();j++)
 {
	 if(a[i]<a[j])
	 {
		 temp=a[i];
		 a[i]=(char) temp;
	 }
	 else
	 {
		 
		 temp=a[i];
		 a[i]=a[j];
		 a[j]=(char) temp;
	 }
	 
 }
}
System.out.println(Arrays.toString(a));
for(int i=0;i<a.length;i++)
{
	word=word+a[i];
}
System.out.println(word);
	}

}
