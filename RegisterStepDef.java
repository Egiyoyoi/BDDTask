package starter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegisterStepDef {
    @And("user input email data")
    public void userInputEmailData() {
        System.out.println("mteguhpratama02@gmail.com");
    }

    @And("user input password data")
    public void userInputPasswordData() {
        System.out.println("Timun_m4s");
    }

    @And("user input phone number data")
    public void userInputPhoneNumberData() {
        System.out.println("085275632156");
    }

    @When("user click {string}")
    public void userClick(String arg0) {
        System.out.println("Create Account");
    }

    @Then("user should be redirected to homepage")
    public void userShouldBeRedirectedToHomepage() {
        System.out.println("redirected to Homepage");
    }

    @And("user input username")
    public void userInputUsername() {
        System.out.println("Sambal_Matah");
    }

    @When("user click \"Please Complete Required Fields")
    public void userClickPleaseCompleteRequiredFields() {
        System.out.println("Please Complet Required Fields");
    }

    @Then("Captcha pop up")
    public void captchaPopUp() {
    }

    @When("user click Sign up with Google")
    public void userClickSignUpWithGoogle() {
        System.out.println("Click Google button");
    }
}
