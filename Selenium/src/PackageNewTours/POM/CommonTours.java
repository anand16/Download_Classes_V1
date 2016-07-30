package PackageNewTours.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonTours {
	
	@FindBy(linkText="Home")
	WebElement vone;

	@FindBy(linkText="Flights")
	WebElement vtwo;

	@FindBy(linkText="Hotels")
	WebElement vthree;

	@FindBy(linkText="Car Rentals")
	WebElement vfour;

	@FindBy(linkText="Cruises")
	WebElement vfive;
	
	public void Home()
	{
		vone.click();
	}
	public void Flights()
	{
		vtwo.click();
	}
	public void Hotels()
	{
		vthree.click();
	}
	public void CarRentals()
	{
		vfour.click();
	}
	public void Cruises()
	{
		vfive.click();
	}
	

}
