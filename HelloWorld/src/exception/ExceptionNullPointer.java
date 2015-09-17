package exception;

public class ExceptionNullPointer {

	public static void main(String[] args) {
		
		
		

		
				// TODO Auto-generated method stub

				String str = null ; 
				try{

				System.out.println("Get the Length of the String"+str.length()); // Null pointer Exception . 
				}
				catch(NullPointerException ne)
				{
					System.out.println("Null Pointer Exception");
				}

		// TODO Auto-generated method stub

	}

}
