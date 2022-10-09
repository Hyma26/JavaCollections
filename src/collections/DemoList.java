package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoList {

	public static void main(String[] args) 
	{
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(10);
		ar.add(20);
		ar.add("Hello");
		ar.add("Java");
		
		System.out.println(ar);
		
		//get size
		System.out.println(ar.size());
		
		//remove data
		ar.remove(2);
		System.out.println(ar);
		
		//replace existing data
		ar.add(2,15.55);
		System.out.println(ar);
		
		//get the value
		System.out.println(ar.get(3));
		
		//insert value
		ar.set(0, 50);
		System.out.println(ar);
		
		//contains gives true/false
		System.out.println(ar.contains("Java"));
		System.out.println(ar.contains(30));
		
		//isEmpty---true/false
		System.out.println(ar.isEmpty());
		//for loop
		for(int i=0;i<ar.size();i++) 
		{
			System.out.println(ar.get(i));
		}
		//for...each loop
		for(Object e:ar)
		{
			System.out.println(e);
		}
		
		//Iterator
		Iterator it = ar.iterator();
		while(it.hasNext()) 
		{
			 System.out.println(it.next());
		}
		
		
		
		
		
		

	}

}
