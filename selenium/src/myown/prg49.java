package myown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg49 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://www.google.com/");
		
		c.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		
				
	List<WebElement>  a1=c.findElements(By.xpath("//div[@class='aajZCb']"));
		
		
		int count=a1.size();
		
		
		System.out.println(count);
		
		
		for(WebElement a2:a1)
		{
			String te=a2.getText();
			System.out.print(te);
			
		}
		
		Thread.sleep(2000);
		
		
		a1.get(count-1).click();
		

	}

}
