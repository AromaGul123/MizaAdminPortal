package Testcases;

import General.Main;
import PageObjects.retailerInventoryStatusObjects;
import PageObjects.retailerInventoryViewRecordObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class retailerInventoryViewRecord extends Main {

    @Test (description = "Viewing record in retailer inventory")
    public void ViewRetailerInventory() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        retailerInventoryViewRecordObjects obj = new retailerInventoryViewRecordObjects(driver);
        //obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailersInventory();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(1000);
        boolean result = obj.idNumber();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);

    }


}



