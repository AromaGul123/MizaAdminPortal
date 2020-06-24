package Testcases;

import General.Main;
import PageObjects.bannerAddObjects;
import org.testng.annotations.Test;


public class bannerAdd extends Main{

    @Test
    public void addBanner() throws InterruptedException {

        //loginTestcase.loginIntoMiza();
        bannerAddObjects obj = new bannerAddObjects(driver);
        obj.clickAppBanners();
        Thread.sleep(2000);
      //  obj.clickAdd();
        // Thread.sleep(2000);
        obj.uploadImage();
        Thread.sleep(5000);

    }


}



