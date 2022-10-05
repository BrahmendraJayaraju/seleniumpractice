package frm;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class prg84 {

	@BeforeMethod
	public void beforemethod()
	{
		Reporter.log("beforemethod",true);
	}
	
	@AfterMethod
	public void aftermeth()
	{
		Reporter.log("aftermethod",true);
	}
	
	
	
	@BeforeClass
	public void beclass()
	{
		Reporter.log("beforeclass",true);
	}
	
	@AfterClass
	public void afclass()
	{
		Reporter.log("afterclass",true);
	}
	
	
	@BeforeTest
	public void bfTest()
	{
		Reporter.log("beforetest",true);
	}
	
	
	@AfterTest
	public void afTest()
	{
		Reporter.log("aftertest",true);
	}
	
	
	
	@BeforeSuite
	public void bfsuit()
	{
		Reporter.log("beforesuit",true);
	}
	
	@AfterSuite
	public void afsuite()
	{
		Reporter.log("aftersuite",true);
	}
	
}
