package strings;
import java.util.*;
//Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".
public class StringNumLoop {
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original =" ";
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the sentence");
		original=in.nextLine();
		
		String [] str =original.split(" " );
		int lenght1=str.length;
		
		in.close();
				
				for (int j=0;j<lenght1;j++)
						{
							System.out.println(str[j]+j);
				     }

	            }
}