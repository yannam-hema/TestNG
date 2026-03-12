package basicPractice;

import org.testng.annotations.Test;

public class Exp {
	@Test(priority = 3)
	public void aTest(){
	System.out.println("A Test");
	}

	@Test(priority = 1)
	public void bTest(){
	System.out.println("B Test");
	}

	@Test(priority = 2)
	public void cTest(){
	System.out.println("C Test");
	}
}
