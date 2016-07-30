package Package.Links;

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenImages {
	public static void main(String[] args)
	{
		
		WebDriver driver= new FirefoxDriver();
		boolean isvalid=false;
		String URL="file:///C:/Users/anand/Desktop/DoubleClick/BrokenImage.html";
		driver.get(URL);
		List<WebElement> brokenimages=driver.findElements(By.tagName("img"));
		System.out.println(brokenimages.size());
		for(int i=0;i<brokenimages.size();i++)
		{
			String images=brokenimages.get(i).getAttribute("src");
			if(images!=null && images!="" )
				isvalid=getResponseCode(images);
			System.out.println(isvalid);
			if(isvalid)
			{
				System.out.println("valid Image"+images);
				
			}
			
			else
			{
				System.out.println("BrokenImage"+images);
			}
			
		}
	}


public static boolean getResponseCode(String chkimage)
{ 
	boolean validResponse = false; 

	try 
     
 {
	
	HttpResponse urlresp = new DefaultHttpClient().execute(new HttpGet(chkimage)); 
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


