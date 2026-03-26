package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClosedShadowRoot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
        driver.findElement(By.xpath("//section[text()='Shadow Root Elements']")).click();Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()='Shadow Root']")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Close Shadow Root']")).click();Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.xpath("//h1[text()='Login']"));
		login.click();
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB);Thread.sleep(2000);
		action.sendKeys("Sonu username"+Keys.TAB).perform();Thread.sleep(2000);
		action.sendKeys("manupassword"+Keys.TAB).perform();Thread.sleep(2000);
        		
		driver.quit();
	}

}
