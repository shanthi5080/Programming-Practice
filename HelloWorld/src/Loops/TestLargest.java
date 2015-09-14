package Loops;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLargest {
	    

		
	
		
		@Test
		public void testPositiveNumbers(){
		
			int[] arr = {2,3,45,34,13};
			int actual = Largest.findLargest(arr);
			Assert.assertEquals(actual,45);
		}
		
		@Test
		public void testNegativeNumbers(){
		
			int[] arr = {-2,-3,-45,-34,-13};
			int actual = Largest.findLargest(arr);
			Assert.assertEquals(actual,-2);
		}
		
		
		
		@Test
		public void testDuplicateNumbers(){
		
			int[] arr = {2,3,45,34,2};
			int actual = Largest.findLargest(arr);
			Assert.assertEquals(actual,2);
		}
		
		@Test
		public void testPosNegNumbers(){
		
			int[] arr = {-2,3,45,-34,13};
			int actual = Largest.findLargest(arr);
			Assert.assertEquals(actual,45);
		}
		// TODO Auto-generated method stub

	}


