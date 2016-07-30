package Package.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://gmail.com");
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vygsai");
driver.findElement(By.xpath("//input[@id='next']")).click();
	}

}
