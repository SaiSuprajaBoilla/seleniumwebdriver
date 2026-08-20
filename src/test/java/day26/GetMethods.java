package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//get(url)- opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		//getTitle() -returns title of the page
		System.out.println(driver.getTitle());  //OrangeHRM
		
		//getCurrentURL() - return URL of the page
		System.out.println(driver.getCurrentUrl()); // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		

		//getPageSource() - return source code of the page
	   //System.out.println(driver.getPageSource());	
	
	    //getWindowHandle() - returns Id of the single Browser 	window
		//String windowid=driver.getWindowHandle();
		//System.out.println("Window ID:"+ windowid); //232A3E2175D3F1617923CC75E11FE6E6
	                                                 //42BB1A455AAF3E3D37293DB617A4A228
		
		//getWindowHandles() - return ID's of the multiple browser windows
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will opens new browser window
		
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);  //[8AAFB8004E7B0A3C83A4940BCB851816, 287C87A4660CE34F0A0B43081F13EA62]
		
	}
	

}
