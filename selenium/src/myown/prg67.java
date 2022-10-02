package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg67 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMI1bnxyoPB-gIVlg4rCh36SwPcEAAYASAAEgJuCfD_BwE&gclsrc=aw.ds");
		Thread.sleep(4000);
		
		
JavascriptExecutor jse=(JavascriptExecutor)c;
		
		String x1="//button[.='Upload Resume']";
		
		
		
		WebElement d=c.findElement(By.xpath(x1));
		
		
		int y=d.getLocation().getY();
		
		
		String scroll="window.scrollBy(0,'"+y+"')";
		jse.executeAsyncScript(scroll);
		
		Thread.sleep(2000);
		c.findElement(By.xpath(x1)).sendKeys("C:\\Users\\brahm\\OneDrive\\Desktop\\220800386.pdf");
		
		
		
		

	}

}
