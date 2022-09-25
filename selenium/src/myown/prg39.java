package myown;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prg39 {

	public static void main(String[] args) {
		
		

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page8.html");
		
		
		WebElement hotel=c.findElement(By.id("empire"));
		
		Select s=new Select(hotel);	
		
		List<WebElement>  alloption=s.getOptions();
		
		

		HashSet<String>  hs=new HashSet<>();
		
		for(WebElement option:alloption)
		{
			
			
			String a1=option.getText();
			
			hs.add(a1);
			
			
		}
		
		
		
		
		
		
		
		
		

		for(String hs1:hs)
		{
			System.out.println(hs1);
		}
		
		
		

	}

}
