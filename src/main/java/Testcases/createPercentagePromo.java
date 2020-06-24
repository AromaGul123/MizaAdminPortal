package Testcases;

import General.Main;
import PageObjects.createFixedAmount;
import PageObjects.createPercentage;
import PageObjects.promoObjects;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLException;

public class createPercentagePromo extends Main{

    @Test
    public static void percentage() throws InterruptedException {
            //loginTestcase.loginIntoMiza();
            Thread.sleep(2000);
            promoObjects ob = new promoObjects(driver);
            ob.clickPromos();
            createPercentage obj = new createPercentage(driver);
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
            Thread.sleep(5000);
        }
    }

