package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe_Alerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		driver.findElement(By.xpath("//a[text()='Window Alert Frame']")).click();Thread.sleep(2000);
		
	
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
	    driver.findElement(By.xpath("//button[text()='Pay Now']")).click();Thread.sleep(2000);
	    
	    driver.switchTo().alert().dismiss();Thread.sleep(2000);
	    
	    
	    
	    
//	    driver.findElement(By.id("username")).sendKeys("abc2123");
//	    driver.findElement(By.id("password")).sendKeys("abc2123");
//	    driver.findElement(By.id("submitButton")).click();
//		driver.switchTo().frame(0);Thread.sleep(2000);
//		driver.switchTo().frame(0);Thread.sleep(2000);
//		driver.switchTo().frame(0);Thread.sleep(2000);
//		
//     driver.findElement(By.id("email")).sendKeys("amail.hsjs");
////		
//		driver.switchTo().parentFrame();
//		
//		driver.switchTo().frame(1);Thread.sleep(2000);//*[@id="container"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[2]/div[2]/div/div/div/ul/a[7]/li
//		
//		driver.findElement(By.id("password")).sendKeys("amail.hsjs");
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame(2);Thread.sleep(2000);
//		driver.findElement(By.id("confirm")).sendKeys("amail.hsjs");
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame(3);
//		driver.findElement(By.id("submitButton")).click();
//		
//		driver.findElement(By.id("email")).sendKeys("abbdjas@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("abbdjas123gmail.com");
//		driver.findElement(By.id("confirm-password")).sendKeys("abbdjas123gmail.com");
//		
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(1);Thread.sleep(2000);
//		driver.findElement(By.id("username")).sendKeys("abbdjas@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("abbdjas@gmail.com");
//		
		
		
	driver.quit();
	}

}
