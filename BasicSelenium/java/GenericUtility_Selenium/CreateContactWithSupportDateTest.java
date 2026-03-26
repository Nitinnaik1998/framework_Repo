package GenericUtility_Selenium;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
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

public class CreateContactWithSupportDateTest {
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
			String lastName=row.getCell(2).toString()+randomInt;
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
		//step1:login to app
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(username);Thread.sleep(3000);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		//step2:navigate to organize module
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		
		Date dateobj=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String startDate=sim.format(dateobj);
		
		
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 30);
		String endDate=sim.format(cal.getTime());

		
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.id("jscal_field_support_start_date")).clear();
		driver.findElement(By.id("jscal_field_support_start_date")).sendKeys(startDate);
		
        driver.findElement(By.id("jscal_field_support_end_date")).clear();
        driver.findElement(By.id("jscal_field_support_end_date")).sendKeys(endDate);
		
		

		
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		//Veriy Header Expected Result
		String headerInfo=driver.findElement(By.className("dvHeaderText")).getText();
		if(headerInfo.contains(lastName)) {
			System.out.println(lastName+"is created==PASS");
		}else {
			System.out.println(lastName+"is not created==FAIL");
		}
		
		String actStartDate=driver.findElement(By.id("dtlview_Support Start Date")).getText();
		if(actStartDate.contains(startDate)) {
			System.out.println(startDate+"is created==PASS");
		}else {
			System.out.println(startDate+"is not created==FAIL");
		}
		
		
		String actLastDate=driver.findElement(By.id("mouseArea_Support End Date")).getText();
		if(actLastDate.contains(endDate)) {
			System.out.println(endDate+"is created==PASS");
		}else {
			System.out.println(endDate+"is not created==FAIL");
		}
		driver.quit();
}
}



