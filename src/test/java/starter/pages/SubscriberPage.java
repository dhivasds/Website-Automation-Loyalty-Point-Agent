package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SubscriberPage extends PageObject {

//    *Selector
    private By sidebarSubscriber(){ return By.xpath("//span[normalize-space()='Subscribe']");}
    private By fieldSearch(){ return By.xpath("//input[@placeholder='Search . . .']");}
    private By textSubs(){ return By.xpath("//h2[normalize-space()='Subscribe']");}

//    *Validation
    private By successDeleteData(){ return By.xpath("//h2[normalize-space()='Subscribe']");}
    private By findData(){ return By.xpath("//td[normalize-space()='dhivasds@gmail.com']");}


    @Step
    public void clickSidebarSubscriber(){$(sidebarSubscriber()).click();}
    @Step
    public void inputFieldSearch(){ $(fieldSearch()).sendKeys("dhivasds@gmail.com");}


//    *Equals
    @Step
    public boolean verifySearch() { return $(findData()).isDisplayed();}
    @Step
    public boolean verifySearchEquals() { return $(findData()).equals("dhivasds@gmail.com");}

    @Step
    public boolean verifyTeksSubs() { return $(textSubs()).isDisplayed();}
    @Step
    public boolean verifyTeksSubsEquals() { return $(textSubs()).equals("Subscribe");}
}
