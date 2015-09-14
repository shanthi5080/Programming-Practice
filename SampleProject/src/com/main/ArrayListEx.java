package Collections;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li= new ArrayList<String>();
		
		li.add("one");
		li.add("two");
		li.add("three");
		
		System.out.println("size is  " +li.size());
		
		
		
		/*
		  Write a program having different methods to perform below operations.
		  			--> To create an arraylist and add elements to it.
		  			--> To search for an element in the list.
		  			--> To print the elements of the list using iterator.
		  			--> To print the elements in the reverse order using ListIterator.
		 */
System.out.println( li.get(0));
	
		// Access and print out the Objects
	    for ( int j=0; j<li.size(); j++ )
	      System.out.println("element " + j + ": " + li.get(j) );
	    
	    ListIterator<String> it=li.listIterator();
	    while (it.hasNext())
	    System.out.println(it.next());
	    
	    
			while(it.hasPrevious())
				System.out.println(it.previous());

}

	}


