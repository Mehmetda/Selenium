package Driver_Methodları;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_driver_manage_methodları {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,900));

        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize().height);
        System.out.println(driver.manage().window().getSize().width);
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().fullscreen();
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().minimize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
}
