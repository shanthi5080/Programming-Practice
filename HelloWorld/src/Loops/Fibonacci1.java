package Loops;

public class Fibonacci1 {

	public static void main(String[] args) {
		
		int prev, next, sum, n;
		prev= 1; next=1 ; 
		for(n=1;n<10;n++){
System.out.println(prev); // 1  //  1 // 2  //3 // 5 // 
			
			sum=prev+next; // 2 // 1+2 = 3 // 2 + 3 = 5 // 3 + 5 = 8
			prev=next; // 1  // 2 // 3 // 5 
			next=sum; //  2 // 3 // 5 // 8
			System.out.println("Sum is"+" "+sum);
			
		}
		// TODO Auto-generated method stub

		/* int a=0;
		for(int i=0;i<=5;i++){
			//0,0,1,1,
			a+=i;
			System.out.println("i is " +" "+i);
			System.out.println("a is " +" "+a);
			
			//0,1,2,3,5,8,13,21.
	} */
	
	
	

}
}
