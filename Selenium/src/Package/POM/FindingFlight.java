package Package.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class FindingFlight {
	
	/*@FindBy(name="fromPort")
	WebElement countries;
	
	public void SelectCountry()
	{
		List<WebElement> dropdown=countries.findElements(By.tagName("option"));
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(4).click();
		}
		
		
	}*/
	
	/*@FindBy(name="fromPort")
	WebElement countries;
	
	public void SelectCountry()
	{
		List<WebElement> dropdown=countries.findElements(By.tagName("option"));
		
		int x=randomNo(dropdown.size()-1);
		dropdown.get(x).click();
	
		
	}*/
	
	@FindBy(tagName="option")
	List<WebElement> countries;
	public void SelectCountry()
	{
		int x=randomNo(countries.size()-1);
		countries.get(x).click();
	}
	
	/*@FindBy(name="fromPort")
	WebElement countries;
	public void SelectCountry()
	{
		Select ctry=new Select(countries);
		ctry.selectByIndex(5);
		
		
	}*/
public int randomNo(int i)
{
int x=(int)(Math.random()*i);
return x;
}

}
