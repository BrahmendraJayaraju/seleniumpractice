package frm;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class prg87 {
	
	
	 final int  a=5;
	
	@Test(priority=1,invocationCount=a)
	public void testA()
	{
		Reporter.log("testa is executed ",true);
	}
}
