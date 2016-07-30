package Package.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ScreenShotExampleOne {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver;
driver = new FirefoxDriver();
driver.get("http://www.bbc.com");
Sleeper.sleepTightInSeconds(100);
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("C:\\Users\\anand\\Desktop\\DoubleClick\\Screenshots\\BBCScreenshot.png"));
//FileUtils.copyFile(srcFile, destFile);
//FileUtils.copyFile(src,new File("c:\\users\\sai\\desktop\\bbc.png"));

	}

}
