package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.TopupProductPage;

public class TopupProductSteps {

    @Steps
    TopupProductPage topupProductPage;

    @Steps
    LoginPage loginPage;

    @Given("I am on the admin page")
    public void iAmOnTheAdminPage() throws InterruptedException {
        loginPage.openUrl("https://bishapay-beta.netlify.app/");
        loginPage.clickButtonLogin();
        loginPage.inputFieldEmail("admin@gmail.com");
        loginPage.inputFieldPassword("password");
        loginPage.clickButtonLoginAccount();
    }

    @When("I click sidebar Topup Product")
    public void iClickSidebarTopupProduct() { topupProductPage.clickSidebarTopupProduct();}

    @And("I click button Add New")
    public void iClickButtonAddNew() { topupProductPage.clickAddNew();}

    @And("I input field {string} name in top up product")
    public void iInputFieldNameInTopUpProduct(String name) { topupProductPage.inputFieldName(name);}

    @And("I input field {string} amount in top up product")
    public void iInputFieldAmountInTopUpProduct(String amount) { topupProductPage.inputFieldAmount(amount);}

    @And("I input field {string} gross amount in top up product")
    public void iInputFieldGrossAmountInTopUpProduct(String grossAmount) { topupProductPage.inputFieldGrossAmount(grossAmount);}

    @And("I click submit")
    public void iClickSubmit() { topupProductPage.clickButtonSubmit();}

    @Then("I get the {string} top up product")
    public void iGetTheAddTopUpProduct(String result) {
        if (result.equals("redirectTopupProductPage")){
            topupProductPage.verifyAddData();
            topupProductPage.verifyAddDataEquals();
        }else {
            topupProductPage.verifyFailedData();
            topupProductPage.verifyFailedDataEquals();
        }
    }


//  !TC Edit
    @When("I click button edit")
    public void iClickButtonEdit() { topupProductPage.clickButtonEdit();}

//  !TC Delete

    @When("I click button delete")
    public void iClickButtonDelete() { topupProductPage.clickButtonDelete();}

    @Then("I get the result top up product")
    public void iGetTheResultTopUpProduct() {
        topupProductPage.verifyAddData();
        topupProductPage.verifyAddDataEquals();
    }

//  !TC Search
    @When("I click button search")
    public void iClickButtonSearch() { topupProductPage.clickButtonSearch();}

    @And("I input field search topup product")
    public void iInputFieldSearch() { topupProductPage.inputFieldSearchTopup();}

    @Then("I get the result product using search")
    public void iGetTheResultProductUsingSearch() {
        topupProductPage.verifyProduct50K();
        topupProductPage.verifyProduct50KEquals();
    }


}
