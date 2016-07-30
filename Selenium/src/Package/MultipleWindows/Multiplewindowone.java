package Package.MultipleWindows;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Multiplewindowone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver;
		
		
			
			driver = new FirefoxDriver();
			driver.get("http://bing.com");
		
		
			driver.findElement(By.linkText("Help")).click();
			Set<String> windowsids=driver.getWindowHandles();
			Iterator<String> it= windowsids.iterator();
			
			String first=it.next();
			String second=it.next();
			driver.switchTo().window(second);
			driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
			//Hashtable does not maintain the order of elements.Hence this method is not used
			
			
			
			
			

	
	
	
	
	}

}
