package Collections;
import java.util.*;

public class ListDupEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5b. Write a program to find duplicates in an array using set.
		
		//int[] arr={1,2,2,4,5,6,};
		//TreeSet ts=new Set();
		
		int[] arrayOfInt = { 1, 2, 3, 5, 1, 2, 7, 8, 9, 10 };
		Set<Integer> notDupes = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();
		for (int i = 0; i < arrayOfInt.length; i++) {
		    if (!notDupes.contains(arrayOfInt[i])) {
		        notDupes .add(arrayOfInt[i]);
		        continue;
		    }
		    duplicates.add(arrayOfInt[i]);
		}
		System.out.println("num of dups:" + duplicates.size());
		System.out.println("num of norls:" + notDupes.size());
		System.out.println("dup numbers are:" + duplicates);
		System.out.println(" norls numbers are:" + notDupes);

		
		

	}

}


