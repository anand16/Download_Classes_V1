package Package.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarDynamicWebtableTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='widget_row']/div[1]/div/div[2]/ul/li[2]/a/span[2]")).click();
		
		
driver.findElement(By.xpath("//*[@id='round_trip_button1']/span")).click();

driver.findElement(By.xpath("//*[@id='from_typeahead1']")).sendKeys("Hyderabad, India (HYD)");
driver.findElement(By.xpath("//*[@id='to_typeahead1']")).sendKeys("New Delhi, India (DEL)");

driver.findElement(By.xpath("//*[@id='start_date_sec']/span[2]")).click();

String j_date="10/01/2017";
String a [] =j_date.split("/");
String day=a[0];
String year=a[2];
int x= Integer.parseInt(a[1]);
String [] months={"January","February","March","April","May","June","July","August","September","October","November","December"};

String month=months[x-1];

String cal_year;
String cal_month;

cal_year=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[2]")).getText();
while(!cal_year.equals(year))
{
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/div/a/span")).click();
	cal_year=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[2]")).getText();
}

cal_month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
while(!cal_month.equals(month))
{
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/div/a/span")).click();
	cal_month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
}

	
	WebElement calendar= driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]"));
	List<WebElement> rows= calendar.findElements(By.tagName("tr"));
	for(int i=0;i<rows.size();i++)
	{
		List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
		
		for(int j=0;j<cols.size();j++)
		{
			if(cols.get(j).getText().equals(day))
					
			{
				cols.get(j).click();
				break;
			}
			
		}
		
		
	}
	
	
	}

}


/*Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: Element is no longer attached to the DOM
Command duration or timeout: 14 milliseconds
For documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html
Build info: version: '2.50.1', revision: 'd7fc91b', time: '2016-01-29 19:08:26'
System info: host: 'VivekanandYG', ip: '192.168.1.2', os.name: 'Windows 7', os.arch: 'amd64', os.version: '6.1', java.version: '1.7.0_60'
*** Element info: {Using=tag name, value=td}
Session ID: c4798855-5a27-4584-8433-8fc2ac066763
Driver info: org.openqa.selenium.firefox.FirefoxDriver
Capabilities [{platform=WINDOWS, acceptSslCerts=true, javascriptEnabled=true, cssSelectorsEnabled=true, databaseEnabled=true, browserName=firefox, handlesAlerts=true, nativeEvents=false, webStorageEnabled=true, rotatable=false, locationContextEnabled=true, applicationCacheEnabled=true, takesScreenshot=true, version=44.0.2}]
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:526)
	at org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)
	at org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)
	at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)
	at org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)
	at org.openqa.selenium.remote.RemoteWebElement.findElements(RemoteWebElement.java:214)
	at org.openqa.selenium.remote.RemoteWebElement.findElementsByTagName(RemoteWebElement.java:320)
	at org.openqa.selenium.By$ByTagName.findElements(By.java:327)
	at org.openqa.selenium.remote.RemoteWebElement.findElements(RemoteWebElement.java:190)
	at Package.WebTable.CalendarDynamicWebtableTwo.main(CalendarDynamicWebtableTwo.java:61)
Caused by: org.openqa.selenium.StaleElementReferenceException: Element is no longer attached to the DOM
For documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html
Build info: version: '2.50.1', revision: 'd7fc91b', time: '2016-01-29 19:08:26'
System info: host: 'VivekanandYG', ip: '192.168.1.2', os.name: 'Windows 7', os.arch: 'amd64', os.version: '6.1', java.version: '1.7.0_60'
Driver info: driver.version: unknown
	at <anonymous class>.fxdriver.cache.getElementAt(resource://fxdriver/modules/web-element-cache.js:9406)
	at <anonymous class>.Utils.getElementAt(file:///C:/Users/anand/AppData/Local/Temp/anonymous8141215110523029785webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:8992)
	at <anonymous class>.FirefoxDriver.prototype.findElementsInternal_(file:///C:/Users/anand/AppData/Local/Temp/anonymous8141215110523029785webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10737)
	at <anonymous class>.FirefoxDriver.prototype.findChildElements(file:///C:/Users/anand/AppData/Local/Temp/anonymous8141215110523029785webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10758)
	at <anonymous class>.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/anand/AppData/Local/Temp/anonymous8141215110523029785webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12595)
	at <anonymous class>.DelayedCommand.prototype.executeInternal_(file:///C:/Users/anand/AppData/Local/Temp/anonymous8141215110523029785webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12600)
	at <anonymous class>.DelayedCommand.prototype.execute/<(file:///C:/Users/anand/AppData/Local/Temp/anonymous8141215110523029785webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12542)
*/