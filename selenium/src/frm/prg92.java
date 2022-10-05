package frm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class prg92 {
	@Test
	public void testA() throws InterruptedException
	{
	String key="webdriver.chrome.driver";
	String value="./drivers/chromedriver.exe";
	
	
	
	System.setProperty(key,value);
     WebDriver c=new ChromeDriver();
	
	c.manage().window().maximize();

	c.get("https://www.facebook.com/login/");
	
	Thread.sleep(2000);
	
	
	WebElement v=c.findElement(By.xpath("//button[.='Log in']"));
	
	boolean val=v.isDisplayed();
	
	
	Assert.assertTrue(val);
	
	
	}
}
