package practice_package;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_WebElement_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com");
		
//		//driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");Thread.sleep(2000);
//		//driver.findElement(By.id("small-searchterms")).clear();
//		//driver.findElement(By.id("small-searchterms")).sendKeys("Books");
//		
//		//driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();
//		
//		//String text=driver.findElement(By.linkText("Register")).getText();
//		//System.out.println(text);
//	
//		//String textfield_val=driver.findElement(By.id("small-searchterms")).getAttribute("Search store");
//		//System.out.println(textfield_val);
//		
//		driver.findElement(By.id("small-searchterms")).sendKeys("Raghavmotu");
//		String textfield_val2=driver.findElement(By.id("small-searchterms")).getAttribute("value");
//		System.out.println(textfield_val2);
//		
		
//		//get css value
//		String colorname=driver.findElement(By.linkText("Register")).getCssValue("color");
//		System.out.println(colorname);
//		String fontfamily=driver.findElement(By.linkText("Register")).getCssValue("font-family");
//		System.out.println(fontfamily);
//		
//		if(driver.findElement(By.id("small-searchterms")).isDisplayed()) {
//			driver.findElement(By.id("small-searchterms")).sendKeys("RAGHAVAMOTU");
//		}

		
		
//		List<WebElement> textfieldz=driver.findElements(By.xpath("//input[@type=\"text\"]"));
//	System.out.println(textfieldz);
//		
//		for(int i=0; i<=textfieldz.size()-1; i++) {
//			textfieldz.get(i).sendKeys("Nitinnaik");
//		}
//		for (WebElement el2 : textfieldz) {
//			el2.sendKeys("123");
		
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		for (WebElement link2 : links) {
			System.out.println(link2.getSize());
			System.out.println(link2.getText());
			
		}
		
		}
		}
	



