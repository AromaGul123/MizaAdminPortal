package Testcases;

import General.Main;
import PageObjects.createFixedAmount;
import PageObjects.promoObjects;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLException;

public class createFixedAmountPromo extends Main{

    @Test
    public static void fixedAmount() throws InterruptedException
    {
        //loginTestcase.loginIntoMiza();
        Thread.sleep(2000);
        promoObjects ob = new promoObjects(driver);
        ob.clickPromos();
        createFixedAmount obj = new createFixedAmount(driver);
        obj.clickCreate();
        Thread.sleep(1000);
        obj.promoDetail();
        Thread.sleep(1000);
        obj.discountDetails();
        Thread.sleep(1000);
        obj.restriction();
        Thread.sleep(2000);
        obj.yes();
        Thread.sleep(5000);
    }



}
