package Package.RadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver= new FirefoxDriver();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		List<WebElement> radiolist = driver.findElements(By.name("browser"));
		for(int i=0;i<radiolist.size();i++)
			
		{
			radiolist.get(i).click();
			Sleeper.sleepTightInSeconds(20);;
			
		}
		

	}

}
