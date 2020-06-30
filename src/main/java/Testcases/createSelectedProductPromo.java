package Testcases;

import General.Main;
import PageObjects.createSelectedProduct;
import PageObjects.promoObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class createSelectedProductPromo extends Main {

    public static String discountOption = "Fixed";

    @Test (description = "Creating selected product promo code")
    public static void SelectedProduct() throws InterruptedException {
        loginTestcase.LoginIntoMiza();
        Thread.sleep(3000);
        promoObjects ob = new promoObjects(driver);
        ob.clickPromos();
        createSelectedProduct obj = new createSelectedProduct(driver,wait);
        obj.clickCreate();
        Thread.sleep(1000);
        obj.promoDetail();
        Thread.sleep(1000);
        obj.clickSelectedProduct();
        Thread.sleep(1000);
        obj.discountType(discountOption);
        Thread.sleep(1000);
        obj.discountDetails();
        Thread.sleep(1000);
        obj.product();
        Thread.sleep(2000);
        obj.restriction();
        Thread.sleep(2000);
        obj.yes();
        Thread.sleep(1000);
        boolean result = obj.successMessage();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);
        System.out.println("Assertion is "+result);
    }


}
