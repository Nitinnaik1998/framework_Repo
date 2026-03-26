package practice_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_ShadowRoot_Close {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Shadow Root Elements']")).click();Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()='Shadow Root']")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Close Shadow Root']")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).perform();Thread.sleep(2000);
		
		action.sendKeys("Ranu my bestie").perform();
		
		action.sendKeys(Keys.TAB).perform();Thread.sleep(2000);
		
		action.sendKeys("HAYAVADANA@1234").perform();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
