package com.orangehrm.pageclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="txtUsername")
	WebElement userName;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement login;
	public void loginPanel(String u,String p)
	{
		userName.sendKeys(u);
		password.sendKeys(p);
		login.click();
	}
	
	

}
