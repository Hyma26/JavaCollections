package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArraytoArrayList {

	public static void main(String[] args)
	{
		
		//to convert array to arraylist
		String arr[]= {"Dog","Cat","Pig"};
		for(String value:arr) 
		{
          System.out.println(value);
	    }
		
		ArrayList ar = new ArrayList(Arrays.asList(arr));
		System.out.println(ar);
}

}
