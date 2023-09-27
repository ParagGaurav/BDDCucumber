package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverProvider;

public class LoginPage {

    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtEmail;
    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;
    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement btnlogin;
    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement lnklogout;

    public void setUserName(String Username) {
        txtEmail.clear();
        txtEmail.sendKeys(Username);
        txtEmail.getText();
        String s = txtEmail.getText();
        System.out.println("*******************"+ s);
        System.out.println("###################"+ txtEmail.getAttribute("value"));

    }



    public void setPassword(String Password) {
        txtPassword.clear();
        txtPassword.sendKeys(Password);
    }

    public void clickLogin() {

        btnlogin.click();
    }

    public void clickLogout() {
        lnklogout.click();
    }


}
