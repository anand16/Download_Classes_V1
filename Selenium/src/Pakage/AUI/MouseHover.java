package Pakage.AUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialise browser
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ticketmaster.co.uk"); 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//locate the menu to hover over using its xpath
		WebElement menu = driver.findElement(By.xpath("//*[@id='navLinkCat_music']"));

		//Initiate mouse action using Actions class
		Actions builder = new Actions(driver);    
		
		builder.moveToElement(menu).build().perform();
		
		WebElement c_folk=driver.findElement(By.linkText("Country/Folk"));
		c_folk.click();
		

				}
		} 