package practice_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Locators {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//WebElement searchtextfield=driver.findElement(By.name("q"));
		
		//driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		//driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.quit();
		
	}

}
