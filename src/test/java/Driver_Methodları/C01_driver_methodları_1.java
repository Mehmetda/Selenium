package Driver_Methodları;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_methodları_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        System.out.println("sayfa title : "+ driver.getTitle());

        System.out.println("sayfa url : "+driver.getCurrentUrl());

        System.out.println("============================================");

        System.out.println(driver.getPageSource());

        System.out.println("============================================");

        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getWindowHandles());

    }
}
