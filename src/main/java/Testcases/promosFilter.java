package Testcases;

import General.Main;
import PageObjects.promosFilterObjects;
import PageObjects.promosViewRecordObjects;
import org.testng.annotations.Test;


public class promosFilter extends Main {

    @Test
    public void filterPromos() throws InterruptedException {

      //  loginTestcase.loginIntoMiza();
       promosFilterObjects obj = new promosFilterObjects(driver);
        obj.clickPromos();
        Thread.sleep(2000);
        obj.clickFilter();
        Thread.sleep(5000);

    }


}



