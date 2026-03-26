package practice_package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Handling_MultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");Thread.sleep(2000);
		
		WebElement facebook=driver.findElement(By.linkText("Facebook"));
		facebook.click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> childwindows=driver.getWindowHandles();
		
		System.out.println(childwindows);
		
		for (String window : childwindows) {
			driver.switchTo().window(window);
			String title=driver.getTitle();
			System.out.println(title);
			
		}
		driver.switchTo().window(parentwindow);
		driver.close();
		
	
	}
	

}
