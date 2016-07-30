package Package.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver= new FirefoxDriver();
String url="file:///C://Users//anand//Desktop//DoubleClick//Alerts.html";
driver.get(url);
driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
Alert alr= driver.switchTo().alert();
alr.accept();


	}

}
