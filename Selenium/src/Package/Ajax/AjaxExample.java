package Package.Ajax;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AjaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://ask.com");
		driver.findElement(By.id("search-box")).sendKeys("Selenium");
		String Xpath1="html/body/div[2]/ul/li[";
		String Xpath2="]";
		WebElement outerelements=driver.findElement(By.xpath("html/body/div[2]"));
		Sleeper.sleepTightInSeconds(5);
		for(int i=1;i<=8;i++)
		{
		List<WebElement> elements= outerelements.findElements(By.xpath(Xpath1+i+Xpath2));
		
        System.out.println((elements.size()));
        System.out.println(elements.get(i).getText());
		}
			//	(By.xpath("//*[starts-with(@id,'sbse')]/div[2]"));

	}

}
