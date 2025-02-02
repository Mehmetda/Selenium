package Driver_Methodları;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driver_navigate_methodları {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        //driver.close();

        driver.quit();



    }
}
