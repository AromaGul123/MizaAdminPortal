package Testcases;

import General.Main;
import PageObjects.retailerInventorySearchObjects;
import PageObjects.retailerUserSearchObjects;
import org.testng.annotations.Test;


public class retailerUserSearch extends Main{

    @Test
    public void searchRetailerUser() throws InterruptedException  {

        //loginTestcase.loginIntoMiza();
        retailerUserSearchObjects obj = new retailerUserSearchObjects(driver);
        obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailerUsers();
        Thread.sleep(1000);
        obj.searchText();
        Thread.sleep(5000);

    }


}



