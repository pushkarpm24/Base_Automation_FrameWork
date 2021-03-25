package PageObjects;

import FactoryClasses.DriverFactory;
import TestBase.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {


    By NAME = By.name("uid");
    By PASSWORD = By.name("password");
    By LOGIN_BTN = By.name("btnLogin");
    By LOGOUT_LNK = By.name("Log out");


    public void setUserName(String uname) throws InterruptedException {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(NAME), "LoginUserNameFIeld", uname);
    }

    public void setPassword(String password) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PASSWORD), "LoginPasswordFIeld", password);
    }

    public void clickSubmit() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(LOGIN_BTN), "LoginBtnField");
    }

    public void clickLogout() throws InterruptedException {
        // ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
        click_custom(DriverFactory.getInstance().getDriver().findElement(LOGOUT_LNK), "LoginBtnField");
        // Thread.sleep(3000);
    }
}
