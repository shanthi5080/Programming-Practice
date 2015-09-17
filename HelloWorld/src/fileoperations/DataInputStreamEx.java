package fileoperations;
import java.io.*;
import java.util.*;



public class DataInputStreamEx {
	
	
	DataInputStream dis = new DataInputStream(System.in);
	/* String s = dis.readLine(); 
	 * DataInputStream.readLine() has been deprecated 
	 * to get String value you need to use BufferedReader class
	 */
	int i = dis.readInt();

	//using Console class:

	Console console = System.console();
	String s = console.readLine();
	int i = Integer.parseInt(console.readLine());

}
