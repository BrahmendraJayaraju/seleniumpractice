package myown;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg48 {

	public static void main(String[] args) {
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("file:///C:/Users/brahm/OneDrive/Desktop/page8.html");
		
		
		TakesScreenshot t=(TakesScreenshot)c;
		
		File src=t.getScreenshotAs(OutputType.FILE);
		
		
		File dest=new File("./images/screenshot1.png");
		
		
		
	//FileUtils.copyFile(src,dest);
		
		
		
		c.quit();
		
		
		
		
		
		
		
		
		
		

	}

}
