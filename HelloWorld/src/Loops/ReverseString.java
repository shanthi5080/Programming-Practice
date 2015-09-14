package Loops;

import java.util.Scanner;

public class ReverseString {




	   public static void main(String args[])
	   {
	      String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse");
	      original = in.nextLine();
	      
	      System.out.println("original is "+ original);
	 in.close();
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 1 ; i-- ){
	         reverse = reverse + original.charAt(i);//o//o+l//ol+l//oll+e//olle+h//olleh//
	      }
	 
	     System.out.println("Reverse of entered string is: "+reverse);
	   }
	

}
