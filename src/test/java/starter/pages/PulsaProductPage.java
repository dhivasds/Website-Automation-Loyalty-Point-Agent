package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PulsaProductPage extends PageObject {



//    *Selector
    private By sidebarPulsaProduct(){ return By.xpath("//span[normalize-space()='Pulsa Product']");}
    private By fieldName(){ return By.xpath("//input[@placeholder='Name']");}
    private By fieldDenom(){ return By.xpath("//input[@placeholder='Denom']");}
    private By fieldStock(){ return By.xpath("//input[@placeholder='Stock']");}
    private By fieldProviderId(){ return By.xpath("//input[@placeholder='Provider Id']");}
    private By fieldGrossAmount(){ return By.xpath("//input[@placeholder='Gross Amount']");}
    private By fieldProviderName(){ return By.xpath("//input[@placeholder='Provider Name']");}
    private By buttonUpdate(){ return By.xpath("button[type='submit']");}
    private By pulsa10K(){ return By.xpath("(//td[contains(text(),'PULSA 10K')])[1]");}
    private By fieldSearch(){ return By.xpath("//input[@placeholder='Search . . .']");}

//    *Validation
    private By successAddData(){ return By.xpath("//h2[normalize-space()='Pulsa Product']");}
    private By failedAddData(){ return By.xpath("//h2[normalize-space()='Failed Add Data!']");}

    @Step
    public void clickSidebarPulsaProduct(){ $(sidebarPulsaProduct()).click();}
    @Step
    public void inputFieldName(String name){ $(fieldName()).sendKeys(name);}
    @Step
    public void inputFieldDenom(String denom){ $(fieldDenom()).sendKeys(denom);}
    @Step
    public void inputFieldStock(String stock){ $(fieldStock()).sendKeys(stock);}
    @Step
    public void inputFieldProviderId(String providerId){ $(fieldProviderId()).sendKeys(providerId);}
    @Step
    public void inputFieldGrossAmount(String grossAmount){ $(fieldGrossAmount()).sendKeys(grossAmount);}
    @Step
    public void inputFieldProviderName(String providerName){ $(fieldProviderName()).sendKeys(providerName);}
    @Step
    public void clickButtonUpdate(){$(buttonUpdate()).click();}
    @Step
    public void inputFieldSearch(){ $(fieldSearch()).sendKeys("Pulsa 10K");}


//    *Equals
    @Step
    public boolean verifyAddData() { return $(successAddData()).isDisplayed();}
    @Step
    public boolean verifyAddDataEquals() { return $(successAddData()).equals("Pulsa Product");}

    @Step
    public boolean verifyFailedData() { return $(failedAddData()).isDisplayed();}
    @Step
    public boolean verifyFailedDataEquals() { return $(failedAddData()).equals("Failed Add Data!");}

    @Step
    public boolean verifyPulsa10K() { return $(pulsa10K()).isDisplayed();}
    @Step
    public boolean verifyPulsa10KEquals() { return $(pulsa10K()).equals("Pulsa 10K");}
}
