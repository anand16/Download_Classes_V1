package PackageNewTours.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterTours {

	@FindBy(name="firstName")
	WebElement F_name;
	@FindBy(name="lastName")
	WebElement L_name;
	@FindBy(name="email")
	WebElement Username;
	@FindBy(name="password")
	WebElement PWD;
	@FindBy(name="confirmPassword")
	WebElement C_PWD;
	@FindBy(name="register")
	WebElement registerButton;
	
	public void RegisterInfo()
	{
		F_name.sendKeys("Vivek");
		L_name.sendKeys("QEdge");
		Username.sendKeys("Vivek");
		PWD.sendKeys("Hello");
		C_PWD.sendKeys("Hello");
		registerButton.click();
		
	}




}
