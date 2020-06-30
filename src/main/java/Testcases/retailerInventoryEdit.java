package Testcases;

import General.Main;
import PageObjects.retailerInventoryAddObjects;
import PageObjects.retailerInventoryEditObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class retailerInventoryEdit extends Main{

    @Test (description = "Updating retailer in retailer inventory")
    public void EditRetailerInventory() throws InterruptedException {

        //loginTestcase.loginIntoMiza();
        retailerInventoryEditObjects obj = new retailerInventoryEditObjects(driver);
        //obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailersInventory();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(1000);
        obj.editHub();
        Thread.sleep(2000);
        obj.editHubType("Warehouse");
        Thread.sleep(2000);
        obj.editServiceAreas("District Central");
        Thread.sleep(2000);
        obj.save();
        Thread.sleep(2000);
        obj.yesNo();
        Thread.sleep(1000);
        boolean result = obj.successMessage();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);

    }


}



