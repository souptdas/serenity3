package steps;

import net.serenitybdd.annotations.Step;
import pages.LoginPO;
import pages.ProductPO;
import pages.checkoutPO;
import pages.checkoutYourInfo;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginSteps {
    LoginPO loginPO;
    ProductPO productPO;
    checkoutPO checkoutPO;
    checkoutYourInfo checkoutYourInfo;
    @Step
    public void onloginPage(String username, String password)
    {
        loginPO.open();
        loginPO.submitionofLoginData(username,password);
    }


    @Step
    public void addProduct(String prod1, String prod2)
    {
        productPO.SelectProd(prod1,prod2);
        productPO.clickoncart();
    }

    @Step
    public void checkOut()
    {
        checkoutPO.clickCheckout();
    }

    @Step
    public void checkoutInfoDatafill(String fname, String lname, String postalcode)
    {
        checkoutYourInfo.checkoutInfoDatafill(fname,lname,postalcode);
    }

    @Step
    public void checkoutOverView()
    {
        checkoutPO.clicfinishbtn();
    }
    
    @Step
    public void isThanku()
    {
        assertEquals("Thank you for your order!", checkoutPO.thankumessage());
    }

}
