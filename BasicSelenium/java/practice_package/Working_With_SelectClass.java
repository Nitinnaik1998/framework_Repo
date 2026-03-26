package practice_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_SelectClass {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/reg/?entry_point=login&next=");Thread.sleep(2000);
	
	WebElement day=driver.findElement(By.name("birthday_day"));Thread.sleep(2000);
	day.click();
	
	Select s=new Select(day);
	s.selectByVisibleText("1");
	
	Thread.sleep(2000);
	s.selectByVisibleText("10");
	
	
	
	WebElement month=driver.findElement(By.id("month"));
	month.click();
	Select s1=new Select(month);
	s1.selectByValue("7");
	
	
	WebElement year=driver.findElement(By.xpath("//select[@title=\"Year\"]"));
	year.click();
	Select s3=new Select(year);
	s3.selectByVisibleText("1998");
	
	driver.quit();
}
}
