package Package.Links;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AskFooterElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://ask.com");
		WebElement Footer= driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]"));
		List<WebElement> FooterLinks=Footer.findElements(By.tagName("a"));
		System.out.println(FooterLinks.size());
		for(int i=0;i<FooterLinks.size();i++)
		{
			System.out.println(FooterLinks.get(i).getText());
			
		}
	}

}
