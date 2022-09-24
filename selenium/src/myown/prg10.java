package myown;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg10 {

	public static void main(String[] args) throws InterruptedException {
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name ");
		String un=sc.nextLine();
		
		System.out.println("enter pass ");
		String pwd=sc.nextLine();
		
		
		System.setProperty(key,value);
		
		WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();

		c.get("https://www.facebook.com/");
		
		
		
		
		
		
		
		c.findElement(By.id("email")).sendKeys(un);
		
		
		c.findElement(By.name("pass")).sendKeys(pwd);
		
		
		
		c.findElement(By.name("login")).click();
		
		
		
		
		
		Thread.sleep(3000);
		
		c.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
