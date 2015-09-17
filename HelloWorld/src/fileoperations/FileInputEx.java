package fileoperations;
import  java.io.*;
import java.util.Scanner;

public class FileInputEx {
	
	//Scanner sc=new Scanner();
	
	/*Scanner: Use this class to input 2 integer numbers and sum them.
		--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
		--> DatainputStream: Use this class to input 2 integer numbers and multiply them.
		--> Console: Use this class to input 2 integer numbers and divide them.
		*/

		
		
		public static void main(String args[])
		   {
		      int x, y, z;
		      System.out.println("Enter two integers to calculate their sum ");
		      Scanner in = new Scanner(System.in);
		      x = in.nextInt();
		      y = in.nextInt();
		      z = x + y;
		      System.out.println("Sum of entered integers = "+z);
		      
		      
		      
		      
		      
		   }
		// TODO Auto-generated method stub

	}


