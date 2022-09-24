package myown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg17 {

	public static void main(String[] args) {




String key="webdriver.chrome.driver";
String value="./drivers/chromedriver.exe";



System.setProperty(key,value);
 WebDriver c=new ChromeDriver();

c.manage().window().maximize();

c.get("file:///C:/Users/brahm/OneDrive/Desktop/page44.html");

WebElement link=c.findElement(By.id("fn"));

String a=link.getCssValue("color");

System.out.println(a);



String b=link.getCssValue("text-decoration");

System.out.println(b);







	}

}
