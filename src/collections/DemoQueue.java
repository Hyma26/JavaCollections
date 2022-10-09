package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class DemoQueue {

	public static void main(String[] args) 
	{
		PriorityQueue q=new PriorityQueue();
		//heterogeneous data not allowed q.add(100)
		
		//add elements    add()  offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		
		//System.out.println(q);//insertion order preserved and duplicates allowed
		
		//get head element   element()   peek()
		//System.out.println(q.element());//A  if empty returns  NoSuchElementException
		
		//System.out.println(q.peek());//A  if empty returns null
		
		//Return and remove head element    remove()   poll()
		//System.out.println(q.remove());//A  if empty returns  NoSuchElementException
		//System.out.println(q);
		
		//System.out.println(q.poll());//A  if empty returns null
		//System.out.println(q); //[B,C,C]
		
		/*Iterator it= q.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}*/
		for(Object ele:q) {
			System.out.println(ele);
		}
		
		

	}

}
