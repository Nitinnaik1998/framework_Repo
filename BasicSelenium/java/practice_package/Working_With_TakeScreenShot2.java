package practice_package;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_TakeScreenShot2 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://open.spotify.com/?flow_ctx=6df98c20-1cd4-4fa1-a9f6-674f1fc004df%3A1769619021");
		
	    driver.findElement(By.className("UTAdrJMU_kwRYbxi")).click();
		
		List<WebElement> songslist=driver.findElements(By.xpath("//div[@data-testid=\"tracklist-row\"]"));
		
		for (WebElement list : songslist) {
			
			System.out.print(list.getText());
			
		}
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File loc=new File(".\\ranuraghavmoti\\newfile.png");
		FileUtils.copyFile(src, loc);
		
		driver.quit();
		
	}

}
