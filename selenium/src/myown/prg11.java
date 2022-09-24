package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg11 {

	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page44.html");
		
		WebElement fn=c.findElement(By.id("fn"));
		
		fn.sendKeys("datascience");
		
		fn.sendKeys(Keys.CONTROL+"AC");
		
		

		
		WebElement middlename=c.findElement(By.id("mn"));
		
		
		
		 middlename.sendKeys(Keys.CONTROL+"V");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
