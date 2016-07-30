package Package.Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplescreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for (int i=0;i<links.size();i++)
			
		{
			String linkname=links.get(i).getText();
			links.get(i).click();
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\anand\\Desktop\\DoubleClick\\Screenshots\\"+linkname+".png"));
			driver.navigate().back();
			 links= driver.findElements(By.tagName("a"));
			
		}
		
		
	}

}
