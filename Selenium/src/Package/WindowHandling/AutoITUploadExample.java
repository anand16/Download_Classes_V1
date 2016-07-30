package Package.WindowHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutoITUploadExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://imgur.com");
		Sleeper.sleepTightInSeconds(30);
		driver.findElement(By.className("upload-btn-text")).click();
		Sleeper.sleepTightInSeconds(30);
		driver.findElement(By.id("upload-global-file-wrapper")).click();
		Sleeper.sleepTightInSeconds(4);
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\anand\\Desktop\\DoubleClick\\AutoIT\\Upload.exe");

	}

}
