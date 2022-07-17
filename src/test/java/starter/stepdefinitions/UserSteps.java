package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.UserPage;

public class UserSteps {

    @Steps
    UserPage userPage;

    @When("I click sidebar User")
    public void iClickSidebarUser() { userPage.clickSidebarUser();}

    @And("I input field {string} name in pulsa")
    public void iInputFieldNameInPulsa(String name) { userPage.inputFieldName(name);}

    @And("I input field {string} balance in pulsa")
    public void iInputFieldBalanceInPulsa(String balance) { userPage.inputFieldBalance(balance);}

    @And("I input field {string} phone in pulsa")
    public void iInputFieldPhoneInPulsa(String phone) { userPage.inputFieldPhone(phone);}

    @And("I input field {string} coin in pulsa")
    public void iInputFieldCoinInPulsa(String coin) { userPage.inputFieldCoin(coin);}

    @Then("I get the {string} pulsa")
    public void iGetThePulsa(String result) {
        if (result.equals("successUpdateData")){
            userPage.verifyUpdateData();
            userPage.verifyUpdateDataEquals();
        }else {
            userPage.verifyFailedUpdateData();
            userPage.verifyFailedUpdateDataEquals();
        }
    }

// ! TC Search
    @And("I input field search user")
    public void iInputFieldSearchUser() { userPage.inputFieldSearch();}

    @Then("I get the result user using search")
    public void iGetTheResultUserUsingSearch() {
        userPage.verifyUser();
        userPage.verifyUserEquals();
    }
}
