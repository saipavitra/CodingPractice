package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraynum[]= {10,45,60,20,30,45};
		int newArray[]= {};
		int temp;
		int k=0;
		Set<Integer> hashset=new HashSet<Integer>();
		for(int i=0;i<arraynum.length;i++)
		{
			hashset.add(arraynum[i]);
		}
		System.out.println(hashset);
		List l= new ArrayList();
		l.addAll(hashset);
		//l.sort(null);-> can also be used for sorting
		Collections.sort(l);
		System.out.println(l);
		

			System.out.println(l.get(l.size()-2));
	
		
//		for(int i=0;i<k;i++)
//		{
//			System.out.println(newArray[i]);
//		}
//		for(int i=0;i<arraynum.length;i++)
//		{
//		for(int j=i+1;j<arraynum.length;j++)
//		{
//			
//			if(arraynum[i]>arraynum[j])
//			{
//				temp=arraynum[i];
//				arraynum[i]=arraynum[j];
//				arraynum[j]=temp;
//			}
//
//	
//		}
//		}
		

	}

}
