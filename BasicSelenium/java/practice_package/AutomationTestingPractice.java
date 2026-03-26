package practice_package;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingPractice {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	    driver.findElement(By.id("name")).sendKeys("Nitin Naik");
	    driver.findElement(By.id("email")).sendKeys("Nitinnaik@gmail.com");
	    driver.findElement(By.id("phone")).sendKeys("9886197645");
	    driver.findElement(By.id("textarea")).sendKeys("Anjandri institue,near kattriguppe ");
	    
	    driver.findElement(By.id("male")).click();
	    driver.findElement(By.id("sunday")).click();
	    
	    WebElement country=driver.findElement(By.id("country"));
	    country.click();
	    Select s=new Select(country);
	    s.selectByValue("india");
	    
	    Actions a=new Actions(driver);
	    WebElement colour=driver.findElement(By.id("colors"));Thread.sleep(3000);
	    
    colour.click();
    WebElement blueColour=driver.findElement(By.xpath("//option[@value=\"blue\"]"));
    a.scrollToElement(blueColour);
    
    WebElement animals=driver.findElement(By.id("animals"));Thread.sleep(3000);
    animals.click();
    WebElement catAnimal=driver.findElement(By.xpath("//option[@value=\"rabbit\"]"));
    a.scrollToElement(catAnimal);
    
    WebElement chooseFileButton=driver.findElement(By.id("singleFileInput"));
    a.moveToElement(chooseFileButton);Thread.sleep(3000);
    a.scrollByAmount(0, 30);
    
   WebElement calendar= driver.findElement(By.id("datepicker"));
   a.sendKeys(calendar, "01/07/1998").perform();
    
    
    
    
	    
	    
	    
	    WebElement position=driver.findElement(By.id("draggable"));
	    WebElement endPosition=driver.findElement(By.id("droppable"));
	    a.dragAndDrop(position, endPosition).perform();
	    a.clickAndHold(position).moveToElement(endPosition).release().perform();Thread.sleep(3000);
	    
	    
	    TakesScreenshot tks=(TakesScreenshot)driver;
	    File src=tks.getScreenshotAs(OutputType.FILE);
	    File loc=new File(".\\techpyra\\raghavmotu.png");
	    FileUtils.copyFile(src, loc);
	    
	    
	    driver.quit();
	    
	    
	    
	}

}
