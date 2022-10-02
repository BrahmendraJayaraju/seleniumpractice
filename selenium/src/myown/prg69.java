package myown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg69 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
		
		c.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMI1bnxyoPB-gIVlg4rCh36SwPcEAAYASAAEgJuCfD_BwE&gclsrc=aw.ds");
		Thread.sleep(4000);
		
		
		
		String a=c.getWindowHandle();
		
		System.out.println(a);
		
		
		
		
		

	}

}
