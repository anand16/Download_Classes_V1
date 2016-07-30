package Package.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromaDriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://google.com");
	}

}
