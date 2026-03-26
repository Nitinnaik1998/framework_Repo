package Advanced_Selenium_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTestReadDataFromRunTime {
		
    @Test
	public void seleniumTest() throws Exception {
    	FileInputStream fis=new FileInputStream("C:\\Users\\nitin\\OneDrive\\Desktop\\commonData.txt");

		Properties pObj=new Properties();
		pObj.load(fis);
		
	    String BROWSER=pObj.getProperty("Browser");
	    String URL=pObj.getProperty("Url");
	    String USERNAME=pObj.getProperty("username");
	    String PASSWORD=pObj.getProperty("password");
	    
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
    }
	}


