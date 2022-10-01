package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prg51 {

	public static void main(String[] args) throws InterruptedException {
	
		

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://www.manipalhospitals.com/");
		
		String val="//a[@href='hospitals/']";
		
		
		
		WebElement solu=c.findElement(By.xpath(val));
		
		String va2="(//a[.='Mangalore'])[1]";
		
		
		WebElement problems=c.findElement(By.xpath(va2));
		
		
		
		Actions act=new Actions(c);
		
		
		act.moveToElement(solu).perform();
		Thread.sleep(2000);
		
		problems.click();
		
		
		
		
		
		
		
		
		
		

	}

}
