package Step_Definitions;

import Pages.contact_us_page_source;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.abstract_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.module.Configuration;

public class C02_contactus_page_definitions extends abstract_class {

    contact_us_page_source contactus_page=new contact_us_page_source();


    private WebDriver driver;
    @Given("navigate to website")
    public void navigate_to_website() {
        driver=Driver.getDriver();
        driver.get(ConfigReader.getProperty("url"));



    }

    @Given("click on contact us button")
    public void click_on_contact_us_button() {

        clickcontactus(contactus_page.contactus);
        System.out.println(contact_us_page_source.contactus.getText());


    }

    @Given("Select subject headıng")
    public void select_subject_headıng() {

    }

    @Given("type email")
    public void type_email() {

    }

    @Given("type order reference")
    public void type_order_reference() {

    }

    @Given("type a message")
    public void type_a_message() {

    }

    @When("Click on submit button")
    public void click_on_submit_button() {

    }

    @Then("Verify success message")
    public void verify_success_message() {

    }
}
