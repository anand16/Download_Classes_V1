package Package.Extra;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavascrExe {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  driver = new FirefoxDriver();  
		     	    
		  driver.get("http://duckduckgo.com/");  
		  JavascriptExecutor js=(JavascriptExecutor) driver;  
		    
		  String readyState=(String)js.executeScript("return document.readyState");  
		  System.out.println("readyState  : "+readyState);  
		  
		  String title=(String)js.executeScript("return document.title");  
		  System.out.println("title  : "+title);  
		            
		  String domain=(String)js.executeScript("return document.domain");  
		  System.out.println("domain  : "+domain);  
		            
		    
		  String lastModified=(String)js.executeScript("return document.lastModified");  
		  System.out.println("lastModified  : "+lastModified);  
		            
		  String URL=(String)js.executeScript("return document.URL");  
		  System.out.println("Full URL  : "+URL);  
		  
		 String error=(String) ((JavascriptExecutor) driver).executeScript("return window.jsErrors");  
		  System.out.println("Windows js errors  :   "+error);  
	

}

	}
