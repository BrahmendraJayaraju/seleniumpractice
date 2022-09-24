package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg22 {

	public static void main(String[] args) {
		
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page44.html");
		
		
	WebElement a1=	c.findElement(By.id("/n"));
	
	WebElement a2=	c.findElement(By.id("mn"));
	
	
String s1=	a1.getAttribute("type");
	
	a2.sendKeys(s1);

	}

}
