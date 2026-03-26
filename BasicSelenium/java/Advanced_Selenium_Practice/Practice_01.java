package Advanced_Selenium_Practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_01 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/login");

        // Mouse hover on "Computers"
        WebElement computersMenu = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(computersMenu).perform();

        // Fetch submenu items
        List<WebElement> subMenuItems = driver.findElements(
                By.xpath("//a[contains(text(),'Compu')]/..//ul")
        );

        
        for (WebElement item : subMenuItems) {
            System.out.println(item.getText());
        }

        driver.quit();
    }
}