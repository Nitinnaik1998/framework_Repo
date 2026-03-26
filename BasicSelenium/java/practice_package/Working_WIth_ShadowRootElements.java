package practice_package;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Working_WIth_ShadowRootElements {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		
		driver.findElement(By.xpath("//section[text()='Shadow Root Elements']")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Open Shadow Root']"));
		
		SearchContext shadowhost =driver.findElement(By.xpath("//form/div")).getShadowRoot();
		shadowhost.findElement(By.cssSelector("input[placeholder=\"Enter your username\"]")).sendKeys("Nitin123");
		Thread.sleep(2000);
		
		SearchContext shadowhost2=driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		shadowhost2.findElement(By.cssSelector("input[placeholder=\"Enter your password\"]")).sendKeys("Abcsd12hfjdnfvdjkvn");Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		
		driver.quit();
	}

}
