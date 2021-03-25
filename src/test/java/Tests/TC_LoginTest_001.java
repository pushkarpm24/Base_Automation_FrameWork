package Tests;

import FactoryClasses.DriverFactory;
import PageObjects.LoginPage;
import ReusableComponents.PropertiesOperation;
import TestBase.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_LoginTest_001 extends BaseClass {

    @Test(groups = {"smoke"})
    public void loginTest() throws InterruptedException, IOException {
        LoginPage lp = new LoginPage();
        lp.setUserName(PropertiesOperation.getPropertyValueByKey("userName"));


        lp.setPassword(PropertiesOperation.getPropertyValueByKey("password"));


        lp.clickSubmit();


        //VALIDATION
        Assert.assertEquals(PropertiesOperation.getPropertyValueByKey("HomePageTitle"), DriverFactory.getInstance().getDriver().getTitle());
        //logger.info("User Is In Home Page..");
    }
}
