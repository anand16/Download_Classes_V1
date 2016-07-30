package Package.Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotonErrorone {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		List<WebElement> links=driver.findElements(By.linkText("vivekanand"));
		if(links.size()==0)
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\anand\\Desktop\\DoubleClick\\Screenshots\\photo1.png"));
		}
		else 
			
			driver.findElement(By.linkText("vivekanand")).click();
	}

}
