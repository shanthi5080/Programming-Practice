package fileoperations;
import java.io.*;

public class BufferedReaderEx {

	
	int x;
    int y;
    int total;

     void sub ()
    {
        total = x-y;
    }

		
		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    public static void main(String[]args)throws IOException
	    {


	        //mathclass math1 = new mathclass();

	        System.out.print("Enter 1st Number :");
	        int num1 = Integer.parseInt(br.readLine());
	        System.out.println(" ");

	        System.out.print("Enter 2nd Number :");
	        int num2 = Integer.parseInt(br.readLine());
	        System.out.println(" ");

		// TODO Auto-generated method stub
	        BufferedReaderEx bre =new BufferedReaderEx();
	        
	       //bre.sub();
	        {
	            System.out.print("Difference : ");
	            //System.out.println(bre.total);
	            System.out.println(num1-num2);
	            
	        }

	}

}
