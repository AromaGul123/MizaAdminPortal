package Testcases;

import General.Main;
import PageObjects.bannerAddObjects;
import PageObjects.bannerDeleteObjects;
import org.testng.annotations.Test;


public class bannerDelete extends Main{

    @Test
    public void deleteBanner() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        bannerDeleteObjects obj = new bannerDeleteObjects(driver);
//        obj.clickAppBanners();
        Thread.sleep(2000);
        obj.clickDelete();
        Thread.sleep(2000);
        obj.clickTick();
        Thread.sleep(5000);
    }


}



