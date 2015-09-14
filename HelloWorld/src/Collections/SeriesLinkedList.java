package Collections;
import java.util.*;

import javax.print.DocFlavor.STRING;

public class SeriesLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//c. Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
  		/*d. Write a program having below methods.
  			--> To create a hashmap.
  			--> To search for a key in the created map and then returns its value			*/
		
		LinkedList<String> ll =new LinkedList<String>();
		
ll.add("a1");
ll.add("a2");
ll.add("a3");
ll.add("b1");
ll.add("b2");
ll.add("b3");

ListIterator<String> it=ll.listIterator();
while (it.hasNext())
System.out.println(it.next());
//.out.println(ll.sort());

	}

}
