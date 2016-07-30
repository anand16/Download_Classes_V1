package Package.Sync;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitwaitInvisibilityofElement {

	@Test
	public void checkinvisibility()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://pvrcinemas.com");
		driver.manage().window().maximize();
		WebDriverWait mywait=new WebDriverWait(driver,60);
		driver.findElement(By.className("modal-skip")).click();
		mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a")));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[3]/div/div/div/span/a"))).click();
		
		
	}
}
