package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg23 {

	public static void main(String[] args) throws InterruptedException {
		
		

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		c.findElement(By.xpath("//a[.='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		
	c.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		
		
	WebElement a2=c.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
	boolean v=a2.isSelected();
	
	
		
		if(v)
		{
			System.out.println("selected");	
		}
		
		else
		{
			System.out.println("not selected ");	
		}
		

	}

}
