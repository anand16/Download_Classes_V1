package Package.WebTable;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DynamicWebTableOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
		//Below xpath of complete static set
		WebElement com_path=driver.findElement(By.xpath("html/body/div[1]/div[7]/section[2]"));
		List<WebElement> rows= com_path.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
			
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			{
				for(int j=0;j<cols.size();j++)
					
					System.out.println(cols.get(j).getText());
			}
			
		}

	}

}
