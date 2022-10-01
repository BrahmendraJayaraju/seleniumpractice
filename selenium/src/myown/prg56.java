package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prg56 {

	public static void main(String[] args) throws InterruptedException {
	

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://www.actitime.com/");
		Thread.sleep(2000);
		
		
		WebElement source=c.findElement(By.xpath("//img[@alt='actiTIME logo']"));
		
		
		
		
		
Actions act=new Actions(c);
		
		
		
		act.sendKeys(Keys.CONTROL).click().perform();
		
		
		
		
		
		
		
		

	}

}
