package Testcases;

import General.Main;
import PageObjects.configurationsConvenienceFeeObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class configurationsConvenienceFee extends Main{

    @Test (description = "Adding convenience fee via configurations")
    public void ConfigurationsConvenienceFee() throws InterruptedException {

        loginTestcase.LoginIntoMiza();
        configurationsConvenienceFeeObjects obj = new configurationsConvenienceFeeObjects(driver,wait);
        obj.ClickConfigurations();
        Thread.sleep(2000);
        obj.SelectConfig();
        Thread.sleep(3000);
        obj.SelectConvenienceFeeValue();
        Thread.sleep(3000);
        obj.Save();
        Thread.sleep(2000);
        boolean result = obj.SuccessMessage();
        Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);
        System.out.println("Assertion is "+result);
        }


}



