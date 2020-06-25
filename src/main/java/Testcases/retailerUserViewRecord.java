package Testcases;

import General.Main;
import PageObjects.retailerInventoryViewRecordObjects;
import PageObjects.retailerUserViewRecordObjects;
import org.testng.annotations.Test;


public class retailerUserViewRecord extends Main {

    @Test
    public void viewRetailerUsers() throws InterruptedException {

        //loginTestcase.loginIntoMiza();
        retailerUserViewRecordObjects obj = new retailerUserViewRecordObjects(driver);
        //obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailerUsers();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(5000);

    }


}



