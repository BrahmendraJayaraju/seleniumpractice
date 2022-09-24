package myown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg27 {

	public static void main(String[] args) throws InterruptedException {
		
		
	
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		c.get("https://www.actitime.com/free-online-trial");
		
		
	WebElement a1=	c.findElement(By.xpath("//a[.='Try Free']"));
		a1.click();
		
		
		
		c.findElement(By.id("First Name")).sendKeys("brahmendra");
		
		c.findElement(By.id("Last Name")).sendKeys("jayaraju");
		
		
		Thread.sleep(2000);
		
		
		c.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
