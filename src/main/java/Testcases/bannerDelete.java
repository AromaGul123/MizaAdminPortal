package Testcases;

import General.Main;
import PageObjects.bannerDeleteObjects;
import org.testng.annotations.Test;


public class bannerDelete extends Main{

    @Test (description = "Deleting banner to APP via Admin Panel")
    public void DeleteBanner() throws InterruptedException {

        loginTestcase.LoginIntoMiza();
        bannerDeleteObjects obj = new bannerDeleteObjects(driver,wait);
        obj.ClickAppBanners();
        Thread.sleep(2000);
        obj.ClickDelete();
        Thread.sleep(2000);
        obj.ClickTick();
        Thread.sleep(5000);
    }


}



