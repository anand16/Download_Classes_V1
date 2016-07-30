package Pakage.AUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Sleeper.sleepTightInSeconds(10);
		WebElement el1=driver.findElement(By.xpath("//*[@id='selectable']/li[2]"));
		WebElement el3=driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
		
		Actions action= new Actions(driver);
		action.clickAndHold(el1).moveToElement(el3).release(el3).build().perform();
		
		
		
	}

}
