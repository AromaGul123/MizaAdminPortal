package Testcases;

import General.Main;
import PageObjects.bannerAddObjects;
import PageObjects.packagesAddObjects;
import org.testng.annotations.Test;

import javax.swing.*;


public class packagesAdd extends Main{

    @Test
    public void addPackage() throws InterruptedException {

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
        Thread.sleep(5000);



    }


}



