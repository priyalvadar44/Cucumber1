package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinations.TestBase;
import utilities.WaitHelper;

import java.util.List;

public class SearchCustomerPage extends TestBase {

    public WebDriver driver;
    WaitHelper waitHelper;

    public SearchCustomerPage(WebDriver driver) {
        driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    @FindBy(xpath = "//input[@id='SearchEmail']")
    public WebElement SearchEmail;

    @FindBy(xpath = "//input[@id='SearchFirstName']")
    public WebElement searchFirstName;

    @FindBy(xpath = "//input[@id='SearchLastName']")
    public WebElement searchLastName;

    @FindBy(xpath = "//input[@id='SearchRegistrationDateFrom']")
    public WebElement SearchRegistrationDateFrom;

    @FindBy(xpath = "//input[@id='SearchRegistrationDateTo']")
    public WebElement SearchRegistrationDateTo;

    @FindBy(xpath = " //input[@id='SearchLastActivityFrom']")
    public WebElement SearchLastActivityFrom;

    @FindBy(xpath = "//input[@id='SearchLastActivityTo']")
    public WebElement SearchLastActivityTo;

    @FindBy(xpath = "//input[@id='SearchCompany']")
    public WebElement SearchCompany;

    @FindBy(xpath = "//input[@id='SearchIpAddress']")
    public WebElement SearchIpAddress;


    @FindBy(id = "//ul[@id='SelectedCustomerRoleIds_taglist']//parent::div//descendant::input")
    public WebElement customerRoles;

    @FindBy(id = "//div[@class='k-list-scroller']//descendant::li")
    public WebElement customerRolesList;

    @FindBy(xpath = "//button[@id='search-customers']")
    public WebElement searchCustomer;

    @FindBy(xpath = "//table[@role='grid']")
    public WebElement tblSearchResult;

    @FindBy(xpath = "//*[@class='dataTables_scroll']")
    public WebElement table;

    @FindBy(xpath = "//*[@class='dataTables_scrollBody']//descendant::tbody/tr")
    public List<WebElement> tableRows;

    @FindBy(xpath = "//table[@id='customer-grid']//tbody/tr/td")
    public List<WebElement> tableColumns;

    public void setSearchEmailEmail(String eml) {
        SearchEmail.clear();
        waitHelper.waitForElement(SearchEmail, 30);
        SearchEmail.sendKeys(eml);

    }

    public void setSearchFirstName(String fName) {
        waitHelper.waitForElement(searchFirstName, 30);
        searchFirstName.clear();
        searchFirstName.sendKeys(fName);
    }

    public void setSearchLastName(String lName) {
        waitHelper.waitForElement(searchLastName, 30);
        searchFirstName.clear();
        searchFirstName.sendKeys(lName);
    }

    public int getNoOfRows() {
        return tableRows.size();
    }

    public int getNoOfColumns() {
        return tableColumns.size();
    }


    public void clickOnSearch() {
        searchCustomer.click();
    }


    public boolean searchCutomerByEmail(String email, WebDriver driver) throws InterruptedException {
        boolean flag = false;

        for (int i = 1; i < getNoOfRows(); i++) {

            Thread.sleep(5000);
            String emailId = driver.findElement(By.xpath("//*[@class='dataTables_scrollBody']//descendant::tbody/tr[" + i + "]/td[2]")).getText();
            System.out.println(emailId);

            if (emailId.equals(email)) {
                flag = true;

            }

        }
        return flag;
    }

    public boolean searchCutomerByName(String nm, WebDriver driver) throws InterruptedException {
        boolean flag = false;

        for (int i = 1; i < getNoOfRows(); i++) {

            Thread.sleep(5000);
            String name = driver.findElement(By.xpath("//*[@class='dataTables_scrollBody']//descendant::tbody/tr[" + i + "]/td[3]")).getText();
            System.out.println(name);

            String[] names = name.split(" ");
            if (names[0].equals("Victoria") && names[1].equals("Terces")) {
                flag = true;

            }


        }

        return flag;
    }

}
