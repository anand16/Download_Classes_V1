package Pakage.AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutoCompleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver myTestDriver = new FirefoxDriver();
		myTestDriver.get("http://jqueryui.com/autocomplete/");
		Sleeper.sleepTightInSeconds(10);
		myTestDriver.switchTo().frame(0);
		myTestDriver.findElement(By.xpath("//*[@id='tags']")).sendKeys("a");
		/*myTestDriver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys(Keys.ARROW_DOWN);
		myTestDriver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys(Keys.ARROW_DOWN);
		myTestDriver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys(Keys.ARROW_DOWN);
		myTestDriver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys(Keys.ENTER);*/
		WebElement auto=myTestDriver.findElement(By.xpath("//*[@id='tags']"));
		Actions action = new Actions(myTestDriver);
		action.moveToElement(auto).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
				

	}

}
