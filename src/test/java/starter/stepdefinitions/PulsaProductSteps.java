package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.PulsaProductPage;

public class PulsaProductSteps {

    @Steps
    PulsaProductPage pulsaProductPage;

    @When("I click sidebar Pulsa Product")
    public void iClickSidebarPulsaProduct() { pulsaProductPage.clickSidebarPulsaProduct();}

    @And("I input field {string} name in pulsa product")
    public void iInputFieldNameInPulsaProduct(String name) { pulsaProductPage.inputFieldName(name);}

    @And("I input field {string} denom in pulsa product")
    public void iInputFieldDenomInPulsaProduct(String denom) { pulsaProductPage.inputFieldDenom(denom);}

    @And("I input field {string} stock in pulsa product")
    public void iInputFieldStockInPulsaProduct(String stock) { pulsaProductPage.inputFieldStock(stock);}

    @And("I input field {string} provider id in pulsa product")
    public void iInputFieldProviderIdInPulsaProduct(String providerId) { pulsaProductPage.inputFieldProviderId(providerId);}

    @And("I input field {string} gross amount in pulsa product")
    public void iInputFieldGrossAmountInPulsaProduct(String grossAmount) { pulsaProductPage.inputFieldGrossAmount(grossAmount);}

    @And("I input field {string} provider name in pulsa product")
    public void iInputFieldProviderNameInPulsaProduct(String providerName) { pulsaProductPage.inputFieldProviderName(providerName);}

    @Then("I get the {string} pulsa product")
    public void iGetThePulsaProduct(String result) {
        if (result.equals("redirectPulsaProductPage")){
            pulsaProductPage.verifyAddData();
            pulsaProductPage.verifyAddDataEquals();
        }else {
            pulsaProductPage.verifyFailedData();
            pulsaProductPage.verifyFailedDataEquals();
        }
    }

    //  ! TC 2
    @And("I click update")
    public void iClickUpdate() { pulsaProductPage.clickButtonUpdate();}

    //  ! TC Delete
    @Then("I get the result pulsa product")
    public void iGetTheResultPulsaProduct() {
        pulsaProductPage.verifyAddData();
        pulsaProductPage.verifyAddDataEquals();
    }

    //  ! TC Search
    @And("I input field search pulsa product")
    public void iInputFieldSearchPulsaProduct() { pulsaProductPage.inputFieldSearch();}

    @Then("I get the result pulsa product using search")
    public void iGetTheResultPulsaProductUsingSearch() {
        pulsaProductPage.verifyPulsa10K();
        pulsaProductPage.verifyPulsa10KEquals();
    }


}
