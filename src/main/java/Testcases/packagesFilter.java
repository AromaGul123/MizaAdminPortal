package Testcases;

import General.Main;
import PageObjects.packagesFilterObjects;
import PageObjects.retailerInventoryFilterObjects;
import org.testng.annotations.Test;


public class packagesFilter extends Main{

    @Test
    public void filterPackages() throws InterruptedException {

       // loginTestcase.loginIntoMiza();
        packagesFilterObjects obj = new packagesFilterObjects(driver);
        obj.clickPackages();
        Thread.sleep(1000);
        obj.selectFilter();
        Thread.sleep(1000);
        obj.selectOptions();
        Thread.sleep(5000);

    }


}



