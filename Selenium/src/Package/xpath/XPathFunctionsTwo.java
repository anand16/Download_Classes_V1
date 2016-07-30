package Package.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathFunctionsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		/*driver.findElement(By.xpath("//a[contains(text(),'Create account')]")).click();*/
		
		
		driver.findElement(By.xpath("//input[starts-with(@id,'Ema')]")).sendKeys("reach.seleniumprogramme");
		driver.findElement(By.xpath("//input[@id='next']")).click();
		
		
		
		
	}

}
