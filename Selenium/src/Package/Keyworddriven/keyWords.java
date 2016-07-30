package Package.Keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class keyWords {
	
	FirefoxDriver driver;
	public void launchBrowser() 

	{
		driver = new FirefoxDriver();
		
		
	}

	public void navigate()  
	{
		
		driver.get("http://gmail.com");
		
	}
	
	public void enterUsername() 
	{
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("reach.seleniumprogramme");
		
	}

	public void buttonOne()  
	{
		
		driver.findElement(By.xpath("//*[@id='next']")).click();
		Sleeper.sleepTightInSeconds(10);
	}
	

    public void enterPasword() 
    {
    	Sleeper.sleepTightInSeconds(10);
    	driver.findElement(By.id("Passwd")).clear();
    	driver.findElement(By.id("Passwd")).sendKeys("sssairam");
    	
    }

    public void buttonTwo() 
    
    {
    	driver.findElement(By.id("signIn")).click();
    	
    }

}
