package TestNGB9;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PriorityTest {
	
	String userName;
	
	@Test (priority = 1)
	public void login1(){
		System.out.println("I am in test 2");
	}
	
	@Test (priority = 2)
	public void login(){
		System.out.println("I am in test 2");
	}
	
	@Test (priority = 3)
	public void createU(){
		System.out.println("I am in test 1");
		//create user
		userName= "Anil_timestamp" ;
	}
	
	@Test (priority = -1)//it acceptable and takes highest priority
	public void aaa(){
		System.out.println("I am in test 2");
		//update user
		String updateUser = userName;
	}
	
	@Test //if no priority it takes as 0.automatically
	public void adeleteU(){
		System.out.println("I am in test 2");
	}
	
	@Test (priority = 6)
	public void bdeleteU(){
		System.out.println("I am in test 2");
	}
	
	@Test (priority = 6)//if no priority for all scripts and same priority for multiple scripts it takes alphabatically. 
	public void createG(){
		System.out.println("I am in test 2");
	}

}
