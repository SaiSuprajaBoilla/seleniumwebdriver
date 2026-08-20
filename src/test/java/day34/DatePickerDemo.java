package day34;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	//select future date
	
	static void selectFutureDate(WebDriver driver,String year,String month,String date)
	{
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month
			
		String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();  //actual Year
		
		if(currentMonth.equals(month) && currentYear.equals(year))
		{
			break;
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
		//driver.findElement(By.xpath("//span[class@='ui-icon ui-icon-circle-triangle-w']")).click();//previous
		}
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calender']//tbody//tr/td//a"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	


			
}
	
	//select past data
	
	static void selectpastDate(WebDriver driver,String year,String month,String date)
	{
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month
			
		String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();  //actual Year
		
		if(currentMonth.equals(month) && currentYear.equals(year))
		{
			break;
		}
		
	
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous
		}
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calender']//tbody//tr/td//a"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	


			
}

	public static void main(String[] args) {
		 

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//Method1: using SendKeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/29/2026"); //mm/dd/yyyy

		//Method2: using date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();  //opens date picker
		String year="2022";
		String month="May";
		String date="10";
		
		
		
		//selectFutureDate(driver,year,month,date);
		selectpastDate(driver, year,month,date);
		
		
		}
		
		
		
					
					
				
	}

