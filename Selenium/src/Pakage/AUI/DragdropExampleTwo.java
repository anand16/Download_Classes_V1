package Pakage.AUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragdropExampleTwo {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
driver=new FirefoxDriver();
driver.get("http://jqueryui.com/droppable/");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.switchTo().frame(0);
//WebElement drag= driver.findElement(By.id("draggable"));
//WebElement drop = driver.findElement(By.id("droppable"));

WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));



Actions action = new Actions(driver);
action.dragAndDrop(drag, drop).build().perform();
//action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
	}

}
