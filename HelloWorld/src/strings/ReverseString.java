package strings;
import java.util.Scanner;


public class ReverseString {
//a. Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String original,reverse="";
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	original= in.nextLine();
	in.close();
	int length =original.length();
	
	for (int i=length-1;i>=0;i--){
		reverse=reverse+original.charAt(i);
		
	}
	System.out.println("Reversed string is "+ reverse);
	}
	

	}


