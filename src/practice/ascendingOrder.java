package practice;

public class ascendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arraynum[]= {10,45,60,20,30};
		int min=0;
		for(int i=0;i<arraynum.length;i++)
		{
			for(int j=i+1;j<arraynum.length;j++)
			{
			if(arraynum[i]<arraynum[j] && i!=j)
			{
				min=arraynum[i];
				arraynum[i]=min;
				
			}
			else
			{
				min=arraynum[j];
				arraynum[j]=arraynum[i];
				arraynum[i]=min;
			}
			}
	}
		for(int i=0;i<arraynum.length;i++)
		{
			System.out.println(arraynum[i]);
		}
		
	}
}
