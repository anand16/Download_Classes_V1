package Pakage.AUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraGDropExampleOne {

	public static void main(String[] args) {
		
		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		WebDriver driver = new FirefoxDriver();
		driver.get(URL);
		 
		// It is always advisable to Maximize the window before performing DragNDrop action
		 
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		 
		WebElement From = driver.findElement(By.xpath("//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		// TODO Auto-generated method stub
		WebElement To= driver.findElement(By.xpath("//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(From).moveToElement(To).release(To).build().perform();

	}

}
