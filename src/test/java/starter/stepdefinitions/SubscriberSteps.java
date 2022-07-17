package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.SubscriberPage;

public class SubscriberSteps {

    @Steps
    SubscriberPage subscriberPage;

    @When("I click sidebar Subscriber")
    public void iClickSidebarSubscriber() { subscriberPage.clickSidebarSubscriber();}

    @And("I input field search subscriber")
    public void iInputFieldSearchSubscriber() { subscriberPage.inputFieldSearch();}

    @Then("I get the result subscriber using search")
    public void iGetTheResultSubscriberUsingSearch() {
        subscriberPage.verifySearch();
        subscriberPage.verifySearchEquals();
    }

//    ! TC Delete
    @Then("I get the result subscriber")
    public void iGetTheResultSubscriber() {
        subscriberPage.verifyTeksSubs();
        subscriberPage.verifyTeksSubsEquals();
    }
}
