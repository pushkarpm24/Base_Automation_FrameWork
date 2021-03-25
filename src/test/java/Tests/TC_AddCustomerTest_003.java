package Tests;

import FactoryClasses.DriverFactory;
import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import ReusableComponents.PropertiesOperation;
import TestBase.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_AddCustomerTest_003 extends BaseClass {

    @Test(groups={"regration"})
    public void addNewCustomer() throws InterruptedException, IOException {
        LoginPage lp = new LoginPage();
        lp.setUserName(PropertiesOperation.getPropertyValueByKey("userName"));

        lp.setPassword(PropertiesOperation.getPropertyValueByKey("password"));

        lp.clickSubmit();

        Thread.sleep(3000);

        AddCustomerPage addcust = new AddCustomerPage();

        addcust.clickAddNewCustomer();

        //logger.info("providing customer details....");

        Thread.sleep(10000);
        addcust.custName("Pushkar");
        addcust.custgender("male");
        addcust.custdob("10", "15", "1985");
        Thread.sleep(5000);
        addcust.custaddress("INDIA");
        addcust.custcity("BLR");
        addcust.custstate("AP");
        addcust.custpinno("5000074");
        addcust.custtelephoneno("987890091");

        String email = randomestring() + "@gmail.com";
        addcust.custemailid(email);
        addcust.custpassword("abcdef");
        addcust.custsubmit();

        Thread.sleep(3000);

        //logger.info("validation started....");

        boolean res = DriverFactory.getInstance().getDriver().getPageSource().contains("Customer Registered Successfully!!!");

        if (res == true) {
            Assert.assertTrue(true);
            // logger.info("test case passed....");

        } else {
            //logger.info("test case failed....");
            //captureScreen(driver,"addNewCustomer");
            Assert.assertTrue(false);
        }

    }

}
