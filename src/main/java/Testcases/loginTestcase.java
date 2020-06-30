package Testcases;

import General.Main;
import PageObjects.loginObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class loginTestcase extends Main {


    @Test (description = "Login to admin panel with valid credentials")
    public static void LoginIntoMiza() throws InterruptedException {

        loginObjects obj = new loginObjects(driver,wait);
        obj.validLogin();
        boolean result = obj.dashboard();
        Assert.assertTrue(result);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS.SECONDS);

    }
}
