package Package.WindowHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class UploadwithRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://imgur.com");
driver.manage().window().maximize();
Sleeper.sleepTightInSeconds(10);
driver.findElement(By.className("upload-btn-text")).click();
driver.findElement(By.id("upload-global-file-wrapper")).click();
Sleeper.sleepTightInSeconds(10);
Robot rb=new Robot();
rb.keyPress(KeyEvent.VK_S);
rb.keyRelease(KeyEvent.VK_S);
rb.keyPress(KeyEvent.VK_A);
rb.keyRelease(KeyEvent.VK_A);
rb.keyPress(KeyEvent.VK_M);
rb.keyRelease(KeyEvent.VK_M);
rb.keyPress(KeyEvent.VK_P);
rb.keyRelease(KeyEvent.VK_P);
rb.keyPress(KeyEvent.VK_L);
rb.keyRelease(KeyEvent.VK_L);
rb.keyPress(KeyEvent.VK_E);
rb.keyRelease(KeyEvent.VK_E);
rb.keyPress(KeyEvent.VK_PERIOD);
rb.keyRelease(KeyEvent.VK_PERIOD);
rb.keyPress(KeyEvent.VK_G);
rb.keyRelease(KeyEvent.VK_G);
rb.keyPress(KeyEvent.VK_I);
rb.keyRelease(KeyEvent.VK_I);
rb.keyPress(KeyEvent.VK_F);
rb.keyRelease(KeyEvent.VK_F);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
