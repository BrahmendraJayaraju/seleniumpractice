package myown;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg66 {

	public static void main(String[] args) throws InterruptedException {
		Date d=new Date();
		
		
		
		SimpleDateFormat s1=new SimpleDateFormat("d");
		
		String day=s1.format(d);
		
		
		
		

		SimpleDateFormat s2=new SimpleDateFormat("MMMM");
		
		String YR=s2.format(d);
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		
	c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		c.get("https://www.cleartrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=EAIaIQobChMIooma84DB-gIV45lmAh24RgHdEAAYASAAEgLFkfD_BwE&gclid=EAIaIQobChMIooma84DB-gIV45lmAh24RgHdEAAYASAAEgLFkfD_BwE");
		
		c.findElement(By.className("fs-4 fw-500 c-inherit flex flex-nowrap ml-4"));
		
		
		

	}

}
