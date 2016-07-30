package Package.HTMLUnitDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HTMLDriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country_id = driver.findElement(By.name("country"));
		List<WebElement> cty_listing = country_id.findElements(By.tagName("option"));
		for(int i=0;i<cty_listing.size();i++)
		{
			
			cty_listing.get(i).click();
			if(cty_listing.get(i).isSelected())
				
			{
				System.out.println("The country " + cty_listing.get(i).getText()+ "is Active" );
				
			}
			else
				
			{
				System.out.println("The country " + cty_listing.get(i).getText()+ "is InActive" );	
				
			}

		}


	}

}
