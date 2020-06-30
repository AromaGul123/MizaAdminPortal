package Testcases;

import General.Main;
import PageObjects.createFreeDelivery;
import PageObjects.promoObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class createFreeDeliveryPromo extends Main{

@Test(description = "Creating free delivery promo code")
public static void FreeDelivery() throws InterruptedException {

    loginTestcase.LoginIntoMiza();
    Thread.sleep(2000);
    promoObjects ob = new promoObjects(driver);
    ob.clickPromos();
    createFreeDelivery obj = new createFreeDelivery(driver,wait);
    obj.clickCreate();
    Thread.sleep(1000);
    obj.promoDetail();
    Thread.sleep(1000);
    obj.clickFreeDelivery();
    Thread.sleep(1000);
    obj.restriction();
    Thread.sleep(2000);
    obj.yes();
    Thread.sleep(   1000);
    boolean result = obj.successMessage();
   // Thread.sleep(2000);
    Assert.assertTrue(result);
    Thread.sleep(5000);
    System.out.println("Assertion is "+result);
}


}
