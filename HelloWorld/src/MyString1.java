
public class MyString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
				String s1="YES";
						String s2="YES";
					if (s1==s2)	System.out.println("equal");
					String s3= new String ("YES");
					String s4= new String("YES");
					if (s3==s4) System.out.println("s3 eq s4");
					String str ="Prashanthi";
					System.out.println(str.charAt(3));
					System.out.println(str.concat("   Rao "));
					
					boolean retVal;
					retVal= str.endsWith("   Rao");
					
					
					System.out.println("endsWith"+' '+retVal);
					/*else 
						System.out.println("Not ends  with Rao");
						*/
						
					
				int strarray1 []= {1,2,3,4,5};
				System.out.println(strarray1[0]+" index 0");
				
				String str5="Hello";
				String str6=new String ("Hello");
				System.out.println("str5 is "+ str5+" hashcode is "+str5.hashCode());
				System.out.println("str6 is "+ str6+" hashcode is "+str6.hashCode());
				str5="Hello World";
				
				System.out.println("str5 is "+ str5+" hashcode is "+str5.hashCode());
				System.out.println("str5 index of l is "+ str5.indexOf('l'));

				System.out.println("str5 compare to is "+ str5.compareTo("Hello World"));
				System.out.println("str5 compare to is "+ str5.compareTo("Hello World Shanthi"));
				System.out.println("str5 compare to is "+ str5.compareTo("Hello Wor"));
				System.out.println("str5 lowercase "+ str5.toLowerCase());
				System.out.println("str5 uppercase "+ str5.toUpperCase());
				
				
				
				int[] numbers = {2,6,8,4,10,12};

		        int largest = Integer.MIN_VALUE;

		        

		        for(int i =0;i<numbers.length;i++) {

		            if(numbers[i] > largest) {

		                largest = numbers[i];
		                
		                System.out.println("largest is "+largest);

		     }

		        }

		        System.out.println("Largest number in array is : " +largest);

//int[] numbers4 =new int[5];
			 //numbers4  ={1,2,3,4};
			
		    //numbers4 ={1,2,3,4};

	
	int[] numbers1 = {6,4,2,8,10,12};
	
		        int smallest = Integer.MAX_VALUE;
	
		        //System.out.println("smallest is "+smallest);
	
		        for(int i =0;i<numbers1.length;i++) {
	
		            if(smallest > numbers1[i]) {
	
		                smallest = numbers1[i];
		                System.out.println("smallest is "+smallest);
	
		            }

		        }
	
		         

		        System.out.println("Smallest number in array is : " +smallest);
	
		}

	
}


