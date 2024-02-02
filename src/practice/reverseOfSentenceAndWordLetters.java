package practice;

public class reverseOfSentenceAndWordLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="Welcome to my Home";
		String SplittedWord[]=word.split(" ");
		String rev="";
		
		for(int i=SplittedWord.length-1;i>=0;i--)
		{
			rev=rev+SplittedWord[i]+" ";
		}
		System.out.println(rev.trim());//until here output:Home my to Welcome
		
		String revSplitted[]=rev.split(" ");
		String revfinal="";
		String finalRev="";
		for(int i=0;i<revSplitted.length;i++)//0-Home , 1-my , 2- to , 3- Welcome
		{
			finalRev=revSplitted[i];
			for(int j=finalRev.length()-1;j>=0;j--)
			{
				revfinal=revfinal+finalRev.charAt(j);
			}
			revfinal=revfinal+" ";
		}
		System.out.println(revfinal.trim());// until here output :emoH ym ot emocleW
	}

}
