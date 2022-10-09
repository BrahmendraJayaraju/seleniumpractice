package myown;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class prg28 {

	public static void main(String[] args) {
	

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://www.actitime.com/free-online-trial");
		
		
	WebElement a1=	c.findElement(By.xpath("//a[.='Try Free']"));
		a1.click();
		
	
		
		
	String etitle="Free Timesheet Online Trial";
	
	WebDriverWait wait=new WebDriverWait(c,Duration.ofSeconds(30));
		
	
	
	try
	{
		
		wait.until(ExpectedConditions.titleIs(etitle));
		
		System.out.println("pass");
		
	}
	
	catch(Exception e)
	{
		System.out.println("fail");
		
	}
	
	
	
	
	
		
		c.close();
		
		
		
		
		
		
		
		

	}

}
