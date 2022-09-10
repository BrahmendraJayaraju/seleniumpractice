package myown;

import org.openqa.selenium.chrome.ChromeDriver;

public class prg5 {

	public static void main(String[] args) throws InterruptedException {
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		System.setProperty(key, value);
ChromeDriver c=new ChromeDriver();

c.get("https://chromedriver.chromium.org/downloads");
Thread.sleep(2000);

String title=c.getTitle();
System.out.println(title);

String url=c.getCurrentUrl();
System.out.println(url);


String code=c.getPageSource();
System.out.println(code);


c.quit();

	}

}
