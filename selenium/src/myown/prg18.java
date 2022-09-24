package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg18 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("https://www.facebook.com/");
		
		
	WebElement a1=	c.findElement(By.cssSelector("input[type='text']"));
		
		
	Point p1=	a1.getLocation();
		
		int x=p1.getX();
		
Point p2=	a1.getLocation();
		
		int y=p2.getY();
		
	System.out.println("the x axis is " +x);	
		
	System.out.println("the y axis is " +y);	
		
		
		Dimension d1=a1.getSize();
		
		int h=d1.getHeight();
		
Dimension d2=a1.getSize();
		
		int w=d2.getHeight();
		
		System.out.println("the h is " +h);	
		
		System.out.println("the w  is " +w);
		
		
		
		
	String t=	a1.getTagName();
		
	System.out.println("the tagname is " +t);	
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
