package practice_package;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_WiTH_TakeScreenshot {
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File loc=new File("./ScreenShots/flipkart.png");
		FileHandler.copy(src, loc);
		driver.quit();
	}

}
