package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_javascript {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	driver.findElement(By.xpath("//li[text()='Disabled']")).click();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('name').click();");Thread.sleep(3000);
	js.executeScript("document.getElementById('name').value='xyz';");Thread.sleep(3000);
	js.executeScript("document.getElementById('email').value='xyz@nitin.com';");Thread.sleep(3000);
	js.executeScript("document.getElementById('password').value='hjansdja';");Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	
	driver.quit();
}
}
