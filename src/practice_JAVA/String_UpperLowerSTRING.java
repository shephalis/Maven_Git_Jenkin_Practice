package practice_JAVA;


import java.util.Scanner;

import org.testng.annotations.Test;

public class String_UpperLowerSTRING {

	@Test
	public void stringUpperLower() {
		/*
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String s=sc.nextLine();
			*/
		
		STring s="heLLO ARe You";
		String arr[]=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			char arr1[]=arr[i].toCharArray();
			
			String s1="";
			for(int j=0;j<arr1.length;j++)
			{
				//This block is for Upper to lower case conversion
				if (arr1[j]>=65 && arr1[j]<=90)
				{ 					
				arr1[j]= (char) (arr1[j]+32);
					s1=s1+arr1[j] ;  
				}
				// This block is for Upper to upper case conversion
				else if(arr1[j]>=97 && arr1[j]<=122)
				{
					arr1[j]=(char)(arr1[j]-32);
					s1=s1+arr1[j];
				}
				else
				{
					s1=s1+arr1[j];
				}
			}
		
			arr[i]=s1;
		} 
		
		
		System.out.println(" reversed string is :");
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(Arrays.toString(arr));
			//System.out.print(arr[i]+" ");
			
			//if u want to print reverse String
			System.out.print(arr[arr.length-1-i]+" ");
		} 
		
	 sc.close();

	}

}
