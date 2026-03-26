package Data_Driven_Testing;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Property_File {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(".\\commonData\\1commondata.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		WebDriver driver = null;
		String BROWSER=pObj.getProperty("Browser");
		String URL=pObj.getProperty("Url");
		String username=pObj.getProperty("username");
		String password=pObj.getProperty("password");
		
		if(BROWSER.equals("Chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equals("Edge")) {
			driver=new EdgeDriver();
		}else if(BROWSER.equals("FireFox")) {
			driver=new FirefoxDriver();
		}else
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(username);Thread.sleep(3000);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.quit();
}
}
