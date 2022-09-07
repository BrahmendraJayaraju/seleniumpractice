package myown;

import org.openqa.selenium.chrome.ChromeDriver;

public class prg1 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		System.setProperty(key, value);
ChromeDriver c=new ChromeDriver();

c.get("https://chromedriver.chromium.org/downloads");
Thread.sleep(2000);

c.close();


	}

}
