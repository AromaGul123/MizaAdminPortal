package Testcases;

import General.Main;
import PageObjects.retailerUserResetPasswordObjects;
import PageObjects.retailerUserViewRecordObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class retailerUserResetPassword extends Main {

    @Test (description = "Resetting password in retailer's users")
    public void ResetPasswordRetailerUsers() throws InterruptedException {

        //loginTestcase.loginIntoMiza();
        retailerUserResetPasswordObjects obj = new retailerUserResetPasswordObjects(driver);
       // obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailerUsers();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(4000);
        obj.resetPassword();
        Thread.sleep(1000);
        boolean result = obj.successMessage();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);

    }


}



