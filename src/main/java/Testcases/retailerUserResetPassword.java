package Testcases;

import General.Main;
import PageObjects.retailerUserResetPasswordObjects;
import PageObjects.retailerUserViewRecordObjects;
import org.testng.annotations.Test;


public class retailerUserResetPassword extends Main {

    @Test
    public void resetPasswordRetailerUsers() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        retailerUserResetPasswordObjects obj = new retailerUserResetPasswordObjects(driver);
       // obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailerUsers();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(4000);
        obj.resetPassword();
        Thread.sleep(4000);

    }


}



