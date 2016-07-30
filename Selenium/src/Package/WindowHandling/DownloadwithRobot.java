package Package.WindowHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DownloadwithRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
FirefoxDriver driver= new FirefoxDriver();
driver.get("http://seleniumhq.org");
driver.findElement(By.linkText("Download")).click();
driver.findElement(By.linkText("2.53.1")).click();
driver.manage().window().maximize();
Thread.sleep(5000);
Robot rb=new Robot();
rb.keyPress(KeyEvent.VK_TAB);
rb.keyRelease(KeyEvent.VK_TAB);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);
/*Robot rt=new Robot();
rt.keyPress(KeyEvent.VK_TAB);
rt.keyRelease(KeyEvent.VK_TAB);
Sleeper.sleepTightInSeconds(10);
rt.keyPress(KeyEvent.VK_ENTER);
rt.keyRelease(KeyEvent.VK_ENTER);*/


	}

}
