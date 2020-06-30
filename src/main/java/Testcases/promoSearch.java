package Testcases;

import General.Main;
import PageObjects.promoObjects;
import PageObjects.loginObjects;
import org.testng.Assert;
import org.testng.annotations.Test;
import Testcases.loginTestcase;
import java.sql.SQLException;


public class promoSearch extends Main
{

    @Test (description = "Searching promo by title and promo code")
    public void SearchPromo() throws InterruptedException {

     //   loginTestcase.loginIntoMiza();
        promoObjects obj = new promoObjects(driver);
        obj.clickPromos();
        Thread.sleep(1000);
        obj.searchText();
        Thread.sleep(5000);

    }



}
