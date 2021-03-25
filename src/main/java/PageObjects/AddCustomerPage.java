package PageObjects;

import FactoryClasses.DriverFactory;
import TestBase.BaseClass;
import org.openqa.selenium.By;

public class AddCustomerPage extends BaseClass {


    By ADD_NEW_CUSTOMER = By.xpath("/html/body/div[3]/div/ul/li[2]/a");
    By CUSTOMER_NAME = By.xpath("//tbody/tr[4]/td[2]/input[1]");
    By GENDER = By.xpath("//tbody/tr[5]/td[2]/input[1]");
    By DOB = By.xpath("//input[@id='dob']");
    By ADDRESS = By.name("addr");
    By CITY = By.name("city");
    By STATE = By.name("state");
    By PIN_NO = By.name("pinno");
    By EMAIL = By.name("emailid");
    By TELEPHONE_NO = By.name("telephoneno");
    By PASSWORD = By.name("password");
    By SUBMIT = By.name("sub");

    //ACTION METHODS..

    public void clickAddNewCustomer() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(ADD_NEW_CUSTOMER), "AddNewCustomerField");

    }

    public void custName(String cname) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(CUSTOMER_NAME), "CustomerNameField", cname);

    }

    public void custgender(String cgender) {
        click_custom(DriverFactory.getInstance().getDriver().findElement(GENDER), "ClickOnGenderField");
    }

    public void custdob(String mm, String dd, String yy) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(DOB), "CustomerDobMonthField", mm);
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(DOB), "CustomerDobDayField", dd);
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(DOB), "CustomerDobYearField", yy);

    }

    public void custaddress(String caddress) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(ADDRESS), "CustomerAddressField", caddress);
    }

    public void custcity(String ccity) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(CITY), "CustomerCityField", ccity);
    }

    public void custstate(String cstate) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(STATE), "CustomerStateField", cstate);
    }

    public void custpinno(String cpinno) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PIN_NO), "CustomerPinNoField", cpinno);
    }

    public void custtelephoneno(String ctelephoneno) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(TELEPHONE_NO), "CustomerTelephoneNoField", ctelephoneno);
    }

    public void custemailid(String cemailid) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(EMAIL), "CustomerEmailField", cemailid);
    }

    public void custpassword(String cpassword) {
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PASSWORD), "CustomerPasswordField", cpassword);
    }

    public void custsubmit() {
        click_custom(DriverFactory.getInstance().getDriver().findElement(SUBMIT), "SubmitBtnField");
    }


}
