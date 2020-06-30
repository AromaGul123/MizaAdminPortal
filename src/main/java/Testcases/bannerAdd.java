package Testcases;

import General.Main;
import PageObjects.bannerAddObjects;
import org.testng.annotations.Test;


public class bannerAdd extends Main{

    @Test (description = "Adding banner to APP via Admin Panel")
    public void AddBanner() throws InterruptedException {

        loginTestcase.LoginIntoMiza();
        bannerAddObjects obj = new bannerAddObjects(driver,wait);
        obj.ClickAppBanners();
        Thread.sleep(2000);
        obj.UploadImage();
        Thread.sleep(5000);

    }


}



