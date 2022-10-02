package myown;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg73 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMI1bnxyoPB-gIVlg4rCh36SwPcEAAYASAAEgJuCfD_BwE&gclsrc=aw.ds");
	Thread.sleep(2000);
		
		
		
			Set<String> a=c.getWindowHandles();
		
			
			
			
			for(String b:a)
			{
			
				
				c.switchTo().window(b);
				
				Thread.sleep(1000);
		String t=c.getTitle();
				
				if(t.equals("amazon"))
				{
		
		
		c.close();
		}
	}
	}
}
