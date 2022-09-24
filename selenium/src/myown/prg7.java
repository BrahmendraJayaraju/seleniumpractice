package myown;

import org.openqa.selenium.chrome.ChromeDriver;

public class prg7 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
		
		ChromeDriver c=new ChromeDriver();

		c.get("https://chromedriver.chromium.org/downloads");
		
		Thread.sleep(2000);
		
		c.navigate().to("https://www.google.co.in/");
		Thread.sleep(2000);
		
		c.navigate().forward();
		Thread.sleep(2000);
		c.navigate().back();
		
		Thread.sleep(2000);
		
		
		c.navigate().refresh();
		
		
		
		
		
		
		

	}

}
