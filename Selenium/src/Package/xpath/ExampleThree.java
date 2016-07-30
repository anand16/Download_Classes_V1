package Package.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleThree {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		List<WebElement> user=driver.findElements(By.xpath("//input[@type='text'or @type='password'] "));
		System.out.println(user.size());
	}

}
