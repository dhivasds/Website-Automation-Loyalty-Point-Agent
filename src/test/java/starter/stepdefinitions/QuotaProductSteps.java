package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.QuotaProductPage;

public class QuotaProductSteps {

    @Steps
    QuotaProductPage quotaProductPage;

    @When("I click sidebar Quota Product")
    public void iClickSidebarQuotaProduct() { quotaProductPage.clickSidebarQuotaProduct();}

    @And("I input field {string} name in quota product")
    public void iInputFieldNameInQuotaProduct(String name) { quotaProductPage.inputFieldName(name);}

    @And("I input field {string} description in quota product")
    public void iInputFieldDescriptionInQuotaProduct(String description) { quotaProductPage.inputFieldDescription(description);}

    @And("I input field {string} stock in quota product")
    public void iInputFieldStockInQuotaProduct(String stock) { quotaProductPage.inputFieldStock(stock);}

    @And("I input field {string} provider id in quota product")
    public void iInputFieldProviderIdInQuotaProduct(String providerId) { quotaProductPage.inputFieldProviderId(providerId);}

    @And("I input field {string} gross amount in quota product")
    public void iInputFieldGrossAmountInQuotaProduct(String grossAmount) { quotaProductPage.inputFieldGrossAmount(grossAmount);}

    @And("I input field {string} provider name in quota product")
    public void iInputFieldProviderNameInQuotaProduct(String providerName) { quotaProductPage.inputFieldProviderName(providerName);}

    @Then("I get the {string} quota product")
    public void iGetTheQuotaProduct(String result) {
        if (result.equals("redirectTopupProductPage")){
            quotaProductPage.verifyAddData();
            quotaProductPage.verifyAddDataEquals();
        }else {
            quotaProductPage.verifyFailedData();
            quotaProductPage.verifyFailedDataEquals();
        }
    }




//   !TC Delete
    @Then("I get the result quota product")
    public void iGetTheResultQuotaProduct() {
        quotaProductPage.verifyAddData();
        quotaProductPage.verifyAddDataEquals();
    }


//    !TC Search
    @And("I input field search quota product")
    public void iInputFieldSearchQuotaProduct() { quotaProductPage.inputFieldSearch();}

    @Then("I get the result quota product using search")
    public void iGetTheResultQuotaProductUsingSearch() {
        quotaProductPage.verifyQuota4GB();
        quotaProductPage.verifyQuota4GBEquals();
    }


}
