package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class LoginPage extends PageObject {

//   *Selector
private By buttonLogin(){ return By.xpath("//button[normalize-space()='Log In']");}
private By fieldEmail(){ return By.xpath("//input[@placeholder='Type your e-mail']");}
private By fieldPassword(){ return By.xpath("//input[@placeholder='Type your password']");}
private By buttonLoginAcccount(){ return By.cssSelector("button[class='login-btn btn']");}
private By buttonShowPassword(){ return By.cssSelector("(//button[@class='button-hide'])[1]");}

//    *Validation
private By emailRequired(){ return By.xpath("//span[normalize-space()='Email is required!']");}
private By passwordRequired(){ return By.xpath("//span[normalize-space()='Password is required!']");}
private By lessPassword(){ return By.xpath("//span[contains(text(),'The length of password must be at least 8 character')]");}
private By emailInvalid(){ return By.xpath("//span[normalize-space()='The email address is invalid.']");}
private By succesLogin(){ return By.xpath("//h2[normalize-space()='Top Up Product']");}
private By failedLogin(){ return By.xpath("//h2[normalize-space()='Email or password incorrect']");}



    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl("https://bishapay-beta.netlify.app/");
    }

    @Step
    public void clickButtonLogin(){
        $(buttonLogin()).click();
    }

    @Step
    public void inputFieldEmail(String email) throws InterruptedException {
//    sleep(1000);
        $(fieldEmail()).type(email);
    }

    @Step
    public void inputFieldPassword(String password) throws InterruptedException {
//    sleep(1000);
    $(fieldPassword()).type(password);
//    $(buttonShowPassword()).click();
    }

    @Step
    public void clickButtonLoginAccount() throws InterruptedException {
        $(buttonLoginAcccount()).click();
        sleep(6000);
    }


    //  Equals
    @Step
    public boolean verifyEmailRequired() { return $(emailRequired()).isDisplayed();}
    @Step
    public boolean verifyEmailRequiredEquals() { return $(emailRequired()).equals("Email is required!");}

    @Step
    public boolean verifyPasswordRequired() { return $(passwordRequired()).isDisplayed();}
    @Step
    public boolean verifyPasswordRequiredEquals() { return $(passwordRequired()).equals("Password is required!");}

    @Step
    public boolean verifyLessPasswordRequired() { return $(lessPassword()).isDisplayed();}
    @Step
    public boolean verifyLessPasswordRequiredEquals() { return $(lessPassword()).equals("The length of password must be at least 8 character");}

    @Step
    public boolean verifyEmailInvalid() { return $(emailInvalid()).isDisplayed();}
    @Step
    public boolean verifyEmailInvalidEquals() { return $(emailInvalid()).equals("The email address is invalid.");}

    @Step
    public boolean verifySuccessLogin() { return $(succesLogin()).isDisplayed();}
    @Step
    public boolean verifySuccessLoginEquals() { return $(succesLogin()).equals("Top Up Product");}


//    Bug validation
    @Step
    public boolean verifyFailedLogin() { return $(failedLogin()).isDisplayed();}


}
