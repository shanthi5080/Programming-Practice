package exception;

public class HandleArithmeticEx {
//b. Write a program containing a function which is expected to throw any kind of exception say NullPointerException or ArithmeticException etc and then handle this function in the parent function which calls this function. 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	int s;
	//int a =1;
 //int b=0;
	//String str=null;
	
 HandleArithmeticEx hae =new HandleArithmeticEx();
 
 try{
 hae.div(1,0);
 }
 catch(ArithmeticException ae){
	 System.out.println("ArithmeticException");
	 
 }
	}
	public  void div(int a,int b){
		int s;
		
		s= a/b;
		//str.length();
		
		
	}
	
	

}
