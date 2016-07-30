package Package.Links;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HrefUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://ask.com");
		String Expurl=driver.findElement(By.linkText("EDUCATION")).getAttribute("href");
		driver.findElement(By.linkText("EDUCATION")).click();
		String Cur_url=driver.getCurrentUrl();
		System.out.println(Cur_url);
		System.out.println(Expurl);

		if(Cur_url.contains(Expurl))
			
		{
			
			System.out.println("Link is working correctly");
		}
			else
			{
				System.out.println("Link is incorrect");
			}

	}

}
