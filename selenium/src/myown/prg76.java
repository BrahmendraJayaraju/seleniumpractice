package myown;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg76 {

	public static void main(String[] args) throws InterruptedException {
		
		

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		c.get("https://www.actitime.com/");
		Thread.sleep(2000);
		
		
			c.findElement(By.xpath("//img[@alt='actiTIME logo']")).click();
			
		
		Set<String> a=c.getWindowHandles();
		
		 
		int b=a.size();
		
		
		System.out.println(b);
		
		
	}

}
