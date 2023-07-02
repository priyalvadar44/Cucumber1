package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddCustomerPAge {

    public WebDriver driver;
    public AddCustomerPAge(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "")
    public WebElement emailInputBox;

    @FindBy(xpath = "")
    public WebElement passwordInputBox;

    @FindBy(xpath = "")
    public WebElement loginBtn;

//    @FindBy(xpath = "//*[@class='main-sidebar sidebar-dark-primary elevation-4']//ul[@role='menu']//descendant::p[text()=' Customers']")
//    public WebElement customersLink;
    @FindBy(xpath = "//a[@href='#']//*[contains(text(),'Customers')]")
    public WebElement customerLink;

    @FindBy(xpath = "//p[text()=' Customers']")
    public WebElement customersLinkInOptionps;

    @FindBy(xpath = "//a[@href='/Admin/Customer/Create']")
    public WebElement addNewBtn;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement customerEmail;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement customerPassword;

    @FindBy(xpath ="//input[@id='FirstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='Gender_Male']")
    public WebElement genderMale;

    @FindBy(xpath = "//input[@id='Gender_Female']")
    public WebElement genderFemale;

    @FindBy(xpath = "//input[@id='DateOfBirth']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//input[@id='Company']")
    public WebElement companyName;

    @FindBy(xpath ="//input[@id='IsTaxExempt']")
    public WebElement IsTaxExempt;

    @FindBy(xpath ="//div[@class='k-widget k-multiselect k-multiselect-clearable k-state-hover']")
    public WebElement newsLeterClick;

    @FindBy(xpath ="//*[@id='SelectedNewsletterSubscriptionStoreIds_listbox']//li")
    public List<WebElement> newsLetterOptions;

    @FindBy(xpath ="//div[@class='k-widget k-multiselect k-multiselect-clearable k-state-hover']")
    public WebElement CustomerRolesClick;

    @FindBy(xpath ="//*[@id='SelectedCustomerRoleIds_listbox']//li")
    public List<WebElement> CustomerRolesOpptions ;


    @FindBy(xpath ="//select[@id='VendorId']")
    public WebElement vendor;

    @FindBy(xpath ="//select[@id='VendorId']")
    public List<WebElement> vendorsList;


    @FindBy(xpath ="//*[@id='AdminComment']")
    public WebElement ddminComment;

    @FindBy(xpath = "//button[@name='save']")
    public WebElement saveBtn;

    public void clickOnCustomerMenu() throws InterruptedException {
        Thread.sleep(10000);

        customerLink.click();
    }

    public void clickOnCustomerMenuItems(){
        customersLinkInOptionps.click();
    }

    public void clickOnAddNew(){
        addNewBtn.click();
    }

    public void setCustomerEmail(String email){
        customerEmail.sendKeys(email);
    }

    public void setCustomerPassword(String pass){
        customerPassword.sendKeys(pass);
    }

    public void setFirstName(String fName){
        firstName.sendKeys(fName);
    }

    public void setLastName(String lName){
        lastName.sendKeys(lName);
    }

    public void setDOB(String dob){
        dateOfBirth.sendKeys(dob);
    }

    public void setCompanyName(String comName){
        companyName.sendKeys(comName);
    }
    public void setCustomerRoles(String role){
//        if (role.equals("Administrator") ) {
//
//        } else if (role.equals("Guests")) {
//
//        } else if (role.equals("Regustered")) {
//
//        } else if (role.equals("Vendors")) {
//
//        }
//        else {
//
//
//        }
        for (WebElement ele :CustomerRolesOpptions){
            if (ele.getText().equals(role)) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();",ele);

            }
        }
    }



    public void setManagerVendor(String value){
        Select select=new Select(vendor);
        select.selectByVisibleText(value);
    }
    public void setGender(String gender){
        if (gender.equals("Male")) {
            genderMale.click();
        } else if (gender.equals("Female")) {
            genderFemale.click();
        }
        else
            genderMale.click();
    }


    public void setAdminComment(String comment){
        ddminComment.sendKeys(comment);
    }

    public void clickOnSaveBtn(){
        saveBtn.click();
    }


}
