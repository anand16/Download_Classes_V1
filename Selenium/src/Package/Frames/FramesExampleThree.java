package Package.Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FramesExampleThree {
	@Test
	public void framecheck()
	{

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.angelfire.com/super/badwebs/");
	List<WebElement> frame=driver.findElements(By.tagName("frame"));
	for(int i=0;i<frame.size();i++)
	{
		
		driver.switchTo().frame(i);
		
		try{
			String Elemnt= driver.findElement(By.xpath("html/body/p[5]/b/a/font")).getText();
			driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
			

			break;
		}
		catch(Exception E)
		{
			driver.switchTo().defaultContent();
		}
	}
	
	}
}
