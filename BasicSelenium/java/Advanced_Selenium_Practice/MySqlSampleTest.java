package Advanced_Selenium_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class MySqlSampleTest {
	public static void main(String[] args) throws Throwable {
		
		String expectedEmployeeName="amrutha";
		boolean flag=false;
		//step 1 :load /register the database driver
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		
		//step 2:connect to database
		Connection conn=DriverManager.getConnection("jdbc:mysql://49.249.28.218:3307/ninza_hrm", "root@%", "root");
		System.out.println("DONE");
		
		//step 3:create Sql statement
		Statement stat=conn.createStatement();
		
		//step 4:execute select query & get result
		//ResultSet resultset=stat.executeQuery("select * from project");
		ResultSet resultset = stat.executeQuery("select * from employee");
		
		while(resultset.next()) 
		{
			String actualemployeeName=resultset.getString(5);
		if(expectedEmployeeName.equals(actualemployeeName)) {
			flag=true;
			System.out.println(actualemployeeName +" is available==PASS");
			
		}
		}
		if(flag==false) {
			System.out.println(expectedEmployeeName+": is not available");
		}
		
			
		
		
		//step 5:close the connection
		conn.close();
		
	}

}

