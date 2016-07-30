package Package.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathFunctionsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
String URL="file:///C:/Users/anand/Desktop/DoubleClick/CheckBox.html";
driver.get(URL);
driver.findElement(By.xpath("//input[@type='checkbox'][last()]")).click();
driver.findElement(By.xpath("//input[@type='checkbox'][last()-1]")).click();
driver.findElement(By.xpath("//input[@type='checkbox'][last()-2]")).click();

driver.findElement(By.xpath("//input[@type='checkbox'][position()=1]")).click();
driver.findElement(By.xpath("//input[@type='checkbox'][position()=2]")).click();
	}

}
