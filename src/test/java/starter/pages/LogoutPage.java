package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
//    *Selector
    private By logoutButton = By.xpath("//span[normalize-space()='Logout']");

//    *Validation
    private By buttonDownload = By.xpath("//button[normalize-space()='Download Here']");


    public void clickLogoutButton() { $(logoutButton).click();}

    @Step
    public boolean verifyButtonDownload() { return $(buttonDownload).isDisplayed();}
    @Step
    public boolean verifyButtonDownloadEquals() { return $(buttonDownload).equals("Download Here'");}
}
