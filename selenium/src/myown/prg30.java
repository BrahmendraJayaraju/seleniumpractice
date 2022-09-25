package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prg30 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		
		
		
		
		
		
		
		

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page8.html");
		
		
		WebElement hotel=c.findElement(By.id("empire"));
		
		Select s=new Select(hotel);
		
		
		Thread.sleep(2000);
		
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		s.selectByValue("p");
		Thread.sleep(2000);
		s.selectByVisibleText("fish");
		Thread.sleep(2000);
		
		
		s.deselectByIndex(1);
		
		Thread.sleep(2000);
		s.deselectByValue("p");
		
		Thread.sleep(2000);
		s.deselectByVisibleText("fish");
		
		Thread.sleep(2000);
		
		c.quit();

	}

}
