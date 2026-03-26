package Advanced_Selenium_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

public class CreateProjectAndVerifyDataInDbWithGUI {

	public static void main(String[] args) throws Throwable {
		
		Random random=new Random();
		int randomInt=random.nextInt(1000);
	 //create project in GUI
	 String expectedProjectName="Raghavmotu@"+randomInt;
     WebDriver driver=new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("http://49.249.28.218:8091/");
     
     driver.findElement(By.id("username")).sendKeys("rmgyantra");
     driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
     driver.findElement(By.xpath("//button[text()='Sign in']")).click();
     
     driver.findElement(By.linkText("Projects")).click();
     driver.findElement(By.xpath("//span[text()='Create Project']")).click();
     
     driver.findElement(By.name("projectName")).sendKeys(expectedProjectName);
     driver.findElement(By.name("createdBy")).sendKeys("rmgyantra");
     
     Select s=new Select(driver.findElement(By.xpath("//label[@class=\"col-form-label\"]/..//select")));
     s.selectByVisibleText("OnGoing");
     
     driver.findElement(By.xpath("//input[@value=\"Add Project\"]")).click();
     
     //Veriy the Project in Backend (Database)
     boolean flag=false;
     Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		
		//step 2:connect to database
		Connection conn=DriverManager.getConnection("jdbc:mysql://49.249.28.218:3307/ninza_hrm","root@%","root");
		System.out.println("DONE");
		
		//step 3:create Sql statement
		Statement stat=conn.createStatement();
		
		//step 4:execute select query & get result
		//ResultSet resultset=stat.executeQuery("select * from project");
		ResultSet resultset = stat.executeQuery("select * from project");
		
		while(resultset.next())
		{
			String actualProjectname=resultset.getString(4);
			if(expectedProjectName.equals(actualProjectname)) {
				flag=true;
				System.out.println(expectedProjectName+" is available ==Pass");
			}
		}
		if(flag==false) {
			System.out.println(expectedProjectName+"is not available ==FAIL");

		}

	conn.close();
	driver.quit();
	}
}



