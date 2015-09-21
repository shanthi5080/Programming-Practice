package arrayspractice;

public class CommonNumberInArray {
	
	public static void main(String[] args){
	
	
	int[] numbers1 = {1,2,3,4,5};
	int[] numbers2 ={2,7,8,9,6};
	// TODO Auto-generated method stub

	int common=0;
	
	for(int i=0;i<numbers1.length;i++)
	{
		 for(int j=0;j<numbers2.length;j++)
		 {
			 if(numbers1[i]==numbers2[j])
				
				 common+=numbers1[i];
				 //common++;
				 System.out.println(" the common number is "+common);
				 
				 //continue;
				break;
			 //common=numbers2[j];
			// System.out.println("the numbers2 array " + numbers2[j]);
				 
			 
		 }
			 
// break;
}
}



}
