package TestNGB9;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGenabledDisabled {
	
	
	@Test(enabled=false)
	public void myTest11(){
		System.out.println("I am in test 1");
	}
	
	@Test(enabled=true)
	public void myTest22(){
		System.out.println("I am in test 2");
	}
	
	@Test()
	public void myTest3(){
		System.out.println("I am in test 3");
	}

}
