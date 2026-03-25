package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class checkoutYourInfo extends PageObject {


    @FindBy(id = "first-name")
    private WebElementFacade firstName;

    @FindBy(id = "last-name")
    private WebElementFacade lastName;

    @FindBy(id = "postal-code")
    private WebElementFacade postalCode;

    @FindBy(id = "continue")
    private WebElementFacade continuebtn;

    public void checkoutInfoDatafill(String fname, String lname, String postalcode)
    {
        firstName.waitUntilVisible().type(fname);
        lastName.waitUntilVisible().type(lname);
        postalCode.waitUntilVisible().type(postalcode);
        continuebtn.waitUntilClickable().click();
    }



}
