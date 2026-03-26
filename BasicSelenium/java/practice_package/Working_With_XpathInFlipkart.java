package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_XpathInFlipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		WebElement logintn=driver.findElement(By.xpath("//span[text()='Login']"));
		Actions action=new Actions(driver);
		action.moveToElement(logintn).perform();Thread.sleep(2000);
		
		WebElement giftcard=driver.findElement(By.xpath("//a[@title=\"Gift Cards\"]"));Thread.sleep(2000);
		action.moveToElement(giftcard).click().perform();
		
		
		driver.quit();
		//li[@class="nzkIpD"])[6]
	}

}
