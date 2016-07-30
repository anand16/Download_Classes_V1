package Package.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDriverGeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer.exe");
WebDriver driver=new InternetExplorerDriver();
driver.get("http://seleniumhq.org");

	}

}
