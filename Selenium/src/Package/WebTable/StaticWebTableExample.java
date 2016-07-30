package Package.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticWebTableExample {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
driver=new FirefoxDriver();
driver.get("http://www.timeanddate.com/worldclock/");
//html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[1]/td[1]/a

String path1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
String path2="]/td[1]";

for(int i=1;i<=36;i++)
	
{
String time_calc=driver.findElement(By.xpath(path1+i+path2)).getText();
System.out.println(time_calc);
}

	}

}
