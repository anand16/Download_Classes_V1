package Package.MultipleWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;


public class MultipleWindowsfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 WebDriver driver;
		
		
			
			driver = new FirefoxDriver();
			driver.get("http://bing.com");
			String Title1=driver.getTitle();
			driver.findElement(By.linkText("Help")).click();
			Set<String> windowsids=driver.getWindowHandles();
			System.out.println("" + windowsids.size());
			Iterator<String> it= windowsids.iterator();
			while(it.hasNext())
			{		
				driver.switchTo().window(it.next());
				try
				{
					driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
				}
				
				catch(Exception E)
				{
					
				}
				
				
			}
			
			 windowsids=driver.getWindowHandles();
			System.out.println("" + windowsids.size());
			it= windowsids.iterator();
			while(it.hasNext())
			{		
				driver.switchTo().window(it.next());
				try
				{
					driver.findElement(By.xpath("//*[@id='mainotherimportantprivacyinformationmodule_ShortDescription']/label/p/a")).click();
				}
				
				catch(Exception E)
				{
					
				}
				
				
			}
			

	}

}
