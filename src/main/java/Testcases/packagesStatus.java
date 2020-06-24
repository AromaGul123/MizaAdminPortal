package Testcases;

import General.Main;
import PageObjects.packagesStatusObjects;
import PageObjects.retailerInventoryStatusObjects;
import org.testng.annotations.Test;


public class packagesStatus extends Main {

    @Test
    public void statusPackages() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
       packagesStatusObjects obj = new packagesStatusObjects(driver);
        obj.clickPackages();
        Thread.sleep(1000);
        obj.activeStatus();
        Thread.sleep(2000);
        obj.yesNo();
        Thread.sleep(5000);
    }


}



