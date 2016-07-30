package Package.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleOne {
static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("//a[@class='gb_P']")).click();
	}

}
