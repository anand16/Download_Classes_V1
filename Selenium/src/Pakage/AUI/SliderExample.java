package Pakage.AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class SliderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new FirefoxDriver();
	driver.get("http://jqueryui.com/slider/");
	Sleeper.sleepTightInSeconds(15);
	WebElement slider ;
	//= driver.findElement(By.id("slider"));
	driver.switchTo().frame(0);
	slider=driver.findElement(By.xpath("//*[@id='slider']"));
	int x=slider.getLocation().x;
	int y=slider.getLocation().y;
	Actions action = new Actions(driver);
	action.dragAndDropBy(slider, 40, y).build().perform();
	
	
	
	
	}

}
