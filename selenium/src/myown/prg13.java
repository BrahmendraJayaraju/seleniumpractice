package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg13 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		
		System.setProperty(key,value);
         WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("https://accounts.google.com/v3/signin/identifier?dsh=S637910043%3A1663435658262773&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWrS0-sZdS6-09Ky4f7da4GN4Lw4Dv4YLnrrsew4lxLeOSyirh1SUr-Aj-535zelsbwVbDWq");
		
		
		c.findElement(By.cssSelector("input[type='email']")).sendKeys("hdwgdwdg");
		
		c.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
		

	}

}
