package collections;

import java.util.Collections;
import java.util.LinkedList;

public class DemoLinkedList2 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> ln = new LinkedList<Integer>();
		ln.add(20);
		ln.add(10);
		ln.add(50);
		ln.add(30);
		ln.add(40);
		System.out.println(ln);
		
		//to add to new linkedlist
		LinkedList<Integer> new_ln = new LinkedList<Integer>();
		System.out.println(new_ln.addAll(ln));
		System.out.println(new_ln);
		
		Collections.sort(ln);
		System.out.println("Elements after sorting:"+ln);
		Collections.sort(ln,Collections.reverseOrder());
		System.out.println("Elements after sorting reverse order:"+ln);
		Collections.shuffle(ln);
		System.out.println("Elements after shuffling:"+ln);
		
		
		

	}

}
