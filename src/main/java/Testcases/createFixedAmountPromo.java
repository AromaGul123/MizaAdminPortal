package Testcases;

import General.Main;
import PageObjects.createFixedAmount;
import PageObjects.promoObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class createFixedAmountPromo extends Main{

    @Test (description = "Creating fixed amount promo code")
    public static void FixedAmount() throws InterruptedException
    {
        loginTestcase.LoginIntoMiza();
       // Thread.sleep(2000);
        promoObjects ob = new promoObjects(driver);
        ob.clickPromos();
        createFixedAmount obj = new createFixedAmount(driver,wait);
        obj.clickCreate();
        Thread.sleep(1000);
        obj.promoDetail();
        Thread.sleep(1000);
        obj.discountDetails();
        Thread.sleep(1000);
        obj.restriction();
        Thread.sleep(2000);
        obj.yes();
        Thread.sleep(1000);
        boolean result = obj.successMessage();
        //Thread.sleep(1000);
        Assert.assertTrue(result);
        Thread.sleep(5000);
        System.out.println("Assertion is "+result);

    }



}
