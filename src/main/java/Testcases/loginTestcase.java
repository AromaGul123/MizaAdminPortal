package Testcases;

import General.Main;
import PageObjects.loginObjects;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLException;

public class loginTestcase extends Main {

    //public static String email = "Admin1@munchieshome.com";
    public static String email = "arslan.admin@minimart.ly";
    public static String pwd = "admin123";

    @Test
    public static void loginIntoMiza() throws InterruptedException {
        // logStep("User is logged in successfully");
        loginObjects obj = new loginObjects(driver);
        Thread.sleep(2000);
        obj.openLoginPage("https://test-admin.minimart.ly/login");
        Thread.sleep(9000);
        obj.enterDataForLogin(email,pwd);
        Thread.sleep(1000);
        obj.clickSignIn();
        Thread.sleep(3000);
        boolean expected_result = obj.logoImage();
        Thread.sleep(10000);
        Assert.assertTrue(expected_result);
    }

}
