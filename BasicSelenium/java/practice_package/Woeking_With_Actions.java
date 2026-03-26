package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Woeking_With_Actions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailInput=driver.findElement(By.id("Email"));
		emailInput.sendKeys("mahendramodi@gmail.com");
		WebElement passwordInput=driver.findElement(By.id("Password"));
		passwordInput.sendKeys("123456");
		WebElement loginBtn=driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
		loginBtn.click();
		
		WebElement books=driver.findElement(By.partialLinkText("Books"));
		books.click();

		
		WebElement position=driver.findElement(By.id("products-orderby"));
		position.click();
		Select s=new Select(position);
		s.selectByVisibleText("Price: Low to High");
		
		WebElement display=driver.findElement(By.id("products-pagesize"));
		display.click();
		Select s1=new Select(display);
		s1.getFirstSelectedOption();
		s1.deselectAll();
		
		driver.quit();
		
		
	}

}
