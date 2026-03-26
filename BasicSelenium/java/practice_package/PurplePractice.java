package practice_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PurplePractice {
public static void main(String[] args) throws Throwable {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");

	WebDriver driver = new ChromeDriver(options);

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.purplle.com/");
	
	Actions action=new Actions(driver);
	WebElement shopButton=driver.findElement(By.partialLinkText("SHOP"));
	action.moveToElement(shopButton).perform();Thread.sleep(3000);
	
	WebElement skincare=driver.findElement(By.partialLinkText("Skin"));
	action.moveToElement(skincare).perform();Thread.sleep(3000);
	
	List<WebElement>allList=driver.findElements(By.xpath("(//div[contains(@class,'gap-3')])[3]"));
	{
	for (WebElement names : allList) {
		System.out.println(names.getText());
		
		}
	}
	
//	List<WebElement>allList=driver.findElements(By.className("d-flex"));
//	{
//		for (WebElement names : allList) {
//			System.out.println(names.getText());
//			
//		}
//	}
//	
	driver.quit();
}

}
