package myown;

import org.openqa.selenium.firefox.FirefoxDriver;

public class prg2 {

	public static void main(String[] args) throws InterruptedException {
	
		String key = "weddriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		
		
		System.setProperty(key,value);
		
		FirefoxDriver f1=new FirefoxDriver();
		
		
		Thread.sleep(2000);
		
		
		f1.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
