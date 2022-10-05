package frm;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class prg80 {

	 
		
		@FindBy(xpath="//a")
		private List<WebElement> lnk;
		
		
		
		public prg80(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		
		public void clickonalllnks()
		{
			int count=lnk.size();
			
			System.out.print(count);
			
			for(WebElement a:lnk)
			{
				
				String name=a.getText();
				System.out.print(name);
			}
			
			
		}
		
		
		
		
		
		
		
		

	

}
