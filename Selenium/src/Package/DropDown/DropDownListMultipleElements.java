package Package.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html#sthash.LEaKRJad.dpuf");
		driver.manage().window().maximize();
WebElement element=driver.findElement(By.xpath("//select[@name='FromLB']"));
Select select= new Select(element);
if(select.isMultiple())
{
	select.selectByIndex(0);
	select.selectByIndex(1);
	select.selectByIndex(2);
	Thread.sleep(5000);
	select.deselectAll();
	
}

	}

}
