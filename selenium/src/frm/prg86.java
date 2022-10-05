package frm;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class prg86 extends prg84{

	@Test(priority=1)
	public void testA()
	{
		Reporter.log("testa is executed ",true);
	}
	
	

	@Test(priority=2)
	public void testB()
	{
		Reporter.log("testb is executed ",true);
	}
	
}
