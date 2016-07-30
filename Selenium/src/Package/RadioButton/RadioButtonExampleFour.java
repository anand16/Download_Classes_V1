package Package.RadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		for(int m=1;m<=2;m++)
		{
		List<WebElement> radiolist = driver.findElements(By.name("group"+m));
		for(int i=0;i<radiolist.size();i++)
		{
			radiolist.get(i).click();
			
			for(int j=0;j<radiolist.size();j++)
				
			{
				System.out.println(radiolist.get(j).getAttribute("checked") + "" +radiolist.get(j).getAttribute("value"));
				
			}
			
			
		}
		
		
		
		
		
		
	}

}

	}


