package practice_JAVA;

import java.util.Scanner;

import org.testng.annotations.Test;

public class String_To_StringArray_Reverse {

	@Test
	public void stringToArray(){
		// TODO Auto-generated method stub

	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");

		String s = sc.nextLine();

		
*/
		String s="hello are you there";
		System.out.println(s);
		String array[] = s.split(" ");

		for (int i = 0; i <= array.length - 1; i++) {
			char array1[] = array[i].toCharArray();
			String s1 = "";

			for (int j = 0; j <= array1.length - 1; j++) {
				s1 = s1 + array1[array1.length - 1 - j];
			}
			array[i] = s1;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	//	for(int i=array.length-1;i>=0;i--)
		//{
			//System.out.print(array[i]+" ");
		//}
	//	sc.close();
		
}
}