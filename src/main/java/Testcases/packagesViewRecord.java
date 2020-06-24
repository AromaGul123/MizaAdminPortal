package Testcases;

import General.Main;
import PageObjects.packagesViewRecordObjects;
import PageObjects.promosViewRecordObjects;
import org.testng.annotations.Test;


public class packagesViewRecord extends Main {

    @Test
    public void viewPackages() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        packagesViewRecordObjects obj = new packagesViewRecordObjects(driver);
        obj.clickPromos();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(5000);

    }


}



