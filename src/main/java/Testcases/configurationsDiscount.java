package Testcases;

import General.Main;
import PageObjects.configurationsConvenienceFeeObjects;
import PageObjects.configurationsDiscountObjects;
import org.testng.annotations.Test;


public class configurationsDiscount extends Main{

    @Test
    public void configurationsDiscount() throws InterruptedException {

      //  loginTestcase.loginIntoMiza();
        configurationsDiscountObjects obj = new configurationsDiscountObjects(driver);
        obj.clickConfigurations();
        Thread.sleep(2000);
        obj.selectConfig();
        Thread.sleep(2000);
        obj.selectDiscountValue();
        Thread.sleep(2000);
        obj.save();
        Thread.sleep(5000);

    }


}



