package Loops;

public class Largest {

	
		// TODO Auto-generated method stub
	public static int findLargest(int[] arr)
	{
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34,10,56,78,100};
		int maximum = findLargest(arr);
		System.out.println("The largest number in array is " + maximum);

	}

}
