package Package.Extra;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ButtonClikJSE {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.com/");
		WebElement searchTextBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBox.sendKeys("HarryPotter");
		WebElement goButton = driver.findElement(By.className("nav-input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", goButton);
			} 
		
	}
	
