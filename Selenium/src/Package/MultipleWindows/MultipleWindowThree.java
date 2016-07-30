package Package.MultipleWindows;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
			
			driver = new FirefoxDriver();
			driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en");
		
			
				String PID=driver.getWindowHandle();
				driver.findElement(By.xpath("//*[@id='PrivacyLink']")).click();
				Set<String> windowsids=driver.getWindowHandles();
				System.out.println("Total number of window are "+windowsids.size() );
				Iterator<String> it= windowsids.iterator();
				while(it.hasNext())
				{		
					String CID=it.next();
					
					if(!PID.equalsIgnoreCase(CID))
						
					{
						driver.switchTo().window(CID);
						WebElement buttonclick= driver.findElement(By.xpath(".//*[@id='maia-nav-y']/ul/li[1]/ul/li[1]/a"));//click();
						buttonclick.click();
					}
					
					
				
				}
				
			

	}

}
