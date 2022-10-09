package frm;

import org.testng.Assert;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class prg95 {

	
	@Test
	public void testA()
	{
		Reporter.log("hii",true);
	}
	
	@Test
	public void testB()
	{
		Assert.fail();
		Reporter.log("byee",true);
	}
	
	@AfterMethod
	public void postcondition(ITestResult res)
	{
		
		ITestNGMethod metho=res.getMethod();
		
		
		
	String  name=metho.getMethodName();
	
	
	
	Reporter.log("test method name:"+name,true);
	
	
	int t=res.getStatus();
	
	
	Reporter.log("status:"+t);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
