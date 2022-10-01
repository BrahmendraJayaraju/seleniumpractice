package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg59 {

	public static void main(String[] args) throws InterruptedException {
	
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		
		JavascriptExecutor jse=(JavascriptExecutor)c;
		
		String x1="//img[@alt='BrowserStack']";
		
		
		
		WebElement d=c.findElement(By.xpath(x1));
		
		
		int y=d.getLocation().getY();
		
		
		String scroll="window.scrollBy(0,'"+y+"')";
		jse.executeAsyncScript(scroll);
		
		
		
		
		
		
		

	}

}
