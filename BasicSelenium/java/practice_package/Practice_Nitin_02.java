package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Nitin_02 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.flipkart.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement button=driver.findElement(By.xpath("//span[text()='Login']"));
		button.getTagName();
		button.getText();
		button.getAttribute("a");
	
		
		WebElement textfield=driver.findElement(By.name("q"));
		textfield.sendKeys("raghavmoti");
		textfield.clear();
		
		WebElement button2=driver.findElement(By.xpath("//span[text()='Login']"));
		button2.click();

		System.out.println(button2.getSize());
		System.out.println(button2.getAttribute("id"));
		
		
		
//		
//		String pagesource=driver.getPageSource();
//		System.out.println(pagesource);
//		
//		String title=driver.getTitle();
//		System.out.println(title);
//		
//		String windowhandle=driver.getWindowHandle();
//		System.out.println(windowhandle);
//		
//		Set<String> windowhandles=driver.getWindowHandles();
//		System.out.println(windowhandles);
		
		driver.quit();
	}

}
