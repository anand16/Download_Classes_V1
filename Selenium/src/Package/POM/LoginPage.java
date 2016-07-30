package Package.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement btnLogin;
	
	public void buttonclick()
	{
		username.sendKeys("tutorial");
		password.sendKeys("tutorial");
		btnLogin.click();
		
		
		
	}
}
