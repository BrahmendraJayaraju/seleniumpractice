package myown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg62 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(11000);
		
		
		Alert a=c.switchTo().alert();
		
		
		
		String t=a.getText();
		System.out.println(t);
		
		
		
		Thread.sleep(2000);
		
		
		a.accept();
		
		

	}

}
