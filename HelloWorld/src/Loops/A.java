package Loops;

/*public class A  extends B{
	//int a=0;
	static  inner{
		 int a=10;
		
	}

	public static void main(String[] args) {
		
		A ob=new A();
		Inner b2=ob.new Inner();
		
		// TODO Auto-generated method stub
		
		System.out.println(b2.a);
		

	}

}*/

/* class A{
	///int a=10;
	
	public void xyz(){
		System.out.println("HI");
	}
	public void ab()
	{
		Class Inner
		{
			public Inner()
			{
				xyz();
				
			}
		}
		Inner ob= new Inner();
		
		
	}
	public static void main(String[] args) {
		
		A ob=new A();
		ob.ab();
	}
	}
		/*int b=10;public Inner(){
		 * 
		
	class Inner{
		public Inner()
		{
		System.out.println(b);
		
	    }
	    }
	Inner ob=new Inner();
	*/



/*class A
{
private void xyz()
{
System.out.println("HI");
}
public void ab()
{
class Inner
{
public Inner()
{
xyz();
}
}
Inner ob=new Inner();
}
public static void main(String ar[])
{
A ob=new A();
ob.ab();
}
*/
class A{
	int a=10;
	public void aaa(){
		final int b=15;
		
		 class Inner
		    {
			public Inner()
			{
			
			System.out.print(a);
		      }
	          }
		Inner ob=new Inner();
}
public static void main(String args[])
{
	A ob=new A();
	
	//ob.aaa();
}
		
	}





	
	
	
