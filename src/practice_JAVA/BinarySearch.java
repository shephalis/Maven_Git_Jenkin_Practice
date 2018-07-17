package practice_JAVA;

import org.testng.annotations.Test;

public class BinarySearch {

	@Test
	public void binarySearch() {
		
		int arr[]=new int[]{10,20,30,40,50,60};
		int search=20;
		
		int first=0;
		int last=arr.length-1;
		int mid=(first+last)/2;
		
		
		while(arr[first]<=arr[last])
		{
			if(search<arr[mid]) 
			{
				last=mid-1;
			}
			else if(search==arr[mid])
			{
				System.out.println("found the search at "+mid+ " index ");
			break;
			}
			else if(search>arr[mid])
			{
				first=mid+1;
			}
			mid=(first+last)/2;
		}
		if(arr[first]>arr[last])
		{
			System.out.println(search+ " is not present.");
		}
		
	
	}
	

}
