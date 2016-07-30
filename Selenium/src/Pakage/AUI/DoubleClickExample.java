package Pakage.AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DoubleClickExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new FirefoxDriver();
		String URL="file:///C:/Users/anand/Desktop/DoubleClick/Doubleclick.html";
		Driver.get(URL);
		Sleeper.sleepTight(50);
		Driver.findElement(By.id("field1")).sendKeys("Hello India");
		Driver.findElement(By.id("field2")).sendKeys("Hello World");
		Sleeper.sleepTight(25);
		WebElement d_click=Driver.findElement(By.xpath("//button[contains(text(),'CopyText')]"));
		Actions action = new Actions(Driver);
		action.doubleClick(d_click).build().perform();
		
		
	}

}
