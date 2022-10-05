package myown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg78 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		c.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		prg77 p=new prg77(c);
		
		
		
	p.entername("admin");
	
	p.enterpwd("927323932");
	
	
	p.clicklogin();
		
		
		
		
		
	}

}
