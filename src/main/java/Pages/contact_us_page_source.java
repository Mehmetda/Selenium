package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class contact_us_page_source {
    private WebDriver driver;
    public contact_us_page_source() {
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);



    }
    @FindBy(xpath="//a[text()=' Contact us']")
    public static WebElement contactus;




}
