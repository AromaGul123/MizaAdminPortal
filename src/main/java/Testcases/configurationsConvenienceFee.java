package Testcases;

import General.Main;
import PageObjects.bannerAddObjects;
import PageObjects.configurationsConvenienceFeeObjects;
import org.testng.annotations.Test;


public class configurationsConvenienceFee extends Main{

    @Test
    public void configurationsConvenienceFee() throws InterruptedException {

        //loginTestcase.loginIntoMiza();
        configurationsConvenienceFeeObjects obj = new configurationsConvenienceFeeObjects(driver);
        obj.clickConfigurations();
        Thread.sleep(2000);
        obj.selectConfig();
        Thread.sleep(3000);
        obj.selectConvenienceFeeValue();
        Thread.sleep(3000);
        obj.save();
        Thread.sleep(5000);

    }


}



