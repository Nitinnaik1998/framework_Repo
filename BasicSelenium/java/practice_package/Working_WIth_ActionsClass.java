package practice_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_WIth_ActionsClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Actions action=new Actions(driver);
		
		WebElement lastElement=driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
		
		//action.scrollToElement(lastElement);Thread.sleep(3000);
		
		action.scrollByAmount(20, 0);Thread.sleep(2000);
		
		driver.quit();
	}

}
