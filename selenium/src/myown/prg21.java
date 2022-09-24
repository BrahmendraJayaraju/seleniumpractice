package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg21 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page44.html");
		
		
	WebElement a1=	c.findElement(By.id("/n"));
		
		
		
		Thread.sleep(2000);
		
	Boolean v=	a1.isEnabled();
		
		if(v)
		{
			System.out.println("enable");	
		}
		
		else
		{
			System.out.println("disable");	
		}
		
		

	}

}
