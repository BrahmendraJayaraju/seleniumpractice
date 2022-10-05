package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg77 {

	private WebElement un;
	private WebElement pwd;
	private WebElement sign;
	
	
	public prg77(WebDriver c)
	{
	un=c.findElement(By.id("email"));
	pwd=c.findElement(By.id("pass"));
	sign=c.findElement(By.xpath("//button[@name='login']"));
	
	}
	
	
	public void entername(String unname)
	{
	un.sendKeys(unname);
	}
	
	
	public void enterpwd(String password)
	{
		pwd.sendKeys(password);
		
	}
	
	public void clicklogin()
	{
		sign.click();
		
	}
	
	
	

}
