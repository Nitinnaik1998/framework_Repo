package practice_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Locators2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("nitin");
		driver.findElement(By.id("LastName")).sendKeys("naik");
		driver.findElement(By.id("Email")).sendKeys("naik@naik.com");
		driver.findElement(By.id("Password")).sendKeys("naik@naik.com");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("naik@naik.com");
		driver.findElement(By.id("register-button")).click();Thread.sleep(2000);
		
		
		
		
		driver.quit();
		
	}

}
