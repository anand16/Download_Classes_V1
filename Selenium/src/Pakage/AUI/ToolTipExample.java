package Pakage.AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://jqueryui.com/tooltip/");
driver.switchTo().frame(0);
Sleeper.sleepTightInSeconds(10);
	Actions action=new Actions(driver);
	WebElement TTip=driver.findElement(By.id("age"));
	action.moveToElement(TTip).build().perform();
	

	}

}
