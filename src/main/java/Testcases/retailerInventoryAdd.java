package Testcases;

import General.Main;
import PageObjects.retailerInventoryAddObjects;
import PageObjects.retailerInventorySearchObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class retailerInventoryAdd extends Main{

    @Test(description = "Adding retailer in retailer inventory")
    public void AddRetailerInventory() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        retailerInventoryAddObjects obj = new retailerInventoryAddObjects(driver);
        obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailersInventory();
        Thread.sleep(2000);
        obj.clickAdd();
        Thread.sleep(1000);
        obj.createNewHub();
        Thread.sleep(2000);
        obj.hubType("Hub");
        Thread.sleep(2000);
        obj.serviceAreas("Tripoli area");
        Thread.sleep(2000);
        obj.create();
        Thread.sleep(2000);
        obj.yesNo();
        Thread.sleep(1000);
        boolean result = obj.successMessage();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);

    }


}



