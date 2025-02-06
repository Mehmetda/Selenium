package Pages;

import Utilities.Driver;
import Utilities.abstract_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register_page extends abstract_class {
    WebDriver driver;
    public register_page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
@FindBy(xpath="//a[text()=' Signup / Login']")
    private WebElement signup;
    @FindBy(xpath="//a[text()=' Signup / Login']")
    private WebElement isim1;
    @FindBy(xpath="(//input[@type='email'])[2]")
    private WebElement emailkutusu;


    public void clickSignup(){

        click(signup);
    }
    public void clickIsim(String isim){
        sendkeysfunction(isim1,isim);

    }
    public void clicksoyIsim(String soyisim){
        sendkeysfunction(emailkutusu,soyisim);

    }
}
