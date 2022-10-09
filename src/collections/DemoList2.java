package collections;

import java.util.ArrayList;
import java.util.Collections;

public class DemoList2 {

	public static void main(String[] args)
	{
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("A");
		ar.add("X");
		ar.add("B");
		ar.add("Y");
		ar.add("Z");
		
		System.out.println(ar);
		
		//to add data from one Arraylist to other
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.addAll(ar);
		System.out.println(ar1);
		
		//remove list
		ar1.removeAll(ar);
		System.out.println(ar1);
		
		//collections---sort
		
		System.out.println("Elements in:"+ar);
		
		Collections.sort(ar);
		System.out.println("Elements after sorting:"+ar);
		//reverse order
		Collections.sort(ar,Collections.reverseOrder());
		System.out.println("Elements after sorting reverse order:"+ar);
		//shuffling
		Collections.shuffle(ar);
		System.out.println("Elements after shuffling:"+ar);
		
		
		
		
		
		



	}

}
