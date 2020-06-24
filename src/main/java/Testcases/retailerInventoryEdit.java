package Testcases;

import General.Main;
import PageObjects.retailerInventoryAddObjects;
import PageObjects.retailerInventoryEditObjects;
import org.testng.annotations.Test;


public class retailerInventoryEdit extends Main{

    @Test
    public void editRetailerInventory() throws InterruptedException {

        loginTestcase.loginIntoMiza();
        retailerInventoryEditObjects obj = new retailerInventoryEditObjects(driver);
        obj.clickRetailers();
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
        Thread.sleep(4000);

    }


}



