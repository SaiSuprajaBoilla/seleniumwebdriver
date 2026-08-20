package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPagnationTable {

	private static String status;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();
        
        WebElement username=driver.findElement(By.xpath("//in[ut[@id='input-password']"));
        username.clear();
        username.sendKeys("demo");
        
        WebElement password=driver.findElement(By.xpath("//input-password']"));
        password.clear();
        password.sendKeys("demo");
        
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
        //close Window if it is available
        if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
{
	driver.findElement(By.xpath("button[@class='btn-close']")).click();
}

driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();  //customer main menu
driver.findElement(By.xpath("//u1[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

//Showing 1 to 10 of 19081 (1909 pages)
String text=driver.findElement(By.xpath("//div[contains(text(),'pages')]")).getText();

int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));

//repating pages
for(int p=1;p<=total_pages;p++)
{
	
	if(p>1)
	{
		WebElement active_page=driver.findElement(By.xpath("//ul@class='pagination']//*[text()="+p+"]"));
		active_page.click();
		Thread.sleep(3000);
	}
	
	//reading data from the page 
	
	int noOfRows=driver.findElements(By.xpath("//table[@class='table table-boarded table-hover']//tbody//tr")).size();
	
	for(int r=1;r<=noOfRows;r++)
	{
		String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
		String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
		driver.findElement(By.xpath("//table[@class='table table-boarded table-hover']//tbody//tr["+r+"]/td[5]")).getText();
		
		System.out.println(customerName+"\t"+email+"\t"+status);
		
	}
}
}
	}


