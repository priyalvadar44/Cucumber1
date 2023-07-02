package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.AddCustomerPAge;
import pageObjects.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddCustomerPageSteps {
//    public WebDriver driver;
//    public AddCustomerPAge addCustomerPAge;
//
//    @Given("User Launch chrome browser")
//    public void user_launch_chrome_browser() {
//        addCustomerPAge=new AddCustomerPAge(driver);
//
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        System.out.println("################ user_launch_chrome_browser() ####################################");
//
//    }
//
//    @When("User opens Url {string}")
//    public void user_opens_url(String url) {
//        addCustomerPAge=new AddCustomerPAge(driver);
//        driver.get(url);
//
//        System.out.println("################ user_opens_url(String url) ###############################");
//    }
//
//    @When("User enters email as {string} and Password as {string}")
//    public void user_enters_email_as_and_password_as(String email, String pass) {
////        addCustomerPAge=new LoginPage(driver);
////        loginPage.setUserName(email);
////        loginPage.setTxtPassword(pass);
//
//        System.out.println("################# user_enters_email_as_and_password_as(String email, String pass) #####################");
//
//    }
//
//    @When("Click on Login")
//    public void click_on_login() {
//        loginPage=new LoginPage(driver);
//        loginPage.clickLogin();
//
//
//        System.out.println("################## click_on_login() #######################################");
//    }
//
//    @Then("Page title should be {string}")
//    public void page_title_should_be(String title) {
//        loginPage=new LoginPage(driver);
//        Assert.assertEquals(driver.getTitle(),title);
//
//
//        System.out.println("############# page_title_should_be(String title) ######################");
//    }
//
//    @When("User click on log out link")
//    public void user_click_on_log_out_link() {
//
//        loginPage=new LoginPage(driver);
//        loginPage.clickLogou();
//
//        System.out.println("user_click_on_log_out_link()");
//    }
//
//
//
//    @Then("close brower")
//    public void close_brower() {
//
//        loginPage=new LoginPage(driver);
//        driver.close();
//
//        System.out.println("################ close_brower() ###########################");
//    }
//
//
//    @Then("User can view dashboard")
//    public void user_can_view_dashboard() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("User click on customers menu")
//    public void user_click_on_customers_menu() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("click on customer Menu item")
//    public void click_on_customer_menu_item() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("click on Add new button")
//    public void click_on_add_new_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("USer can view Add new Customer page")
//    public void u_ser_can_view_add_new_customer_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("User enter customer info")
//    public void user_enter_customer_info() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("click on save button")
//    public void click_on_save_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("User can view confirmation message {string}")
//    public void user_can_view_confirmation_message(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("close browser")
//    public void close_browser() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

}
