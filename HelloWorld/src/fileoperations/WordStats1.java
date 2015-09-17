package fileoperations;
import java.util.*;
import java.io.*;

public class WordStats1 {
	public static void main(String[] args) {
	    try {

	        //Scanner input = new Scanner(new FileReader("C:\Shanthi-Apr-2015\Innovapath\Innovapath\data.txt"\"));
	       
	        PrintWriter output = new PrintWriter(new FileOutputStream("src\newfile.txt"));

	        int lineNum = 0;
	        int wordCount = 1;
	        int charCount = 0; 

	        while (input.hasNextLine()) {
	            String line;
	            line = input.nextLine();

	            //output.println(lineNum + ": " + line);

	            lineNum++;

	            String str [] = line.split((" "));
	              for ( int i = 0; i <str.length ; i ++) {
	                if (str [i].length() > 0) {
	                  wordCount ++; 
	                }
	              }
	              charCount += (line.length());

	        }

	        System.out.println(lineNum);
	        System.out.println(wordCount); 
	        System.out.println(charCount); 
	        input.close();
	        output.close();

	        System.out.print("File written.");

	    }

	    catch (FileNotFoundException e) {
	        System.out.println("There was an error opening one of the files.");
	    }
	}
}

