package myown;

import org.openqa.selenium.edge.EdgeDriver;

public class prg3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		String key="webdriver.edge.driver";
		String value="./drivers/msedgedriver.exe";
		
		
		System.setProperty(key, value);
		
		
		
		EdgeDriver d=new EdgeDriver();
		
		d.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		
		d.close();
		
		
		
		

	}

}
