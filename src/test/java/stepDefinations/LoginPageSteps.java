package stepDefinations;

import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pageObjects.SearchCustomerPage;
import utilities.GenericHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddCustomerPAge;
import pageObjects.LoginPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoginPageSteps extends TestBase{

    public GenericHelper genericHelper;

    @Before
    public void setUp() throws IOException {
        //Reading properties

        configProp=new Properties();
        FileInputStream fis =new FileInputStream("config.properties");
        configProp.load(fis);

        logger= Logger.getLogger("**** ecommerce *****");
        PropertyConfigurator.configure("C:\\Users\\Pratik\\IdeaProjects\\Cucumber1\\log4j.properties");
        logger.info("####### Launching Browser #########");

        String br=configProp.getProperty("browser");
        if (br.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if (br.equals("ie")) {
            WebDriverManager.iedriver().setup();
            driver= new InternetExplorerDriver();
        } else if (br.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if (br.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Given("User Launch chrome browser")
    public void user_launch_chrome_browser() {
           loginPage=new LoginPage(driver);



        }

    @When("User opens Url {string}")
    public void user_opens_url(String url) {
        logger.info("####### Opening URL #########");
        loginPage=new LoginPage(driver);
        driver.get(url);


    }

    @When("User enters email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String pass) {
        logger.info("####### Entering eamil and password #########");
      loginPage=new LoginPage(driver);
       loginPage.setUserName(email);
       loginPage.setTxtPassword(pass);



        }

    @When("Click on Login")
    public void click_on_login() {
        logger.info("####### Clicking on login button #########");
        loginPage=new LoginPage(driver);
        loginPage.clickLogin();


      }

    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {
        logger.info("####### title should be #########");
        loginPage=new LoginPage(driver);
        Assert.assertEquals(driver.getTitle(),title);


        }

    @When("User click on log out link")
    public void user_click_on_log_out_link() {
        logger.info("####### clicking on logout btn #########");
        loginPage=new LoginPage(driver);
        loginPage.clickLogou();

        System.out.println("user_click_on_log_out_link()");
        }



    @Then("close brower")
    public void close_brower() {
        logger.info("####### CLosing browser #########");
        loginPage=new LoginPage(driver);
        driver.close();


         }

// customer step definations




    @Then("User can view dashboard")
    public void user_can_view_dashboard() {
        logger.info("####### view dashboard #########");
     addCustomerPAge=new AddCustomerPAge(driver);
     genericHelper=new GenericHelper();
     Assert.assertEquals(driver.getTitle(),"Dashboard / nopCommerce administration");

    }
    @When("User click on customers menu")
    public void user_click_on_customers_menu() throws InterruptedException {
        logger.info("####### Clicking on customer menu #########");
        addCustomerPAge.clickOnCustomerMenu();

    }
    @When("click on customer Menu item")
    public void click_on_customer_menu_item() {

        logger.info("####### clicking on cucstomer menu item #########");
        addCustomerPAge.clickOnCustomerMenuItems();

    }
    @When("click on Add new button")
    public void click_on_add_new_button() {

        logger.info("####### Clicking on add new btn #########");
        addCustomerPAge.clickOnAddNew();

    }

    @Then("USer can view Add new Customer page")
    public void u_ser_can_view_add_new_customer_page() throws InterruptedException {
        logger.info("####### view add new customer page #########");
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"Add a new customer / nopCommerce administration");
    }
    @When("User enter customer info")
    public void user_enter_customer_info() {
        logger.info("####### entering information  #########");
        String email =randomstring()+"@gmail.com";

        addCustomerPAge.setCustomerEmail(email);
        addCustomerPAge.setCustomerPassword("test123");
        addCustomerPAge.setCustomerRoles("Guest");
        addCustomerPAge.setManagerVendor("Vendor 2");
        addCustomerPAge.setGender("Male");
        addCustomerPAge.setFirstName("Pavan");
        addCustomerPAge.setLastName("kumar");
        addCustomerPAge.setDOB("12/12/1995");
        addCustomerPAge.setCompanyName("busyQA");
        addCustomerPAge.setAdminComment("this is for testing");




    }
    @When("click on save button")
    public void click_on_save_button() {

        logger.info("####### Clicking on save #########");
        addCustomerPAge.clickOnSaveBtn();
    }

    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String string) {

        logger.info("####### message will display - #########");
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
        logger.info("####### - The new customer has been added successfully #########");
    }


    // steps for searching customer by using email id

    @When("Enter customer email")
    public void enter_customer_email() {

        searchCustomerPage=new SearchCustomerPage(driver);
        searchCustomerPage.setSearchEmailEmail("victoria_victoria@nopCommerce.com");
          }

    @When("Click on search button")
    public void click_on_search_button() {
        searchCustomerPage.clickOnSearch();

          }

    @Then("User should found Email in the Search table")
    public void user_should_found_email_in_the_search_table() throws InterruptedException {

       boolean status= searchCustomerPage.searchCutomerByEmail("victoria_victoria@nopCommerce.com",driver);
           Assert.assertEquals(true,status);
    }

    //  steps for searching customer by using first name and last name

    @When("Enter customer FirstName")
    public void enter_customer_first_name() {
        searchCustomerPage=new SearchCustomerPage(driver);
       searchCustomerPage.setSearchFirstName("victoria");
          }

    @When("Enter customer LastName")
    public void enter_customer_last_name() {
        searchCustomerPage=new SearchCustomerPage(driver);
        searchCustomerPage.setSearchLastName("victoria");

    }
    @Then("User should found Name in the Search table")
    public void user_should_found_name_in_the_search_table() throws InterruptedException {

        searchCustomerPage=new SearchCustomerPage(driver);
        boolean status =searchCustomerPage.searchCutomerByName("Victoria Terces",driver);
        Assert.assertEquals(true,status);
        }




}
