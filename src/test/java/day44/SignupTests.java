package day44;

import org.testng.annotations.Test;

public class SignupTests {
	
	@Test(priority=1,groups= {"regression"})
	void signupemail()
	{
		System.out.println("this is signup by emAIL...");
	}
	@Test(priority=1,groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("this is signup by facebook...");
	}
	@Test(priority=1,groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("this is signup by twitter...");
	}

}
