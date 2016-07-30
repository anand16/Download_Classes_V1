package Package.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		String [] elements= new String[]{"one","two","three","four","five","six","seven"};
		List<WebElement> user=driver.findElements(By.xpath("//input[@type='text'or @type='password'] "));
		System.out.println(user.size());
		for(int i=0;i<=user.size();i++)
		{
			user.get(i).sendKeys(elements[i]);
		}
	
	}

}
