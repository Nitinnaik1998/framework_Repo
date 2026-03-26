package GenericUtility_Selenium;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateOrganizationTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis1=new FileInputStream(".\\commonData\\1commondata.properties");
		Properties pObj=new Properties();
		pObj.load(fis1);
		
		String BROWSER=pObj.getProperty("Browser");
		String URL=pObj.getProperty("Url");
		String username=pObj.getProperty("username");
		String password=pObj.getProperty("password");
		
		Random random=new Random();
		int randomInt=random.nextInt(1000);
		
        FileInputStream fis=new FileInputStream(".\\commonData\\testScriptdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row row=sh.getRow(1);
		String organizationName=row.getCell(2).toString()+randomInt;
		wb.close();
		
		
		WebDriver driver = null;
		
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
		
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		
		driver.findElement(By.name("accountname")).sendKeys(organizationName);
		
		driver.findElement(By.name("ship_street")).sendKeys("INDIA"+randomInt);
		
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		//Veriy Header Expected Result
		String headerInfo=driver.findElement(By.className("dvHeaderText")).getText();
		if(headerInfo.contains(organizationName)) {
			System.out.println(organizationName+"is created==PASS");
		}else {
			System.out.println(organizationName+"is not created==FAIL");
		}
		
		String actOrgName=driver.findElement(By.id("mouseArea_Organization Name")).getText();
		if(actOrgName.contains(organizationName)) {
			System.out.println(organizationName+"is created==PASS");
		}else {
			System.out.println(organizationName+"is not created==FAIL");
		}
		driver.quit();
}
}
