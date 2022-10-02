package myown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prg68 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new FirefoxDriver();
		
		c.manage().window().maximize();

		
		c.get("https://www.selenium.dev/downloads/");
		
		
		
		c.findElement(By.xpath("")).click();
		
		Thread.sleep(2000);
		
		
		Robot r=new Robot();
		
		
		r.keyPress(KeyEvent.VK_S);
		
		r.keyRelease(KeyEvent.VK_S);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
