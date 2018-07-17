package practice_JAVA;

import org.testng.annotations.Test;

public class Array_HIGHEST_Element {
	
@Test
	public void array_Highest() {
	
		int arr[]=new int[]{10,30,55,87,40,89,5,3,95,21,45};

		int high=arr[0];
				
		for(int i=1;i<arr.length;i++)
			if(arr[i]>high)
			{
			   high=arr[i];   
			 }	
		System.out.println("Highest is "+high);
	}

}
