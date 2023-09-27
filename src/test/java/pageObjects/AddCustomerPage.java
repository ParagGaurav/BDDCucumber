package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddCustomerPage {

    public WebDriver ldriver;

    public AddCustomerPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
    @CacheLookup
    WebElement customerMenu;
    @FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
    @CacheLookup
    WebElement customerMenuItem;
    @FindBy(xpath = "//a[@href='/Admin/Customer/Create']")
    @CacheLookup
    WebElement addNewButton;
    @FindBy(id = "Email")
    @CacheLookup
    WebElement userEmail;
    @FindBy(id = "Password")
    @CacheLookup
    WebElement userPassword;
    @FindBy(id = "FirstName")
    @CacheLookup
    WebElement userFirstName;
    @FindBy(id = "LastName")
    @CacheLookup
    WebElement UserLastName;
    @FindBy(id = "Gender_Male")
    @CacheLookup
    WebElement genderMale;
    @FindBy(id = "DateOfBirth")
    @CacheLookup
    WebElement dateOfBirth;
    @FindBy(id = "Company")
    @CacheLookup
    WebElement companyName;
    @FindBy(id = "IsTaxExempt")
    @CacheLookup
    WebElement isTaxExempt;
    @FindBy(xpath = "//div[@class='k-multiselect-wrap k-floatwrap']")
    @CacheLookup
    WebElement newsletter;


    @FindBy(xpath = "//div[@class='k-multiselect-wrap k-floatwrap zzz']")
    @CacheLookup
    WebElement customerRole;
    @FindBy(xpath = "//select[@id='VendorId']")
    @CacheLookup
    WebElement vendorId;
    @FindBy(id = "Active")
    @CacheLookup
    WebElement active;
    @FindBy(id = "AdminComment")
    @CacheLookup
    WebElement adminComment;
    @FindBy(xpath = "//button[@name='save']")
    @CacheLookup
    WebElement submitButton;

    @FindBy(xpath = "//span[@title='delete']")
    @CacheLookup
    WebElement closeSelectedRole;


    // Action Method

    public String getPageTitile() {
        return ldriver.getTitle();
    }

    public void clickOnCustomerMenu() {
        customerMenu.click();
    }

    public void clickOnCustomerMenuItem() {
        customerMenuItem.click();
    }

    public void clickOnAddNewButton() {
        addNewButton.click();
    }

    public void setUserEmail(String email) {
        userEmail.sendKeys(email);
    }

    public void setUserPassword(String password) {
        userPassword.sendKeys(password);

    }

    public void setUserFirstName(String firstName) {
        userFirstName.sendKeys(firstName);
    }

    public void setUserLastName(String lastName) {
        UserLastName.sendKeys(lastName);
    }

    public void genderMaleRd() {
        genderMale.click();

    }

    public void setDateOfBirth(String dob) {
        dateOfBirth.sendKeys(dob);

    }

    public void setCompanyName(String compName) {
        companyName.sendKeys(compName);
    }

    public void clickIsTaxExempt() {
        isTaxExempt.click();
    }

    public void setNewsLetter(String store) {
        Select nl = new Select(newsletter);
        nl.selectByVisibleText(store);

    }



    public void setCustomerRole(String role) {
        customerRole.sendKeys(role);



    }


    public void setVendorId(String vendor) {
        Select Vid = new Select(vendorId);
        Vid.selectByVisibleText(vendor);
    }

    public void clickActive() {
        active.click();
    }

    public void setAdminComment(String Comment) {
        adminComment.sendKeys("adminComment");

    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void clickOnCloseSelectedRole(){
        closeSelectedRole.click();
    }



}


