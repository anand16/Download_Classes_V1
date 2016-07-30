package Package.DropDown;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropdownExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
WebElement Inputs= driver.findElement(By.id("searchDropdownBox"));
List<WebElement> Items= Inputs.findElements(By.tagName("option"));
for(int i=0;i<Items.size();i++)
	//camtesia
{
System.out.println(Items.get(i).getText());	
}
	}



	}


