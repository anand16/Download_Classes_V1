package Package.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class StaticWebTableEampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
driver=new FirefoxDriver();
Sleeper.sleepTight(50);
driver.get("http://www.timeanddate.com/worldclock/");
//html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[1]/td[1]/a

String Path1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
String Path2="]/td[";
String Path3="]";

for(int i=1;i<=36;i++)
	
{
	
	for(int j=1;j<=8;j++)
		
	{
		String TimeCounry=driver.findElement(By.xpath(Path1+i+Path2+j+Path3)).getText();
		System.out.println(TimeCounry+ "");	
	}
	System.out.println();
}
                                                                      

	}

}
