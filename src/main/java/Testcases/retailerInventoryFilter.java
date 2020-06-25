package Testcases;

import General.Main;
import PageObjects.retailerInventoryFilterObjects;
import PageObjects.retailerInventorySearchObjects;
import org.testng.annotations.Test;


public class retailerInventoryFilter extends Main{

    @Test
    public void filterRetailerInventory() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        retailerInventoryFilterObjects obj = new retailerInventoryFilterObjects(driver);
       // obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailersInventory();
        Thread.sleep(1000);
        obj.selectFilter();
        Thread.sleep(1000);
        obj.selectOptions();
        Thread.sleep(5000);

    }


}



