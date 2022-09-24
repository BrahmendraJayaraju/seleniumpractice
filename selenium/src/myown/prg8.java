package myown;

import org.openqa.selenium.chrome.ChromeDriver;

public class prg8 {

	public static void main(String[] args) throws InterruptedException {
		
		

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
		
		ChromeDriver c=new ChromeDriver();

		c.get("https://chromedriver.chromium.org/downloads");
		
		
		c.get("https://www.youtube.com/");
		
		
		Thread.sleep(5000);
		c.quit();
		
		

	}

}
