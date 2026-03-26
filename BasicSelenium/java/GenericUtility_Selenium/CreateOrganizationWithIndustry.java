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
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationWithIndustry {
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
	
    FileInputStream fis=new FileInputStream(".\\commonData\\NitintestscriptdataExcel.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("org");
	Row row=sh.getRow(4);
	String organizationName=row.getCell(2).toString()+randomInt;
	String industry=row.getCell(3).toString();
	String type=row.getCell(4).toString();
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
	
	Select sel1=new Select(driver.findElement(By.name("industry")));
	sel1.selectByValue("Energy");
	Select sel2=new Select(driver.findElement(By.name("accounttype")));
	sel2.selectByValue("Press");
	

	driver.findElement(By.name("ship_street")).sendKeys("INDIA"+randomInt);
	driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
	
	String actIndustry=driver.findElement(By.id("dtlview_Industry")).getText();
	if(actIndustry.equals(industry)) {
		System.out.println(industry+"is information is verifeid==pass");
	}else {
		System.out.println(industry+"infromation is not verifeid==FAIL");
	}
	String actType=driver.findElement(By.id("mouseArea_Type")).getText();
	if(actType.equals(type)) {
		System.out.println(type+"is information is verifeid==pass");
	}else {
		System.out.println(type+"infromation is not verifeid==FAIL");
	}
	
	
	
    driver.quit();
}
}
