package Testcases;

import General.Main;
import PageObjects.configurationsDiscountObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class configurationsDiscount extends Main{

    @Test (description = "Adding discount amount via configurations")
    public void ConfigurationsDiscount() throws InterruptedException {

        loginTestcase.LoginIntoMiza();
        configurationsDiscountObjects obj = new configurationsDiscountObjects(driver);
        obj.clickConfigurations();
        Thread.sleep(2000);
        obj.selectConfig();
        Thread.sleep(2000);
        obj.selectDiscountValue();
        Thread.sleep(3000);
        obj.save();
        Thread.sleep(2000);
        boolean result = obj.successMessage();
        Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);
        System.out.println("Assertion is "+result);
    }


}



