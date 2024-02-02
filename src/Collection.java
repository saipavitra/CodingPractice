import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList
		ArrayList<String> al=new ArrayList<String>();//It is not synchronized
		LinkedList<String> li=new LinkedList<String>();//uses doubly linked list and It is not synchronized
		Vector<String> v=new Vector<String>();//uses dynamic array and It is synchronized
		al.add("Yugeshpaithiyamee");
		al.add("YugiMentalll");
		al.add("yugeshhErumaa");
		al.add("Yugiiilooossuuuu");
		
		Iterator itr=al.iterator();//can move forward direction
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//set
		//hashSet
		HashSet<String> set=new HashSet<String>();
	}

}
//stack is the subclass of vector , follows Last in first out order // to add -> push() , delete->pop()
//queue follows First in first out order

  