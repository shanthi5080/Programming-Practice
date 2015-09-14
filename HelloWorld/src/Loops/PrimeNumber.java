package Loops;
import java.util.*;


public class PrimeNumber {
	
	
	
	    public static void main(String[] args) 
	    {
	    
	   // double  x=Math.sqrt(25);
	    //System.out.println(x);
	   // System.out.println(x);
	 
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Please enter a number: ");
	        int num = scanner.nextInt();
	        //scanner.close();
	        PrimeNumber primeNum = new PrimeNumber();
	        scanner.close();

	        if ( primeNum.isPrime(num) ) {
	            System.out.printf("\n Result: The number %d is Prime", num);
	        } else {
	            System.out.printf("\n Result: The number %d is not Prime", num);
	        }
	    }
	 
	   // double  x=Math.sqrt(25);
	    //System.out.println(x);
	    //System.out.println(x);
	    // Method to check whether the number is prime or not
	    public boolean isPrime(int num) {
	        if ( num < 2 ) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if ( num % i == 0 ) {
	                return false;
	            }
	        }
	        return true;
	    }
}


