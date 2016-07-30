package Package.WebTable;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarDymanicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();

driver.get("http://www.cleartrip.com/");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.id("OneWay")).click();
driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
driver.findElement(By.id("ToTag")).sendKeys("Kathmandu, NP - Tribuvan (KTM)");
driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
String journey_date="10/04/2017";
String[] a = journey_date.split("/");
String day=a[0];
String year=a[2];
String [] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
int x=Integer.parseInt(a[1]);
String month=months[x-1];

String cal_year=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
while(!cal_year.equals(year))
{
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
	//If the step was not given then the calendar does not stop after displaying Jan 2017 
	cal_year=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
}
	

String cal_month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
while(!cal_month.equals(month))
{
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
	cal_month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
	
}

WebElement calendar=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]"));
List<WebElement> rows=calendar.findElements(By.tagName("tr"));
for(int i=0;i<rows.size();i++)
{
List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
for(int j=0;j<cols.size();j++)
{
	if(cols.get(j).getText().equals(day))
		cols.get(j).click();
	break;
}

}
	}
	


}
