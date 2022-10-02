package myown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg64 {

	public static void main(String[] args) throws InterruptedException {
		
		
		

		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page20.html");
		Thread.sleep(4000);
		
c.findElement(By.id("q")).click();
		
		
		
		
		Alert a=c.switchTo().alert();
		
		
		a.sendKeys("datascience");
		
		
		Thread.sleep(2000);
		
		
		
		
		a.accept();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
