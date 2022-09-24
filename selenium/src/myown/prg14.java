package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg14 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page44.html");
		
		WebElement link=c.findElement(By.id("log"));
		
		link.click();
		
		
		
		c.navigate().back();
		
		
		Thread.sleep(3000);
		
		link.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		
		WebElement sub=c.findElement(By.id("log"));
		
		sub.submit();
		
		
		
		
		
		

	}

}
