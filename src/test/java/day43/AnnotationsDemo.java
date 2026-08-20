package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
1) Login --@BeforeMethod
2) search-- @Test
3) Logout-- @AfterMethod
4) Login
5)Advanced Search-- @Test
6)Logout

*/
public class AnnotationsDemo {
	
	@BeforeMethod
	void login()
	{
		System.out.println("This is Login..");
	}
	@Test
	void search()
	{
		System.out.println("this is search..");
	}
	
@Test
void adavncedsearch()
 {
		System.out.println("this adavanced search...");
 }

@AfterMethod
void logout()
{
System.out.println("this is logout..");		
	}

}
