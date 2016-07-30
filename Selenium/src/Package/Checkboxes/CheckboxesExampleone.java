package Package.Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxesExampleone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
driver = new FirefoxDriver();
driver.get("http://echoecho.com/htmlforms09.htm");
List<WebElement> chkboxes =driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));


System.out.println(chkboxes.size());
for(int i=0;i<chkboxes.size();i++)
{
if (!chkboxes.get(i).isSelected())
{
	
chkboxes.get(i).click();

}
}


	}

}
