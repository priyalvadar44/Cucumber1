package pageObjects;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

   public WebDriver driver;
   public LoginPage(WebDriver driver){
       PageFactory.initElements(driver,this);
   }

   @FindBy(xpath="//input[@id='Email']")
   WebElement txtEmail;

    @FindBy(xpath="//input[@id='Password']")
    WebElement txtPassword;

    @FindBy(xpath="//button[text()='Log in']")
    WebElement btnLogin;

    @FindBy(linkText="Logout")
    WebElement txtLogout;

    public void setUserName(String uName){
        txtEmail.clear();
        txtEmail.sendKeys(uName);
    }

    public void setTxtPassword(String pwd){
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickLogin(){
        btnLogin.click();
    }
    public void clickLogou(){
        txtLogout.click();
    }



}
