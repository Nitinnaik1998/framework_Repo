package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PurplleScript {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.purplle.com/");
		Actions action=new Actions(driver);
		WebElement shopButton=driver.findElement(By.partialLinkText("SHOP"));
		action.moveToElement(shopButton).perform();
		
		driver.quit();
	}

}
