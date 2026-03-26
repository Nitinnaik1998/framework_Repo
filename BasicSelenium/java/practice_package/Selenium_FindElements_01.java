package practice_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FindElements_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("https://onemillioncheckboxes.com/");
		
		driver.findElement(By.xpath("//button[text()='play alone']")).click();
		
		List<WebElement>elements=driver.findElements(By.xpath("//input"));
		
		for (WebElement checkboxes : elements) {
			checkboxes.click();
			
		}
		
		
	}

}
