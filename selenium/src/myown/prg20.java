package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg20 {

	public static void main(String[] args) throws InterruptedException {
		
		
		

		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("https://www.actitime.com/");
		
		
	WebElement a1=	c.findElement(By.xpath("//a[.='Try Free']"));
		
		
		
		Thread.sleep(2000);
		
	Boolean v=	a1.isDisplayed();
		
		if(v)
		{
			System.out.println("present");	
		}
		
		else
		{
			System.out.println("absent");	
		}
		
		
		
		
		
		
		
		

	}

}
