package Package.Links;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class GMailTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pri=new ProfilesIni();
		FirefoxProfile fpr= pri.getProfile("MyProfile");
		FirefoxDriver driver= new FirefoxDriver(fpr);
		driver.get("http://google.com");
		 driver.findElement(By.linkText("Gmail")).click();
		 String Title=driver.getTitle();
		 String ActualTitle="Gmail";
		 if (Title.equals(ActualTitle))
		 {	 
			 System.out.println("It is correct Title");
		 }
		 
		 else
		 {
			 System.out.println("It is incorrect Title");
			 
		 }

			

		}

	}


