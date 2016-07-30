package Package.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
driver = new FirefoxDriver();
driver.get("http://compendiumdev.co.uk/selenium/calculate.php");
 driver.findElement(By.id("number1")).sendKeys("25");

	driver.findElement(By.id("function")).sendKeys("plus");
	
	 driver.findElement(By.id("number2")).sendKeys("25");
	driver.findElement(By.id("calculate")).click();
	
	}

}
