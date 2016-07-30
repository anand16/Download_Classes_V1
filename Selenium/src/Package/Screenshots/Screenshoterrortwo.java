package Package.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshoterrortwo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver= new FirefoxDriver();
driver.get("http://google.com");


try

{
driver.findElement(By.linkText("vivekanand")).click();

}
catch(Exception E)

{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\anand\\Desktop\\DoubleClick\\Screenshots\\Photo2.png"));
	
}	

	}

}
