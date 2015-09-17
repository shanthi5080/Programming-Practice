package Collections;
import java.util.*;

public class MyArrayListArray {
	
	
		 
	    public static void main(String a[]){
	        ArrayList<String> arrlist = new ArrayList<String>();
	        arrlist.add("First");
	        arrlist.add("Second");
	        arrlist.add("Third");
	        arrlist.add("Fourth");
	        System.out.println("Actual ArrayList:"+arrlist);
	        String[] strArr = new String[arrlist.size()];
	        arrlist.toArray(strArr);
	        System.out.println("Created Array content:");
	        for(String str:strArr){
	            System.out.println(str);
	        }
	    }
	}
	


