package TestBase;

import FactoryClasses.BrowserFactory;
import FactoryClasses.DriverFactory;
import ReusableComponents.ActionEngine;
import ReusableComponents.PropertiesOperation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseClass extends ActionEngine {
    BrowserFactory bf = new BrowserFactory();

    @Parameters("browser")
    @BeforeClass
    public void setupApp(String browser) {

        String url = PropertiesOperation.getPropertyValueByKey("baseUrl");

        DriverFactory.getInstance().setDriver(bf.createInstance(browser));

        DriverFactory.getInstance().getDriver().manage().window().maximize();
        DriverFactory.getInstance().getDriver().manage().deleteAllCookies();
        DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        DriverFactory.getInstance().getDriver().navigate().to(url);

    }

//    public void getBrowserName(String browser){
//        System.out.println("Browser passed is:"+browser);
//    }


    @AfterClass
    public void closeApp() {
        DriverFactory.getInstance().closeBrowser();
    }

}
