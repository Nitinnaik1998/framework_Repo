package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sanjay_DragAndDrop {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
	
	Actions a=new Actions(driver);
    WebElement position=driver.findElement(By.xpath("//div[@class=\"draggable\"]"));
    WebElement endPosition=driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
    a.dragAndDrop(position, endPosition).perform();Thread.sleep(2000);
    a.clickAndHold(position).moveToElement(endPosition).release().perform();Thread.sleep(2000);
    
   
	/*
	 * WebElement positionlaptop=driver.findElement(By.xpath(
	 * "//div[@class=\"draggable\"]/..//div[2]")); WebElement
	 * endPositionlaptop=driver.findElement(By.
	 * xpath("//div[text()=\"Laptop Accessories\"]/..")); a.dragAndDrop(
	 * positionlaptop,endPositionlaptop).perform();Thread.sleep(2000);
	 * a.clickAndHold(positionlaptop).moveToElement(endPositionlaptop).release().
	 * perform();
	 */
	driver.quit();
	
	
}
}
