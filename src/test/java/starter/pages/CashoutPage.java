package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CashoutPage extends PageObject {


//    *Selector
    private By sidebarCashoutProduct(){ return By.xpath("//span[normalize-space()='Cashout Product']");}
    private By fieldName(){ return By.xpath("//input[@placeholder='Name']");}
    private By fieldCoinAmount(){ return By.xpath("//input[@placeholder='Coin Amount']");}
    private By fieldBalanceAmount(){ return By.xpath("//input[@placeholder='Balance Amount']");}
    private By cashout1000(){ return By.xpath("(//td[normalize-space()='Cashout 1000'])[1]");}
    private By fieldSearch(){ return By.xpath("//input[@placeholder='Search . . .']");}

//    *Validation
    private By successAddData(){ return By.xpath("//h2[normalize-space()='Cashout Product']");}
    private By failedAddData(){ return By.xpath("//h2[normalize-space()='Failed Add Data!']");}


    @Step
    public void clickSidebarCashoutProduct(){ $(sidebarCashoutProduct()).click();}
    @Step
    public void inputFieldName(String name){ $(fieldName()).sendKeys(name);}
    @Step
    public void inputFieldCoinAmount(String coinAmount){ $(fieldCoinAmount()).sendKeys(coinAmount);}
    @Step
    public void inputFieldBalanceAmount(String balanceAmount){ $(fieldBalanceAmount()).sendKeys(balanceAmount);}
    @Step
    public void inputFieldSearch(){ $(fieldSearch()).sendKeys("Cashout 1000");}


    //    *Equals
    @Step
    public boolean verifyAddData() { return $(successAddData()).isDisplayed();}
    @Step
    public boolean verifyAddDataEquals() { return $(successAddData()).equals("Cashout Product");}

    @Step
    public boolean verifyFailedData() { return $(failedAddData()).isDisplayed();}
    @Step
    public boolean verifyFailedDataEquals() { return $(failedAddData()).equals("Failed Add Data!");}

    @Step
    public boolean verifyCashout1000() { return $(cashout1000()).isDisplayed();}
    @Step
    public boolean verifyCashout1000Equals() { return $(cashout1000()).equals("Cashout 1000");}
}
