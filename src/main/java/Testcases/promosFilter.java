package Testcases;

import General.Main;
import PageObjects.promosFilterObjects;
import PageObjects.promosViewRecordObjects;
import org.testng.annotations.Test;


public class promosFilter extends Main {

    @Test (description = "Filtering packages as all, active or inactive")
    public void FilterPromos() throws InterruptedException {

      //  loginTestcase.loginIntoMiza();
       promosFilterObjects obj = new promosFilterObjects(driver);
        obj.clickPromos();
        Thread.sleep(2000);
        obj.clickFilter();
        Thread.sleep(5000);

    }


}



