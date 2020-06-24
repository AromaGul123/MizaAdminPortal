package Testcases;

import General.Main;
import PageObjects.createPercentage;
import PageObjects.createSignUp;
import PageObjects.promoObjects;
import org.testng.annotations.Test;

public class createSignUpPromo extends Main {

    public static String discountOption = "Fixed";

    @Test
    public static void signUp() throws InterruptedException {
     //   loginTestcase.loginIntoMiza();
        Thread.sleep(3000);
        promoObjects ob = new promoObjects(driver);
        ob.clickPromos();
        createSignUp obj = new createSignUp(driver);
        obj.clickCreate();
        Thread.sleep(1000);
        obj.promoDetail();
        Thread.sleep(1000);
        obj.clickSignUp();
        Thread.sleep(1000);
        obj.discountType(discountOption);
        Thread.sleep(1000);
        obj.discountDetails();
        Thread.sleep(1000);
        obj.restriction();
        Thread.sleep(2000);
        obj.yes();
        Thread.sleep(5000);
    }


}
