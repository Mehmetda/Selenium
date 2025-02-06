package Action_Class;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C01_Action_Class {
    WebDriver driver;
    @Test
    public void test() {

        Actions action = new Actions(driver);
       WebElement element= driver.findElement(By.xpath("//input[@type='text']"));

        action.sendKeys(element, Keys.ENTER).perform();
    }

}
