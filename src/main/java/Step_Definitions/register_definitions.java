package Step_Definitions;

import Pages.register_page;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class register_definitions {
    register_page page=new register_page();
    private WebDriver driver=Driver.getDriver();


    @Then("email {string} giriniz")
    public void emailGiriniz(String soyisim) {
        page.clicksoyIsim(soyisim);
    }

    @When("name {string} giriniz")
    public void nameGiriniz(String isim) {
        page.clickIsim(isim);

    }



    @Then("click sign in button")
    public void clickSignInButton() {
        page.clickSignup();



    }

    @When("navigate to site")
    public void navigateToSite() {
        driver.get(ConfigReader.getProperty("url"));
    }

    @After
    public void after() {
        Driver.quitdriver();
    }






}


