package Testcases;

import General.Main;
import PageObjects.promosViewRecordObjects;
import PageObjects.retailerUserViewRecordObjects;
import org.testng.annotations.Test;


public class promosViewRecord extends Main {

    @Test
    public void viewPromos() throws InterruptedException {

       //loginTestcase.loginIntoMiza();
       promosViewRecordObjects obj = new promosViewRecordObjects(driver);
       // obj.clickPromos();
        Thread.sleep(2000);
        obj.clickRecord();
        Thread.sleep(2000);

    }


}



