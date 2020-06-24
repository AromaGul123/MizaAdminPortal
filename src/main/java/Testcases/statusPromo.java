package Testcases;

import General.Main;
import PageObjects.promoObjects;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLException;

public class statusPromo extends Main{

    @Test
    public void statusPromo() throws InterruptedException {
        //loginTestcase.loginIntoMiza();
        promoObjects obj = new promoObjects(driver);
        //obj.clickPromos();
        Thread.sleep(1000);
        obj.activeStatus();
        Thread.sleep(1000);

    }

}
