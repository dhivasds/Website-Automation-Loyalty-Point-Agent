package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class QuotaProductPage extends PageObject {

//    *Selector
    private By sidebarQuotaProduct(){ return By.xpath("//span[normalize-space()='Quota Product']");}
    private By fieldName(){ return By.xpath("//input[@placeholder='Name']");}
    private By fieldDescription(){ return By.xpath("//input[@placeholder='Description']");}
    private By fieldStock(){ return By.xpath("//input[@placeholder='Stock']");}
    private By fieldProviderId(){ return By.xpath("//input[@placeholder='Provider Id']");}
    private By fieldGrossAmount(){ return By.xpath("//input[@placeholder='Gross Amount']");}
    private By fieldProviderName(){ return By.xpath("//input[@placeholder='Provider Name']");}
    private By buttonUpdate(){ return By.xpath("button[type='submit']");}
    private By quota4GB(){ return By.xpath("(//td[contains(text(),'Quota 4GB')])[1]");}
    private By fieldSearch(){ return By.xpath("//input[@placeholder='Search . . .']");}

//    *Validation
    private By successAddData(){ return By.xpath("//h2[normalize-space()='Quota Product']");}
    private By failedAddData(){ return By.xpath("//h2[normalize-space()='Failed Add Data!']");}


    @Step
    public void clickSidebarQuotaProduct(){ $(sidebarQuotaProduct()).click();}
    @Step
    public void inputFieldName(String name){ $(fieldName()).sendKeys(name);}
    @Step
    public void inputFieldDescription(String description){ $(fieldDescription()).sendKeys(description);}
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
    public void inputFieldSearch(){ $(fieldSearch()).sendKeys("Quota 4GB");}


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
    public boolean verifyQuota4GB() { return $(quota4GB()).isDisplayed();}
    @Step
    public boolean verifyQuota4GBEquals() { return $(quota4GB()).equals("Quota 4GB");}

}
