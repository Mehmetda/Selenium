package TESTNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C03_TestNg {
    WebDriver driver;
@Test
    public void test() {



    //1. Launch browser
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("http://automationexercise.com");
    //3. Verify that home page is visible successfully
    String expectedurl="https://1automationexercise.com/";
    String actualurl=driver.getCurrentUrl();
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertEquals(actualurl,expectedurl,"URL TESTİ");


    //4. Click on 'Signup / Login' button
    Actions action=new Actions(driver);
    action.click(driver.findElement(By.xpath("//a[text()=' Signup / Login']"))).perform();

    //5. Verify 'Login to your account' is visible
    WebElement loginyazısı=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
    softAssert.assertTrue(!loginyazısı.isDisplayed(),"YAZI GÖRÜNÜYORMU TESTİ");
    //6. Enter correct email address and password
    WebElement isimkutusu= driver.findElement(By.xpath("(//input[@type='email'])[1]"));
    action.sendKeys(isimkutusu,"mehmetgokmendag@gmail.com").perform();
    WebElement passwordkutusu= driver.findElement(By.xpath("(//input[@type='password'])[1]"));
    action.sendKeys(passwordkutusu,"hasan5224").perform();
    //7. Click 'login' button
    action.sendKeys(Keys.TAB,Keys.ENTER).perform();
    //8. Verify that 'Logged in as username' is visible
    WebElement yanlışyazısı=driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
    softAssert.assertTrue(!yanlışyazısı.isDisplayed(),"YAZI GÖRÜNME TESTİ 2");
    //9. Click 'Delete Account' button
    softAssert.assertAll();
    //10. Verify that 'ACCOUNT DELETED!' is visible





}

}
