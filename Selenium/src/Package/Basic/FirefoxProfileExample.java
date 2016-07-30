package Package.Basic;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pi = new ProfilesIni();
		FirefoxProfile fp= pi.getProfile("MyProfile");
		FirefoxDriver driver= new FirefoxDriver(fp);
		driver.get("http://google.com");
		
		

	}

}
