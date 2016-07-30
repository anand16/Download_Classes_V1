package Package.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html#sthash.LEaKRJad.dpuf");
 WebElement element=driver.findElement(By.id("Carlist"));
 Select select= new Select(element);
 select.selectByIndex(0);
 select.selectByValue("BMW Car");
 select.selectByVisibleText("Audi");
 

	}

}
