package Testcases;

import General.Main;
import PageObjects.packagesViewRecordObjects;
import PageObjects.promosViewRecordObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class packagesViewRecord extends Main {

    @Test (description = "Viewing record in packages")
    public void ViewPackages() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        packagesViewRecordObjects obj = new packagesViewRecordObjects(driver);
        obj.clickPromos();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(1000);
        boolean result = obj.idNumber();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);

    }


}



