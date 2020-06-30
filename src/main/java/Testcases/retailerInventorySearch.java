package Testcases;

import General.Main;
import PageObjects.promoObjects;
import PageObjects.retailerInventorySearchObjects;
import org.testng.annotations.Test;
import static General.Main.driver;


public class retailerInventorySearch extends Main{

    @Test (description = "Searching retailers by name,address and service area")
    public void SearchRetailerInventory() throws InterruptedException {

        //loginTestcase.loginIntoMiza();
        retailerInventorySearchObjects obj = new retailerInventorySearchObjects(driver);
       // obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailersInventory();
        Thread.sleep(1000);
        obj.searchText();
        Thread.sleep(5000);

    }


}



