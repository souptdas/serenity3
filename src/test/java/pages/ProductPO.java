package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ProductPO extends PageObject {

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    private WebElementFacade cartBtn;



    public void SelectProd(String prod1, String prod2)
    {
        cartBtn.waitUntilVisible();
        $("//div[text()='"+prod1+"']/ancestor::div[@class='inventory_item_label']/following-sibling::div[@class='pricebar']/button").click();
        $("//div[text()='"+prod2+"']/ancestor::div[@class='inventory_item_label']/following-sibling::div[@class='pricebar']/button").click();

    }
    public void clickoncart()
    {
        cartBtn.click();

    }
}
