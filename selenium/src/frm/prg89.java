package frm;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class prg89 {

	
	
	@Test
	public void registeruser()
	{
		Reporter.log("user regi",false);
	}
	
	
	
	@Test(dependsOnMethods="registeruser")
	public void deluser()
	{
		Reporter.log("user del",true);
	}
	
	
	
	
	
	
	
	
	
}
