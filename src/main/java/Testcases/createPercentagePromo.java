package Testcases;

import General.Main;
import PageObjects.createPercentage;
import PageObjects.promoObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class createPercentagePromo extends Main{

    @Test (description = "Creating percentage promo code")
    public static void Percentage() throws InterruptedException {
           loginTestcase.LoginIntoMiza();
            Thread.sleep(2000);
            promoObjects ob = new promoObjects(driver);
            ob.clickPromos();
            createPercentage obj = new createPercentage(driver,wait);
            obj.clickCreate();
            Thread.sleep(1000);
            obj.promoDetail();
            Thread.sleep(1000);
            obj.clickPercentage();
            Thread.sleep(1000);
            obj.discountDetails();
            Thread.sleep(1000);
            obj.restriction();
            Thread.sleep(2000);
            obj.yes();
            Thread.sleep(1000);
            boolean result = obj.successMessage();
           // Thread.sleep(2000);
            Assert.assertTrue(result);
            Thread.sleep(5000);
            System.out.println("Assertion is "+result);
        }
    }

