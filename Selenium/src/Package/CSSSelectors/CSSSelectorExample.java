package Package.CSSSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://opensource.demo.orangehrm.com");
driver.findElement(By.cssSelector("input[id^='txtUser']")).sendKeys("admin");
driver.findElement(By.cssSelector("input[id$='Password']")).sendKeys("admin");
driver.findElement(By.cssSelector("input[id*='btnLo']")).click();
	}

}
