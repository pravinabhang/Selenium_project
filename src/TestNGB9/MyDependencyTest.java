package TestNGB9;

import org.testng.annotations.Test;
import org.testng.Assert;


public class MyDependencyTest {
	
	@Test
	public void mySetup() throws InterruptedException{
		System.out.println(" in setup ");
		Assert.assertTrue(false);
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods={"mySetup"})//if test cases are dependent on each other use this to save time
	public void test() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("my test method");
	}
}
