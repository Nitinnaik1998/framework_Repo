package practice_package;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_WIth_MultipleWindows2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demowebshop.tricentis.com/login");Thread.sleep(2000);
		
		String currentWindow=driver.getWindowHandle();
		
		driver.findElement(By.linkText("Facebook")).click();
		
		Set<String> childwindows=driver.getWindowHandles();
		
		for (String window : childwindows) {
			driver.switchTo().window(window);
			
		
			if(driver.getTitle().contains("NopCommerce ")) {
				Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hamsaveni@gmail.com");Thread.sleep(3000);
			driver.close();
		
		}
		}
		driver.switchTo().window(currentWindow);Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();Thread.sleep(2000);
		driver.quit();
	}

}
