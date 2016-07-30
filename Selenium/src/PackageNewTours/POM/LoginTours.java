package PackageNewTours.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginTours {

	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement clk;
	@FindBy(linkText="your destination")
	WebElement destination;
	@FindBy(linkText="featured vacation destinations")
	WebElement vacation;
	@FindBy(linkText="Register here")
	WebElement register;
	public void FindAFlight(String un,String pwd)
	{
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		clk.click();
		
	}
	public void Destination()
	{
		destination.click();
	}
	public void vacation()
	{
		vacation.click();
	}
	
	public void register()
	{
		register.click();
	}

}
