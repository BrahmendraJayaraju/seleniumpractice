package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prg53 {

	public static void main(String[] args) throws InterruptedException {
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://jqueryui.com/droppable/");
		Thread.sleep(4000);
		
		
		WebElement source=c.findElement(By.id("draggable"));
		
		WebElement dest=c.findElement(By.id("droppable"));
		
		

		Actions act=new Actions(c);
		
		
		
		
		act.dragAndDrop(source,dest).perform();
		
		
		//act.clickAndHold(source).moveToElement(dest).click().perform();
	}

}
