package Testcases;

import General.Main;
import PageObjects.retailerInventorySearchObjects;
import PageObjects.retailerUserSearchObjects;
import org.testng.annotations.Test;


public class retailerUserSearch extends Main{

    @Test (description = "Searching retailer's user by name")
    public void SearchRetailerUser() throws InterruptedException  {

        //loginTestcase.loginIntoMiza();
        retailerUserSearchObjects obj = new retailerUserSearchObjects(driver);
        //obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailerUsers();
        Thread.sleep(1000);
        obj.searchText();
        Thread.sleep(5000);

    }


}



