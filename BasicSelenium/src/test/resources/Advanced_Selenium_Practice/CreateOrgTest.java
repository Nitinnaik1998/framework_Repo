package Advanced_Selenium_Practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CreateOrgTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\nitin\\OneDrive\\Desktop\\commonData.txt");

		Properties pObj=new Properties();
		pObj.load(fis);
		
	    String BROWSER=pObj.getProperty("Browser");
	    String URL=pObj.getProperty("Url");
	    String USERNAME=pObj.getProperty("username");
	    String PASSWORD=pObj.getProperty("password");
	    //System.out.println("B:"+BROWSER+" url:"+URL+" un:"+USERNAME+" pwd:"+PASSWORD);
	    
	  /*  Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Browser");
	    String browser=s.next();*/
	    
	    WebDriver driver=null;
	    if(BROWSER.equalsIgnoreCase("Chrome")) {
	    	driver=new ChromeDriver();
	    }else if(BROWSER.equalsIgnoreCase("firefox")) {
	    	driver=new FirefoxDriver();
	    }else if(BROWSER.equalsIgnoreCase("edge")) {
	    	driver=new EdgeDriver();
	    }else {
	    	driver= new ChromeDriver();
	    }
	  
	    
	   
	    driver.get(URL);
		
		 
		 driver.findElement(By.name("user_name")).sendKeys("admin");
		 driver.findElement(By.name("user_password")).sendKeys("admin");
		 driver.findElement(By.id("submitButton")).click();
		  
		 driver.findElement(By.linkText("Organizations")).click(); 
		 driver.quit();
	
	}

}
