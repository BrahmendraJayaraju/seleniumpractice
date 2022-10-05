package frm;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class prg88 {

	
	@BeforeMethod(alwaysRun=true)
	public void login()
	{
		Reporter.log("login",true);
		
		
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
	@Test(priority=1,groups= {"user","smoke"})
	public void createuser()
	{

		Reporter.log("createuser",true);
		
	}
	
	
	@Test(priority=2,groups= {"user"})
	public void edituser()
	{

		Reporter.log("edituser",true);
		
	}
	
	
	@Test(priority=3,groups= {"user"})
	public void deluser()
	{

		Reporter.log("deluser",true);
		
	}
	
	
	

	@Test(priority=4,groups= {"task","smoke"})
	public void createtask()
	{

		Reporter.log("createtask",true);
		
	}
	
	
	@Test(priority=5,groups= {"task"})
	public void edittask()
	{

		Reporter.log("edittask",true);
		
	}
	
	
	@Test(priority=6,groups= {"task"})
	public void deltask()
	{

		Reporter.log("deltask",true);
		
	}
}
