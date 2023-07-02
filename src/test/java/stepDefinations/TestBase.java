package stepDefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.SearchCustomerPage;
import utilities.GenericHelper;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.AddCustomerPAge;
import pageObjects.LoginPage;

import java.util.Properties;

public class TestBase {
    public WebDriver driver;
    public LoginPage loginPage;
    public AddCustomerPAge addCustomerPAge;
    public GenericHelper genericHelper;
    public SearchCustomerPage searchCustomerPage;
    public static Logger logger;

    public Properties configProp;


    // created for generating random string for unique email id
    public static String randomstring(){
        String generatedString1= RandomStringUtils.randomAlphabetic(5);
        return generatedString1;
    }
}
