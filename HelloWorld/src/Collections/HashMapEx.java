package Collections;

import java.util.*;
public class HashMapEx {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		/* Write a program having below methods.
			--> To create a hashmap.
			--> To search for a key in the created map and then returns its value.
			*/

	// Create a hash map
		      HashMap hm = new HashMap();
		      // Put elements to the map
		      hm.put("Nitya", new Double(3434.34));
		      hm.put("Supriya", new Double(123.22));
		      hm.put("Bharti", new Double(1378.00));
		      hm.put("Divya", new Double(99.22));
		      hm.put("Shilpi", new Double(-19.08));
		      
		      if(hm.containsKey("Nitya"))
		    	  System.out.println(hm.get("Nitya"));
		      
		      // Get a set of the entries
		      Set set = hm.entrySet();
		      // Get an iterator
		      Iterator i = set.iterator();
		      // Display elements
		      while(i.hasNext()) {
		         Map.Entry me = (Map.Entry)i.next();
		         System.out.print(me.getKey() + ": ");
		         System.out.println(me.getValue());
		      }
		      
		      
		      
		      //System.out.println();
		      // Deposit 1000 into Zara's account
		     // double balance = ((Double)hm.get("Zara")).doubleValue();
		      //hm.put("Zara", new Double(balance + 1000));
		     // System.out.println("Zara's new balance: " +
		     // hm.get("Zara"));
		   }
		

	}

