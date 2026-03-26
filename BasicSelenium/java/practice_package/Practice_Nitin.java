package practice_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Nitin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("I phone");Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		List<WebElement> phnames=driver.findElements(By.className("RG5Slk"));
		List<WebElement> pricevalue=driver.findElements(By.className("DeU9vF"));
		
		
		for (WebElement brandnames : phnames ) {
			
		
			for(WebElement price : pricevalue ) {
		
			
			System.out.println(price.getText()+" "+brandnames.getText());
			
			}
			
		}
		
		
	}
}
