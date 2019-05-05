package TestNGB9;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGCompleteRun {
	
	
	@BeforeClass
	public void myBeforeClass(){
		System.out.println("I am in before class");
	}
	@AfterClass
	public void myAfterClass(){
		System.out.println("I am in After class");
	}
	@BeforeMethod //Junit compatability  it is like @Test
	public void startBrowser(){
		System.out.println("I am in before method");
	}
	@AfterMethod
	public void closeBrowser(){
		System.out.println("I am in After method");
	}
	@BeforeTest
	public void myBeforeTest(){
		System.out.println("I am in before Test");
	}
	@AfterTest
	public void myAfterTest(){
		System.out.println("I am in After Test");
	}
	@Test	
	public void test1(){
		System.out.println("I am in Test 1");
	}
	@Test	
	public void test2(){
		System.out.println("I am in Test 2");
	}
	
	@BeforeSuite
	public void myBeforeSuite(){
		System.out.println("I am in before suite");
	}
	@AfterSuite
	public void myAfterSuite(){
		System.out.println("I am in After suite");
	}


}
