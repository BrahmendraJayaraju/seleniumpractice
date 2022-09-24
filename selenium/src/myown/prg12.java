package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg12 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("https://www.facebook.com/");
		
		
		c.findElement(By.cssSelector("input[type='text']")).sendKeys("hdwgdwdg");
		
		
		c.findElement(By.cssSelector("input[type='password']")).sendKeys("27832638273");
		
c.findElement(By.name("login")).click();
		
		
		
		
		
		Thread.sleep(3000);
		
		c.quit();
		
		
		
		

	}

}
