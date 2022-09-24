package myown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg25 {

	public static void main(String[] args) throws InterruptedException {
	

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page5.html");
		
		Thread.sleep(2000);
		
	List<WebElement>	l1=c.findElements(By.xpath("//a"));
		
	int value1=l1.size();
	
	System.out.println(value1);
	
	
	for(int i=0;i<value1;i++)
	{
		WebElement a1=l1.get(i);
		String text=a1.getText();
		System.out.println(text);
		
	}
		
		
		
		for(WebElement b:l1)
		{
			String text=b.getText();
			System.out.println(text);	
		}
		
		
		
		c.quit();
		
		
	}

}
