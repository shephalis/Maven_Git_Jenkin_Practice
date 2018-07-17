 package practice_JAVA;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Array_Copy_to_AnotherArray {

	@Test
	public void copyArrays(){

		int arr1[]=new int[]{10,20,30,50,70};
		
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("Numbers of array elements");
		int n=sc.nextInt();
		
		int arr1[]=new int[n];
		
		System.out.print("Enter elements :");

		
		for(int i=0;i<n;i++)
		{
			 arr1[i]=sc.nextInt();
		}
		*/
		int arr2[]=new int[arr1.length];  //n=arr1.length

		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		//	arr2[i]=arr1[n-1-i]; //to REVERSE the output in arr2
		}
		System.out.println("After copying the array is :");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		//sc.close();
	}

}
