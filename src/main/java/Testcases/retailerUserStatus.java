package Testcases;

import General.Main;
import PageObjects.retailerInventoryStatusObjects;
import PageObjects.retailerUserStatusObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class retailerUserStatus extends Main {

//    public static String option = "Yes";
    @Test (description = "Activating inactive status and vice versa")
    public void StatusRetailerUser() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        retailerUserStatusObjects obj = new retailerUserStatusObjects(driver);
       // obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailerUsers();
        Thread.sleep(2000);
        obj.activeStatus();
        Thread.sleep(4000);
        obj.yesNo();
        Thread.sleep(1000);
        boolean result = obj.successMessage();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);
    }


}



