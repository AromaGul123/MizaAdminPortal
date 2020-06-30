package Testcases;

import General.Main;
import PageObjects.packagesAddObjects;
import PageObjects.packagesEditObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class packagesEdit extends Main{

    @Test (description = "Updating packages in APP via admin panel")
    public void EditPackage() throws InterruptedException {

        //loginTestcase.loginIntoMiza();
        packagesEditObjects obj = new packagesEditObjects(driver);
        obj.clickPackages();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(2000);
        obj.uploadImage();
        Thread.sleep(2000);
        obj.enterDetails();
        Thread.sleep(2000);
        obj.saveDetail();
        Thread.sleep(2000);
        obj.yes();
       // Thread.sleep(1000);
        boolean result = obj.successMessage();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);
    }


}



