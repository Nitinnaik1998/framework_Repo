package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_On_WebElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailInput=driver.findElement(By.id("Email"));
		emailInput.sendKeys("mahendramodi@gmail.com");
		WebElement passwordInput=driver.findElement(By.id("Password"));
		passwordInput.sendKeys("123456");
		WebElement loginBtn=driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
		loginBtn.click();
		WebElement emailInput2=driver.findElement(By.id("Email"));
		emailInput2.sendKeys("mahendramodi@gmail.com");
		WebElement passwordInput2=driver.findElement(By.id("Password"));
		passwordInput2.sendKeys("123456");
		WebElement loginBtn2=driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
		loginBtn.click();
		
		WebElement books=driver.findElement(By.partialLinkText("Books"));
		books.click();
		
		driver.quit();
	}

}
