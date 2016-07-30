package Pakage.AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RightClickExample {

    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver= new FirefoxDriver();
		driver.navigate().to("http://ask.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(30);
		//WebElement rightclick=driver.findElement(By.linkText("Yoga"));
		WebElement rightclick=driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/div/ul[2]/li[4]/a"));
		 Actions action = new Actions(driver);
		 action.contextClick(rightclick).build().perform();
	}

}
