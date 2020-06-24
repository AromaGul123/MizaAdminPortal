package Testcases;

import General.Main;
import PageObjects.createFixedAmount;
import PageObjects.createFreeDelivery;
import PageObjects.promoObjects;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLException;

public class createFreeDeliveryPromo extends Main{

@Test
public static void freeDelivery() throws InterruptedException {
   // loginTestcase.loginIntoMiza();
    Thread.sleep(2000);
    promoObjects ob = new promoObjects(driver);
    ob.clickPromos();
    createFreeDelivery obj = new createFreeDelivery(driver);
    obj.clickCreate();
    Thread.sleep(1000);
    obj.promoDetail();
    Thread.sleep(1000);
    obj.clickFreeDelivery();
    Thread.sleep(1000);
    obj.restriction();
    Thread.sleep(2000);
    obj.yes();
    Thread.sleep(5000);
}


}
