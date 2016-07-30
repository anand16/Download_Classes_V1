package Package.DBConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectivityExampleOne {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="world";
		String DBdriver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="v$vek@nand90";
		Class.forName(DBdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname,userName,password);
		PreparedStatement psmt=conn.prepareStatement("select * from register");
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			for(int i=1;i<=5;i++)
			{
				System.out.print(rs.getString(i)+"   ");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
