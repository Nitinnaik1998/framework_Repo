package practice_package;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Practice_With_Selenium_SelectClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.flipkart.com/");
		
		WebElement loginbutton=driver.findElement(By.xpath("//span[text()='Login']"));
		Actions action=new Actions(driver);
		action.moveToElement(loginbutton).perform();Thread.sleep(2000);
		
		WebElement fblogo=driver.findElement(By.className("OPpkAJ"));Thread.sleep(8000);
		action.scrollToElement(fblogo).perform();
		
		
		WebElement cartButton=driver.findElement(By.className("dFnvU1"));
		action.moveToElement(cartButton).perform();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(cartButton));
		TakesScreenshot tks=(TakesScreenshot)driver;
		File src=tks.getScreenshotAs(OutputType.FILE);
		File loc=new File(".\\Babu\\Ranubabucartoon1.png");
		FileUtils.copyFile(src, loc);
		driver.quit();
	}

}
