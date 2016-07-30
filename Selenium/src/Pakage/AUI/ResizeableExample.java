package Pakage.AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ResizeableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(15);
		WebElement resize ;
		Sleeper.sleepTightInSeconds(15);
		driver.switchTo().frame(0);
		resize= driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		
        Actions action= new Actions(driver);
        action.dragAndDropBy(resize, 200, 200).build().perform();
		
		
		
		
		
	}

}
