package Testcases;

import General.Main;
import PageObjects.retailerInventoryStatusObjects;
import PageObjects.retailerUserStatusObjects;
import org.testng.annotations.Test;


public class retailerUserStatus extends Main {

//    public static String option = "Yes";
    @Test
    public void statusRetailerUser() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        retailerUserStatusObjects obj = new retailerUserStatusObjects(driver);
       // obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailerUsers();
        Thread.sleep(2000);
        obj.activeStatus();
        Thread.sleep(4000);
        obj.yesNo();
        Thread.sleep(5000);
    }


}



