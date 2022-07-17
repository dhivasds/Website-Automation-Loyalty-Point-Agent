package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogoutPage;

public class LogoutSteps {

    @Steps
    LogoutPage logoutPage;

    @When("I click button logout")
    public void iClickButtonLogout() { logoutPage.clickLogoutButton(); }

    @Then("I successfully to logout")
    public void iSuccessfullyToLogout() {
        logoutPage.verifyButtonDownload();
        logoutPage.verifyButtonDownloadEquals();
    }
}
