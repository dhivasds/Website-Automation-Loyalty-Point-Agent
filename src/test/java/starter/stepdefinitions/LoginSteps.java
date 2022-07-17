package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Given("I am on the homepage page")
    public void iAmOnTheHomepagePage() { loginPage.openUrl("https://bishapay-beta.netlify.app/");}

    @When("I click button signin")
    public void iClickButtonSignin() { loginPage.clickButtonLogin();}

    @And("I input {string} email")
    public void iInputEmail(String email) throws InterruptedException {
        loginPage.inputFieldEmail(email);
    }

    @And("I input {string} password")
    public void iInputPassword(String password) throws InterruptedException { loginPage.inputFieldPassword(password);}

    @And("I click button login")
    public void iClickButtonLogin() throws InterruptedException { loginPage.clickButtonLoginAccount();}

    @Then("I get the {string}")
    public void iGetThe(String result)  {
        if (result.equals("redirectAdminPage")){
            loginPage.verifySuccessLogin();
            loginPage.verifySuccessLoginEquals();
        }else if (result.equals("accountNotRegistered")){
            loginPage.verifyFailedLogin();
        }else if (result.equals("invalidEmail")){
            loginPage.verifyEmailInvalid();
            loginPage.verifyEmailInvalidEquals();
        }else if (result.equals("invalidPassword")){
            loginPage.verifyPasswordRequired();
            loginPage.verifyPasswordRequiredEquals();
        }else if (result.equals("lessPassword")){
            loginPage.verifyLessPasswordRequired();
            loginPage.verifyLessPasswordRequiredEquals();
        }else if (result.equals("emailRequired")){
            loginPage.verifyEmailRequired();
            loginPage.verifyEmailRequiredEquals();
        }else {
            loginPage.verifyPasswordRequired();
            loginPage.verifyPasswordRequiredEquals();
        }
    }
}
