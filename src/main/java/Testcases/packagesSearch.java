package Testcases;

import General.Main;
import PageObjects.packagesSearchObjects;
import PageObjects.retailerInventorySearchObjects;
import org.testng.annotations.Test;


public class packagesSearch extends Main{

    @Test (description = "Searching packages by package name")
    public void SearchPackages() throws InterruptedException {

        //loginTestcase.loginIntoMiza();
        packagesSearchObjects obj = new packagesSearchObjects(driver);
        obj.clickPackages();
        Thread.sleep(1000);
        obj.searchText();
        Thread.sleep(5000);

    }


}



