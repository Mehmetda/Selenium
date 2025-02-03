package JUNIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Junit_annotaions {
       WebDriver driver;

    @Before
    public   void setup(){

        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void teardown(){

        driver.close();
    }
    @org.junit.Test
    public void test01(){


        driver.get("https://www.facebook.com");


    }

    @org.junit.Test
    @Ignore
    public void test02(){


        driver.get("https://www.bestbuy.com");


    }

    @Test
    public void test03(){


        driver.get("https://www.amazon.com");


    }



}
