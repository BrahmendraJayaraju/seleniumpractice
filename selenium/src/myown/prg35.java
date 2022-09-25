package myown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prg35 {

	public static void main(String[] args) {
		
		
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page8.html");
		
		
		WebElement hotel=c.findElement(By.id("empire"));
		
		Select s=new Select(hotel);
		
	ArrayList<String>   a1=new ArrayList<String>();
	
		
		
	List<WebElement>	v1=s.getOptions();
		
		
	int count=v1.size();
		
	System.out.println(count);
	
	
	for(WebElement w1:v1)
	{
	String s2=	w1.getText();
	
	a1.add(s2);
	}
		
		
		Collections.sort(a1);
		
		
		for(String a2:a1)
		{
			System.out.println(a2);
		}
		
		
		
		
		
		c.quit();
		
		
		
		
	}

}
