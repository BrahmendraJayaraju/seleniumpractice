package frm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class prg93 {

	
	@Test
	public void testA() throws InterruptedException
	{
	String key="webdriver.chrome.driver";
	String value="./drivers/chromedriver.exe";
	
	
	
	System.setProperty(key,value);
     WebDriver c=new ChromeDriver();
	
	c.manage().window().maximize();

	c.get("https://www.actitime.com/");
	
	Thread.sleep(2000);
	
	String atitle=c.getTitle();
	
	String etitle="actiTIME - Time Tracking Software for Smart Team";
	
	
	SoftAssert sa=new SoftAssert();
	
	
	sa.assertEquals(atitle,etitle);
	
	
	c.close();
	

	
	}
}
