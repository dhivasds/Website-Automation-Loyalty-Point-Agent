package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class UserPage extends PageObject {

//    *Selector
    private By fieldName(){ return By.xpath("//input[@placeholder='Name']");}
    private By fieldBalance(){ return By.xpath("//input[@placeholder='Balance']");}
    private By fieldPhone(){ return By.xpath("//input[@placeholder='Phone']");}
    private By fieldCoin(){ return By.xpath("//input[@placeholder='Coin']");}
    private By sidebarUser(){ return By.xpath("//span[normalize-space()='User']");}
    private By fieldSearch(){ return By.xpath("//input[@placeholder='Search . . .']");}


//    *Validation
    private By successUpdateData(){ return By.xpath("//h2[normalize-space()='Data User']");}
    private By failedUpdateData(){ return By.xpath("//h2[normalize-space()='Failed Update Data!']");}


    @Step
    public void inputFieldName(String name){$(fieldName()).type(name);}
    @Step
    public void inputFieldBalance(String balance){$(fieldBalance()).type(balance);}
    @Step
    public void inputFieldPhone(String phone){$(fieldPhone()).type(phone);}
    @Step
    public void inputFieldCoin(String coin){$(fieldCoin()).type(coin);}
    @Step
    public void clickSidebarUser(){$(sidebarUser()).click();}
    @Step
    public void inputFieldSearch(){ $(fieldSearch()).sendKeys("dhivasds@gmail.com");}

//    *Equals
    @Step
    public boolean verifyUpdateData() { return $(successUpdateData()).isDisplayed();}
    @Step
    public boolean verifyUpdateDataEquals() { return $(successUpdateData()).equals("Data User");}

    @Step
    public boolean verifyFailedUpdateData() { return $(failedUpdateData()).isDisplayed();}
    @Step
    public boolean verifyFailedUpdateDataEquals() { return $(failedUpdateData()).equals("Failed Update Data!");}

    @Step
    public boolean verifyUser() { return $(fieldSearch()).isDisplayed();}
    @Step
    public boolean verifyUserEquals() { return $(fieldSearch()).equals("dhivasds@gmail.com");}
}
