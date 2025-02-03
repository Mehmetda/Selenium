package Web_Element_methodları;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_WebElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.bestbuy.com");
        List<WebElement> buttonlistesi=driver.findElements(By.tagName("button"));
        System.out.println(buttonlistesi.size());
        for (WebElement each : buttonlistesi) {
            System.out.println(each.getText());
        }
        driver.close();


    }
}
