package practice_JAVA;

import org.testng.annotations.Test;

public class BasicJavaConcepts {

	@Test(priority=1)
	public void printA(){
		
		double a=2/3;
		System.out.println(a);
	}
	
	@Test(priority=0)
	public void printB(){
	int b= (int)3.0/3;
		System.out.println(b);
		
		
	}

}
