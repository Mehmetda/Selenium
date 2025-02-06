package Step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class C01_Step_Definitions {


    @Given(": Amazon sitesine git")
    public void amazon_sitesine_git() {
        System.out.println("Amazon sitesine gidildi");

    }

    @Given(": login Butonuna tıkla")
    public void login_butonuna_tıkla() {
        System.out.println("Login Butonuna tıklanıldı");

    }

    @Given(": İsim gir")
    public void isim_gir() {
        System.out.println("isim gir");

    }

    @Given(": şifre gir")
    public void şifre_gir() {
        System.out.println("isim gir");

    }

    @When(": submit butonuna tıkla")
    public void submit_butonuna_tıkla() {
        System.out.println("submit butonuna tıklanıldı");

    }
    @Then(": Success mesajını verify et")
    public void success_mesajını_verify_et() {

    }

}