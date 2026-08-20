package day43;

import org.testng.annotations.AfterClass; 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/*
1) Login --@Beforeclass
2) search-- @Test
5)Advanced Search-- @Test
6)Logout-- AfterClass

*/
public class AnnotationsDemo2 {

	
		@BeforeClass
		void login()
		{
			System.out.println("This is Login..");
		}
		
		

	@AfterClass
	void logout()
	{
	System.out.println("this is logout..");		
		}

	@Test(priority=1)
	void search()
	{
		System.out.println("This is search..");
	}
	
	@Test(priority=2)
	void adavancedsearch()
	{
		System.out.println("this advanced search...");
	}


}
