package Testcases;

import General.Main;
import PageObjects.retailerInventoryFilterObjects;
import PageObjects.retailerUserFilterObjects;
import org.testng.annotations.Test;


public class retailerUserFilter extends Main{

    @Test (description = "Filtering retailer's users as all, active or inactive")
    public void FilterRetailerUser() throws InterruptedException {

        //loginTestcase.loginIntoMiza();
        retailerUserFilterObjects obj = new retailerUserFilterObjects(driver);
       // obj.clickRetailers();
        Thread.sleep(1000);
        obj.clickRetailerUser();
        Thread.sleep(1000);
        obj.selectFilter();
        Thread.sleep(1000);
        obj.selectOptions();
        Thread.sleep(5000);


    }


}



