package Package.RadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RadioButtonExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		List<WebElement> radiolist = driver.findElements(By.name("group1"));
		for(int i=0;i<radiolist.size();i++)
		{
			Sleeper.sleepTightInSeconds(10);
			radiolist.get(i).click();
			
			for(int j=0;j<radiolist.size();j++)
				
			{
				System.out.println(radiolist.get(j).getAttribute("checked") + "" +radiolist.get(j).getAttribute("value")  );
				
			}
			
			
		}
		
	}

}
