package Testcases;

import General.Main;
import PageObjects.packagesAddObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class packagesAdd extends Main{

    @Test (description = "Adding packages in APP via admin panel")
    public void AddPackage() throws InterruptedException {

      //loginTestcase.loginIntoMiza();
        packagesAddObjects obj = new packagesAddObjects(driver);
        obj.clickPackages();
        Thread.sleep(2000);
        obj.clickCreate();
        Thread.sleep(2000);
        obj.uploadImage();
        Thread.sleep(2000);
        obj.enterDetails();
        Thread.sleep(2000);
        obj.searchProduct();
        Thread.sleep(5000);
        obj.saveDetail();
        Thread.sleep(3000);
        obj.yes();
        Thread.sleep(1000);
        boolean result = obj.successMessage();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);
        System.out.println("Assertion is "+result);


    }


}



