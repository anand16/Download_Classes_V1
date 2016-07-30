package Package.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VisibleNHidden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://ask.com");
		int Count_Visible=0;
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		for(int i=0;i<Links.size(); ++i)
		{
			if(!Links.get(i).getText().isEmpty())
			{
				System.out.println(Links.get(i).getText());
				Count_Visible++;
			}
		}
		
		System.out.println("The Visible Links are " + Count_Visible);
		System.out.println("The Hidden Links are"+(Links.size()-Count_Visible));
		
	}

}
