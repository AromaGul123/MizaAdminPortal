package Testcases;

import General.Main;
import PageObjects.createSelectedProduct;
import PageObjects.createSignUp;
import PageObjects.promoObjects;
import org.testng.annotations.Test;

public class createSelectedProductPromo extends Main {

    public static String discountOption = "Fixed";

    @Test
    public static void selectedProduct() throws InterruptedException {
      //  loginTestcase.loginIntoMiza();
        Thread.sleep(3000);
        promoObjects ob = new promoObjects(driver);
        ob.clickPromos();
        createSelectedProduct obj = new createSelectedProduct(driver);
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
        Thread.sleep(5000);
    }


}
