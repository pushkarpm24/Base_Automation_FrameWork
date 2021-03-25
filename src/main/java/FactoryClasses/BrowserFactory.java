package FactoryClasses;

import ReusableComponents.PropertiesOperation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public WebDriver createInstance(String browser) {


        WebDriver driver = null;

        try {

            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", PropertiesOperation.getPropertyValueByKey("ChromePath"));
                driver = new ChromeDriver();

            } else if (browser.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", PropertiesOperation.getPropertyValueByKey("FireFOxPath"));
                driver = new FirefoxDriver();

            } else if (browser.equals("edge")) {
                System.setProperty("webdriver.edge.driver", PropertiesOperation.getPropertyValueByKey("EdgePath"));
                driver = new EdgeDriver();
            }

//            Thread.sleep(500);
//            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
        } catch (Exception e) {
            e.printStackTrace();
            return driver;
        }

        return driver;
    }
}
