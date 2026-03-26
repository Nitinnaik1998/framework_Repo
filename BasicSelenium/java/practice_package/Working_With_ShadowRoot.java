package practice_package;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_ShadowRoot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/"); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[contains(text(),'Shadow')]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Shadow Root']")).click();Thread.sleep(2000);
		
		SearchContext shadow_host = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();Thread.sleep(2000);
		shadow_host.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Raghavmoti");Thread.sleep(2000);
		
		
		SearchContext shadow_host2= driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();Thread.sleep(2000);
		shadow_host2.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("JAYARAJ@123");Thread.sleep(2000);
		
		driver.quit();
	}

}
