package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class duplicatesLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="Welcomeem";
	    char c[]=word.toCharArray();
	    Map<Character,Integer> m= new LinkedHashMap<>();
	    for(int i=0;i<word.length();i++)
	    {
	        if(m.containsKey(c[i]))
	        {
	            Integer d=m.get(c[i]);
	            m.put(c[i],d+1);
	        }
	        else
	        {
	            m.put(c[i],1);
	        }
	    }
	    System.out.println(m);
	}

}
