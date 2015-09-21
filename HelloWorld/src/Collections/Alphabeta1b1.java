package Collections;
import java.util.*;


public class Alphabeta1b1 {

	public static void main(String[] args) {
		// TODO Auto-generat
		//program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn and produces output as a1,b1,a2,b2,a3,b3.......,an,bn

		
		Set <String > set1=new TreeSet<String>();
		//
		Scanner scan=new Scanner(System.in);
		
		scan.nextLine();
		Iterator it=set1.iterator();
		
		//int arr[]=(a1,a2,a3,a4,b1,b2,b3,b4};
		
		int interleave(int arr[], int len) {
			  int n = len/2;
			  for (int i = 1; i < n; i++) { // my step no.
			    for (int j = 0; j < i; j++) { // no. of swaps
			      swap(arr, n-i+2*j, n-i+2*j+1);
			    }
			  }
			}
	}
		
		
		
	}


