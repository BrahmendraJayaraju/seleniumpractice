package myown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg58 {

	public static void main(String[] args) throws InterruptedException {
		

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		
		JavascriptExecutor jse=(JavascriptExecutor)c;
		
		
		
			String scrolldown="window.scrollBy(0,1000)";
			
		
		
		jse.executeScript(scrolldown);
		
		Thread.sleep(2000);
		
		

String scrollup="window.scrollBy(0,-1000)";
			
		//window.scrollTo(1000,0);
		
		jse.executeScript(scrollup);
		
		
		
		
	}

}
