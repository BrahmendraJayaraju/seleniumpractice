package myown;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg6 {

	public static void main(String[] args) throws InterruptedException {
		
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		
		System.setProperty(key, value);
ChromeDriver c=new ChromeDriver();

c.get("https://chromedriver.chromium.org/downloads");
Thread.sleep(2000);


Dimension a=new Dimension(350,350);

Options o=c.manage();
Window w=o.window();
w.setSize(a);


Thread.sleep(2000);


Point p=new Point(250,250);

Options o2=c.manage();
Window w1=o2.window();

w1.setPosition(p);
Thread.sleep(2000);






		
		
		c.manage().window().maximize();
		
		
		
		
		

	}

}
