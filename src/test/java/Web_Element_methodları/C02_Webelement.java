package Web_Element_methodları;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class C02_Webelement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("test");
        driver.findElement(By.xpath("//button[@value='1']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement geçersizyazısı= driver.findElement(By.xpath("//div[@class='_9ay7']"));

        if(geçersizyazısı.isDisplayed()){
            System.out.println(geçersizyazısı.getText());
            System.out.println("test geçti giriş başarısız");

        }
        else{
            System.out.println("başarısız tes");
        }
        driver.close();



    }
}
