package Package.RadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RadioButtonExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		List<WebElement> radiolist = driver.findElements(By.name("group1"));
		for(int i=0;i<radiolist.size();i++)
			
		{
			
			System.out.println(radiolist.get(i).getAttribute("checked") + "" +radiolist.get(i).getAttribute("value")  );
			
		}
		

	}

}
