package General;

import Config.ApplicationConfigReader;
import PageObjects.*;
import com.aventstack.extentreports.ExtentTest;
//import com.sun.org.apache.bcel.internal.generic.NEW;
//import com.sun.xml.internal.stream.events.NamedEvent;

import static General.Main.driver;
import static General.Main.wait;

public class InitMethods {
    public static ApplicationConfigReader appConfig=new ApplicationConfigReader();
    public static loginObjects login_Objects = new loginObjects(driver);



}


