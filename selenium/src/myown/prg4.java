package myown;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class prg4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("enter the browser");
		
		Scanner sc=new Scanner(System.in);
		
	String browser=	sc.nextLine();
		
		
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("ch"))
				{
			
			String key="webdriver.chrome.driver";
			String value="./drivers/chromedriver.exe";
			
			
			System.setProperty(key, value);
	
			driver=new ChromeDriver();
			
			
			
			
				}
		
		else if(browser.equalsIgnoreCase("ms"))
		{
			
			String key="webdriver.edge.driver";
			String value="./drivers/msedgedriver.exe";
			
			
			System.setProperty(key, value);
			
			
			driver=new EdgeDriver();
			
			
			
		}
		
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
