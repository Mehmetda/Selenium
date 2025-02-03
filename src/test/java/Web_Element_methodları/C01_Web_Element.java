package Web_Element_methodları;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Web_Element {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement aramakutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramakutusu.sendKeys("nutella");
        aramakutusu.submit();
        WebElement sonuçyazısı= driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println(sonuçyazısı.getText());
        driver.close();


    }
}
