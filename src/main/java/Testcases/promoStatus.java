package Testcases;

import General.Main;
import PageObjects.promoObjects;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLException;

public class promoStatus extends Main{

    @Test (description = "Activating inactive status and vice versa")
    public void StatusPromo() throws InterruptedException {
        //loginTestcase.loginIntoMiza();
        promoObjects obj = new promoObjects(driver);
        obj.clickPromos();
        Thread.sleep(1000);
        obj.activeStatus();
        Thread.sleep(5000);

    }

}
