package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CashoutPage;

public class CashoutSteps {

    @Steps
    CashoutPage cashoutPage;

    @When("I click sidebar Cashout Product")
    public void iClickSidebarCashoutProduct() { cashoutPage.clickSidebarCashoutProduct();}

    @And("I input field {string} name in cashout product")
    public void iInputFieldNameInCashoutProduct(String name) { cashoutPage.inputFieldName(name);}

    @And("I input field {string} coin Amount in cashout product")
    public void iInputFieldCoinAmountInCashoutProduct(String coinAmount) { cashoutPage.inputFieldCoinAmount(coinAmount);}

    @And("I input field {string} balance Amount in cashout product")
    public void iInputFieldBalanceAmountInCashoutProduct(String balanceAmount) { cashoutPage.inputFieldBalanceAmount(balanceAmount);}

    @Then("I get the {string} cashout product")
    public void iGetTheCashoutProduct(String result) {
        if (result.equals("redirectPulsaProductPage")){
            cashoutPage.verifyAddData();
            cashoutPage.verifyAddDataEquals();
        }else {
            cashoutPage.verifyFailedData();
            cashoutPage.verifyFailedDataEquals();
        }
    }


    //    ! TC Delete
    @Then("I get the result cashout product")
    public void iGetTheResultCashoutProduct() {
        cashoutPage.verifyAddData();
        cashoutPage.verifyAddDataEquals();
    }


    //    ! TC Search
    @And("I input field search cashout product")
    public void iInputFieldSearchCashoutProduct() { cashoutPage.inputFieldSearch();}

    @Then("I get the result cashout product using search")
    public void iGetTheResultCashoutProductUsingSearch() {
        cashoutPage.verifyCashout1000();
        cashoutPage.verifyCashout1000Equals();
    }
}
