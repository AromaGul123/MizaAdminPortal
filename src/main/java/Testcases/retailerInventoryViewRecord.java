package Testcases;

import General.Main;
import PageObjects.retailerInventoryStatusObjects;
import PageObjects.retailerInventoryViewRecordObjects;
import org.testng.annotations.Test;


public class retailerInventoryViewRecord extends Main {

    @Test
    public void viewRetailerInventory() throws InterruptedException {

        loginTestcase.loginIntoMiza();
        retailerInventoryViewRecordObjects obj = new retailerInventoryViewRecordObjects(driver);
        obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailersInventory();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(2000);

    }


}



