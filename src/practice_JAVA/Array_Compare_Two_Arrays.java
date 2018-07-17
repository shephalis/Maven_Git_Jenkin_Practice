package practice_JAVA;

import org.testng.annotations.Test;

public class Array_Compare_Two_Arrays {

	@Test
	public void compare_arrays() {

		int arr1[] = new int[] { 10, 20, 30, 40, 50, 80 };
		int[] arr2 = new int[] { 10, 20, 30, 40, 50, 80 };
		boolean flag = false;

		if (arr1.length != arr2.length) {
			flag = true;
		}
		/*
		 * int count=0; for(int i=0;i<arr1.length;i++) { if(arr1[i]==arr2[i]) {
		 * count++; }
		 * 
		 * } if(count==arr1.length) { System.out.println("Same"); } else {
		 * System.out.println("Not Same"); }
		 */
		// Another logic
		else if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = true;
					break;
				}

			}
		}
		if (flag == true) {
			System.out.println("not Same array");
		} else {
			System.out.println("Identical Arrays");

		}
	}
}
