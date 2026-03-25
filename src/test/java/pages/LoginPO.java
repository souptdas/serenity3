package pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPO  extends PageObject {

    @FindBy(id = "user-name")
    private WebElementFacade usernameField;

    @FindBy(id = "password")
    private WebElementFacade passwordFiled;



    @FindBy(xpath="//*[@id='login-button']")
    private WebElementFacade loginbtn;

    public void submitionofLoginData(String username, String password)
    {
        usernameField.waitUntilVisible().type(username);
        passwordFiled.waitUntilVisible().type(password);
        loginbtn.waitUntilClickable().click();
        dismissPasswordWarningIfPresent();
    }


    private void dismissPasswordWarningIfPresent() {
        List<WebElementFacade> passwordWarningTitles = findAll("//*[contains(normalize-space(),'Change your password')]");
        if (!passwordWarningTitles.isEmpty()) {
            List<WebElementFacade> okButtons = findAll("//button[normalize-space()='OK']");
            if (!okButtons.isEmpty() && okButtons.get(0).isVisible()) {
                okButtons.get(0).click();
            }
        }
    }

}




