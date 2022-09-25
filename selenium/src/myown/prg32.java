package myown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prg32 {

	public static void main(String[] args) throws InterruptedException {
		
		

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page8.html");
		
		
		WebElement hotel=c.findElement(By.id("empire"));
		
		Select s=new Select(hotel);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		s.selectByValue("p");
		Thread.sleep(2000);
		s.selectByVisibleText("fish");
		Thread.sleep(2000);
		
		
		
		
		
	List<WebElement>	opt=s.getAllSelectedOptions();
		
	
	int count=opt.size();
		
		System.out.println(count);
		
		
		for(WebElement w1:opt)
		{
		String s2=	w1.getText();
		
		System.out.println(s2);
		
		
		}
		
		c.quit();
		
		
		
		

	}

}
