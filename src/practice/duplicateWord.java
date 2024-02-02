package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class duplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name="Sai Sai Pavitra Sai";
String word[]=name.split(" ");
Map<String,Integer> m= new LinkedHashMap<>();
for(int i=0;i<word.length;i++)
{
    if(m.containsKey(word[i]))
    {
        Integer d=m.get(word[i]);
        m.put(word[i],d+1);
    }
    else
    {
        m.put(word[i],1);
    }
}
System.out.println(m);

	}

}
