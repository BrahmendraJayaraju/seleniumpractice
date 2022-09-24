package myown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg26 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page6.html");
		
		Thread.sleep(2000);
		
	List<WebElement>	l1=c.findElements(By.xpath("//input[@type='checkbox']"));
	
	
	int value1=l1.size();
	
	
	
	System.out.println(value1);
	
	
	for(WebElement a1:l1)
	{
		a1.click();
		Thread.sleep(1000);
	}
	
	
	c.close();
	
	
	
	
	
	
	
	
	
	
	}

}
