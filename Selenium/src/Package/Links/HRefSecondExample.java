package Package.Links;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class HRefSecondExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pri=new ProfilesIni();
		FirefoxProfile fpr= pri.getProfile("MyProfile");
		FirefoxDriver driver= new FirefoxDriver(fpr);
		driver.get("http://google.com");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
			
		{
			
		//if(links.get(i).isDisplayed())
			
			if(!links.get(i).getText().isEmpty())
			{
			String Linkname=links.get(i).getText();
			String Expectedurl=links.get(i).getAttribute("href");
			links.get(i).click();
			String ActualURL=driver.getCurrentUrl();
			if (ActualURL.equals(Expectedurl))
				
			{
				
				System.out.println(Linkname +"Link is working correctly");
			}
			
			else
			{
				
				System.out.println(Linkname+"not working corectly");
			}
			driver.navigate().back();
			links= driver.findElements(By.tagName("a"));
			
			}
			}
		
		
		
	}

}

	


