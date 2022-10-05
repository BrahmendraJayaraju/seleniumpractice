package frm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class prg79 {

	
	@FindBy(id="username")
	private WebElement untb;
	
	
	
	@FindBy(name="pwd")
	private WebElement pwtb;
	
	
	@FindBy(xpath="//div[.='login']")
	private WebElement login;
	
	
	
	
	public prg79(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterun(String un)
	{
		untb.sendKeys(un);
	}
	
	
	public void enterps(String ps)
	{
		pwtb.sendKeys(ps);
	}
	
	
	
	public void clickonlogin()
	{
		login.click();
	}
	
	
	
	
	
}
