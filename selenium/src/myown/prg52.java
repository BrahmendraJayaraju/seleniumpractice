package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prg52 {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page9.html");
		
		
		
		WebElement solu=c.findElement(By.id("l"));

		Actions act=new Actions(c);
		Thread.sleep(2000);
		
		
		
		act.doubleClick(solu).perform();
		
		
		
		
		
		
		
		
		

	}

}
