package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg60 {

	public static void main(String[] args) throws InterruptedException {
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page11.html");
		Thread.sleep(2000);
		
		
		c.findElement(By.id("m")).sendKeys("brahmendra");
		
		
		c.switchTo().frame(0);
		
		c.findElement(By.id("g1")).sendKeys("jayaraju");
		
		
		
		c.switchTo().defaultContent();
		
		c.findElement(By.id("g3")).sendKeys("pall");
		
		
		
		
		
		
		
		
		

	}

}
