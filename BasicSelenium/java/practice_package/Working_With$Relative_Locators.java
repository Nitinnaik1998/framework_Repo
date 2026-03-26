package practice_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Working_With$Relative_Locators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();Thread.sleep(2000);
		
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.toLeftOf(By.xpath("//input[@type=\"submit\"]"))).sendKeys("mobiles");
		
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.toRightOf(By.id("small-searchterms"))).click();
		
		driver.findElement(RelativeLocator.with(By.name(null)));
		
		
	}

}