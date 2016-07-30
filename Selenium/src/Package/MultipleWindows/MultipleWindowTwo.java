package Package.MultipleWindows;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultipleWindowTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriver driver;
		
		
			
			driver = new FirefoxDriver();
			driver.get("http://bing.com");
		
		
		
		
			String Title1=driver.getTitle();
			driver.findElement(By.linkText("Help")).click();
			Set<String> windowsids=driver.getWindowHandles();
			Iterator<String> it= windowsids.iterator();
			while(it.hasNext())
			{		
				driver.switchTo().window(it.next());
				String Title2=driver.getTitle();
			if(!Title1.equals(Title2))
				
			{
				
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
				break;
			}
			
			
		
			
		}

	}

}
