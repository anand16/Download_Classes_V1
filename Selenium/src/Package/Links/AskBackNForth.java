package Package.Links;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class AskBackNForth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pri=new ProfilesIni();
		FirefoxProfile fpr= pri.getProfile("MyProfile");
		FirefoxDriver driver= new FirefoxDriver(fpr);
		driver.get("http://google.com");
		List<WebElement> ask_links = driver.findElements(By.tagName("a"));
	
		for(int i=0;i<ask_links.size();i++)
		{
			if(!ask_links.get(i).getText().isEmpty())
			{
			ask_links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			ask_links = driver.findElements(By.tagName("a"));
			}
			
		}

	}

}
