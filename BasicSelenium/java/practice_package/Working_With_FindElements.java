package practice_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_FindElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");Thread.sleep(3000);
		
//		List<WebElement>fe=driver.findElements(By.xpath("//a"));
//		
//		for (WebElement web : fe) {
//			String text=web.getText();
//			System.out.println(text);
//			
//		}
//		driver.quit();
		
		driver.findElement(By.partialLinkText("Books")).click();Thread.sleep(3000);
		
		WebElement day=driver.findElement(By.id("products-pagesize"));Thread.sleep(3000);
		day.click();
		
		Select s=new Select(day);Thread.sleep(3000);
//		s.selectByVisibleText("12");
//		
		s.selectByValue("https://demowebshop.tricentis.com/books?pagesize=12");
		driver.quit();
		
		
		
	}
}
	

