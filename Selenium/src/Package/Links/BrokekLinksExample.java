package Package.Links;

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokekLinksExample {
	public static void main(String[] args)
	{
		
		WebDriver driver= new FirefoxDriver();
		boolean isvalid=false;
		driver.get("http://only-testing-blog.blogspot.in/2013/09/testing.html#sthash.VvqEeZSy.dpuf");
		List<WebElement> brokenlinks=driver.findElements(By.tagName("a"));
		System.out.println(brokenlinks.size());
		for(int i=0;i<brokenlinks.size();i++)
		{
			String URL=brokenlinks.get(i).getAttribute("href");
			if(URL!=null && URL!="")
				isvalid=getResponseCode(URL);
			if(isvalid)
			{
				System.out.println("valid URL"+URL);
				
			}
			
			else
			{
				System.out.println("BrokenLink"+URL);
			}
			
		}
	}


public static boolean getResponseCode(String chkurl)
{ 
	boolean validResponse = false; 

	try 
     
 {
	
	HttpResponse urlresp = new DefaultHttpClient().execute(new HttpGet(chkurl)); 
	int resp_Code = urlresp.getStatusLine().getStatusCode(); 
	System.out.println("Response Code Is : "+resp_Code);
	if ((resp_Code == 404) || (resp_Code == 505))
	{
		validResponse = false;
		
	} 
	else 
	{
		validResponse = true; 
	}
	
} catch (Exception e) 

{ 
	
}
     return validResponse;
}
}


