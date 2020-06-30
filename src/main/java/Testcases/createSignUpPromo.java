package Testcases;

import General.Main;
import General.WebDriverWaits;
import PageObjects.createSignUp;
import PageObjects.promoObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class createSignUpPromo extends Main {

    public static String discountOption = "Fixed";

    @Test (description = "Creating sign up promo code")
    public static void SignUp() throws InterruptedException {
        loginTestcase.LoginIntoMiza();
        WebDriverWaits.sleep(3000);
        promoObjects ob = new promoObjects(driver);
        ob.clickPromos();
        createSignUp obj = new createSignUp(driver,wait);
        obj.clickCreate();
        WebDriverWaits.sleep(1000);
        obj.promoDetail();
        WebDriverWaits.sleep(1000);
        obj.clickSignUp();
        WebDriverWaits.sleep(1000);
        obj.discountType(discountOption);
        WebDriverWaits.sleep(1000);
        obj.discountDetails();
        WebDriverWaits.sleep(1000);
        obj.restriction();
        WebDriverWaits.sleep(2000);
        obj.yes();
        WebDriverWaits.sleep(1000);
        boolean expected_result = obj.successMessage();
        //Thread.sleep(2000);
        Assert.assertTrue(expected_result);
        WebDriverWaits.sleep(5000);
    }


}
