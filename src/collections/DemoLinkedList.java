package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) 
	{
		LinkedList ln= new LinkedList();
		ln.add(100);
		ln.add("C++");
		ln.add(50);
		ln.add("car");
		
		System.out.println(ln);
		System.out.println(ln.size());
		System.out.println(ln.get(2));
		System.out.println(ln.getFirst());
		System.out.println(ln.getLast());
		System.out.println(ln.indexOf(100));
		System.out.println(ln.lastIndexOf("car"));
		System.out.println(ln.add("java"));
		System.out.println(ln.indexOf("java"));
		System.out.println(ln.remove(2));
		System.out.println(ln.add("python"));
		System.out.println(ln.indexOf("python"));
		System.out.println(ln.set(2, 200));
		
		System.out.println(ln);
		System.out.println(ln.containsAll(ln));
		System.out.println(ln.contains("java"));
		
		//Reading elements using loop
		for(int i=0;i<ln.size();i++)
		{
			System.out.println(ln.get(i));
		}
		
		for(Object e:ln)
		{
			System.out.println(e);
		}
		
		Iterator it = ln.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
