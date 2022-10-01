package myown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prg55 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("");
		Thread.sleep(4000);
		
		
		WebElement source=c.findElement(By.id("draggable"));
		
		
		
		
		
Actions act=new Actions(c);
		
		
		
		
		act.contextClick(source).perform();
		
		Robot r=new Robot();
		
		
		r.keyPress(KeyEvent.VK_W);
		
		r.keyRelease(KeyEvent.VK_W);

	}

}
