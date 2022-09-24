package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg9 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
		
		ChromeDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page3.html");
		
		c.findElement(By.id("gg")).click();
		
		
		c.navigate().back();
		
		Thread.sleep(1000);
		
		c.findElement(By.name("fp")).click();
		
		
		c.navigate().back();
		Thread.sleep(1000);
		
		
		c.findElement(By.className("abc")).click();
		
		c.navigate().back();
		Thread.sleep(1000);
		
		
		c.findElement(By.tagName("a")).click();
		
		c.navigate().back();
		Thread.sleep(1000);
		
		
c.findElement(By.linkText("Forgot password??")).click();
		
		c.navigate().back();
		Thread.sleep(1000);
		
		
		
		
c.findElement(By.partialLinkText("Inbox")).click();
		
		
		
		
		
		
		c.quit();
		
		
		
		
		
		
		
		

	}

}
