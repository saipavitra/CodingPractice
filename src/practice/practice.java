package practice;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence="welcome to the world";
				String word="";
				String finalw="";
				String spiltedword[]=sentence.split(" ");//0= welcome , 1=to , 2=the, 3=world
				for (int i=0;i<=spiltedword.length-1;i++)
				{
				int length= spiltedword[i].length();
				for (int j=length-1;j>=0;j--)
				{
				word=word+String.valueOf(spiltedword[i].charAt(j));
				}
				finalw=finalw+word+" ";
				word="";
				}
				System.out.println(finalw.trim());
	}

}
