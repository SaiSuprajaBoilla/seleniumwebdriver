package day42;


import org.testng.annotations.Test;

/*
 1) Open app
 2) Login
 3) Logout
  
 */

//   -4 -5-3 -2 -1 0 1 2 3 4 5

public class FirstTestCase {
	@Test(priority=1)
	
	void openapp()
	{
		System.out.println("openig application..");
	}
	
	@Test(priority=2)
	
	void login()
	{
		System.out.println("Login to application...");
		
	}
	
	@Test(priority=3)
	
	void logout()
	{
		System.out.println("Logout from application...");
		
	}

}
