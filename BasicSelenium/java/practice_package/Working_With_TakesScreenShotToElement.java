package practice_package;

import java.io.File;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Working_With_TakesScreenShotToElement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demowebshop.tricentis.com/login");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=driver.findElement(By.xpath("//input[@type=\"submit\"]")).getScreenshotAs(OutputType.FILE);
		File loc=new File("./sneharaju/SecondSceenShot.png");
		FileUtils.copyFile(src, loc);
		driver.quit();
		
	}

}
