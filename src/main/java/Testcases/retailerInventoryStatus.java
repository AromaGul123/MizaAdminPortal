package Testcases;

import General.Main;
import PageObjects.retailerInventorySearchObjects;
import PageObjects.retailerInventoryStatusObjects;
import org.testng.annotations.Test;

import static General.Main.driver;


public class retailerInventoryStatus extends Main {

//    public static String option = "Yes";
    @Test
    public void statusRetailerInventory() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        retailerInventoryStatusObjects obj = new retailerInventoryStatusObjects(driver);
       // obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailersInventory();
        Thread.sleep(2000);
        obj.activeStatus();
        Thread.sleep(2000);
        obj.yesNo();
        Thread.sleep(5000);
    }


}



