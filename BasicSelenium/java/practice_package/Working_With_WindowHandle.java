package practice_package;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demowebshop.tricentis.com/login?ReturnUrl=%2fcustomer%2finfo");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
			
		}
	}


