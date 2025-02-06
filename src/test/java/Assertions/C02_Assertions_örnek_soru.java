package Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C02_Assertions_örnek_soru {

    WebDriver driver;


    //1. Launch browser

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://automationexercise.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }


    //2. Navigate to url 'http://automationexercise.com'


    //3. Verify that home page is visible successfully

    @Test
    public void test02() {
        Actions action = new Actions(driver);

        WebElement logo = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));

        Assert.assertTrue(logo.isDisplayed());

        driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();

        WebElement doğrulamayazısı= driver.findElement(By.xpath("//h2[text()='New User Signup!']"));

        Assert.assertTrue(doğrulamayazısı.isDisplayed());

        WebElement isimkutusu=driver.findElement(By.xpath("//input[@type='text']"));

        action.sendKeys(isimkutusu,"mehmet").perform();

        driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("mehmetgokmendag@gmail.com");

        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        WebElement doğrulamayazısı2= driver.findElement(By.xpath("//b[text()='Enter Account Information']"));

        Assert.assertTrue(doğrulamayazısı2.isDisplayed());

        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();


        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hasan5224");
        driver.findElement(By.xpath("//select[@id='days']")).sendKeys("26");
        driver.findElement(By.xpath("//select[@id='months']")).sendKeys("October");
        driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1995"+Keys.TAB+Keys.TAB);


        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Mehmet");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("DAĞ");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("UITETOOOO");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("SABIRLI ALAPLI ZONGULDAK");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("GAZİANTEP");
        driver.findElement(By.xpath("//option[text()='New Zealand']")).click();
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("ANKARA");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("SABIRLI");
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("0006");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("78346476734667");
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

        WebElement dogrulamayazısı3= driver.findElement(By.xpath("//b[text()='Account Created!']"));
        Assert.assertTrue(dogrulamayazısı3.isDisplayed());

        driver.findElement(By.xpath("//a[text()='Continue']")).click();

        WebElement dogrulamayazısı4= driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        Assert.assertTrue(dogrulamayazısı4.isDisplayed());
driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();

WebElement açıklamayazısı5= driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
Assert.assertTrue(açıklamayazısı5.isDisplayed());
driver.findElement(By.xpath("//a[text()='Continue']")).click();
    }

}


        //4. Click on 'Signup / Login' button



        //5. Verify 'New User Signup!' is visible
        //6. Enter name and email address
        //7. Click 'Signup' button
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible


        //9. Fill details: Title, Name, Email, Password, Date of birth
        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'


        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button


        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button







