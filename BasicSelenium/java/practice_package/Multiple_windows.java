package practice_package;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_windows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login?ReturnUrl=%2fcustomer%2finfo");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(3000);
		
		Set<String> allwids=driver.getWindowHandles();
		
		for (String wids : allwids) {
			driver.switchTo().window(wids);
			if(driver.getTitle().contains("facebook")) {
				System.out.println(driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(parent);
			
		}
		driver.quit();
		}
		
	}


		
	


