package Testcases;

import General.Main;
import PageObjects.packagesStatusObjects;
import PageObjects.retailerInventoryStatusObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class packagesStatus extends Main {

    @Test (description = "Activating inactive status and vice versa")
    public void StatusPackages() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        packagesStatusObjects obj = new packagesStatusObjects(driver);
        obj.clickPackages();
        Thread.sleep(1000);
        obj.activeStatus();
        Thread.sleep(2000);
        obj.yesNo();
        //Thread.sleep(1000);
        boolean result = obj.successMessage();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);
    }


}



