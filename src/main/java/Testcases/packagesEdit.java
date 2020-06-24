package Testcases;

import General.Main;
import PageObjects.packagesAddObjects;
import PageObjects.packagesEditObjects;
import org.testng.annotations.Test;


public class packagesEdit extends Main{

    @Test
    public void editPackage() throws InterruptedException {

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
        Thread.sleep(5000);
    }


}



