package Package.DBConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mysql.jdbc.PreparedStatement;

public class DBConnectivityExampleTwo {

	FirefoxDriver driver= new FirefoxDriver();
	@BeforeMethod
	public void initialise()
	{
		
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.manage().window().maximize();
	
	}
	@Test
	public void Registration() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="world";
		String DBdriver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="v$vek@nand90";
		Class.forName(DBdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname,userName,password);
		
		java.sql.PreparedStatement psmt=conn.prepareStatement("select * from register");
		ResultSet rs=psmt.executeQuery();
		
		while(rs.next())
		{
		    driver.findElement(By.name("firstName")).sendKeys(rs.getString(1));
			driver.findElement(By.name("lastName")).sendKeys(rs.getString(2));
			driver.findElement(By.name("email")).sendKeys(rs.getString(3));
			driver.findElement(By.name("password")).sendKeys(rs.getString(4));
			driver.findElement(By.name("confirmPassword")).sendKeys(rs.getString(5));
			driver.findElement(By.name("register")).click();
			String LoginText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			
			if(LoginText.contains(rs.getString(3)))
				
			{
				System.out.println("The Registered user is" + ""+LoginText );
				
			}
			else
				
			{
				System.out.println("The UnRegistered user is" + ""+LoginText );	
				
			}
			driver.navigate().back();
			
		}
			
		
		
		
		
	}
}
