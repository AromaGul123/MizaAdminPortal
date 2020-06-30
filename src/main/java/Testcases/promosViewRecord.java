package Testcases;

import General.Main;
import PageObjects.promosViewRecordObjects;
import PageObjects.retailerUserViewRecordObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class promosViewRecord extends Main {

    @Test (description = "Viewing record in promos")
    public void ViewPromos() throws InterruptedException {

      // loginTestcase.loginIntoMiza();
        promosViewRecordObjects obj = new promosViewRecordObjects(driver);
        obj.clickPromos();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(1000);
        boolean result = obj.idNumber();
        //Thread.sleep(2000);
        Assert.assertTrue(result);
        Thread.sleep(5000);

    }


}



