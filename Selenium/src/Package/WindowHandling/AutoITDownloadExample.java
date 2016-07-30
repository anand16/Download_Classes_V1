package Package.WindowHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutoITDownloadExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FirefoxDriver driver= new FirefoxDriver();
driver.get("http://seleniumhq.org");
driver.manage().window().maximize();
driver.findElement(By.linkText("Download")).click();
driver.findElement(By.linkText("2.53.1")).click();
Sleeper.sleepTightInSeconds(2);
java.lang.Runtime.getRuntime().exec("C:\\Users\\anand\\Desktop\\DoubleClick\\AutoIT\\Download.exe");

//java.lang.Runtime.getRuntime().exec(command)
	}

}
