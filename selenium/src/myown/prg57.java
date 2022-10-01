package myown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg57 {

	public static void main(String[] args) throws InterruptedException {
	
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page10.html");
		Thread.sleep(2000);
		
		
		JavascriptExecutor jse=(JavascriptExecutor)c;
		
		
		
		
		String sendkeys="document.getElementById('n').value='canada'";
		
		
		
		
		jse.executeScript(sendkeys);
		
		
		
		
		Thread.sleep(1000);
		
		
		
String clr="document.getElementById('n').value=''";
		
		
		
		
		jse.executeScript(clr);
		
		

		Thread.sleep(1000);
		
		
String clk="document.getElementById('fb').click()";
		
		
		
		
		jse.executeScript(clk);
		
		

	}

}
