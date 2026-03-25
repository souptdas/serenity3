package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class checkoutPO extends PageObject {

    @FindBy(id = "checkout")
    private WebElementFacade checkout;
    @FindBy(id="finish")
    private WebElementFacade finishbtn;

    @FindBy(xpath="//*[text()='Thank you for your order!']")
    private WebElementFacade thankumessage;


        //Local Branch Code
    public void clicfinishbtn()
    {
        finishbtn.waitUntilVisible().click();

    }

    public void clickCheckout() {
        checkout.waitUntilClickable().click();
    }

    public String thankumessage()
    {
        return thankumessage.waitUntilVisible().getText().trim();
    }



}
