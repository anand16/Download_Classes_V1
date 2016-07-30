package Package.Keyworddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class UsingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        WebDriver driver;
		FileInputStream f= new FileInputStream("D:\\HomeBatchOne\\Selenium\\Seleniumproperties.properties");
		Properties p = new Properties();
		p.load(f);
		
		driver= new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id(p.getProperty("username"))).sendKeys("reach.seleniumprogramme");
		//Sleeper.sleepTight(10);
		driver.findElement(By.xpath(p.getProperty("BeforeButton"))).click();
		//driver.findElement(By.id("next")).click();
		driver.findElement(By.id(p.getProperty("password"))).sendKeys("sssairam");
		//Sleeper.sleepTight(10);
		driver.findElement(By.id(p.getProperty("SignButton"))).click();
	}

}

