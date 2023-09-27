package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import utilities.WebDriverProvider;

public class Steps extends BaseClass {

    @Given("User launch the Browser")
    public void user_launch_the_browser() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");
        //ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--remote-allow-origins=*");
        //driver = new ChromeDriver(chromeOptions);
        driver = WebDriverProvider.getInstance();
        driver.manage().window().maximize();
        lp = new LoginPage(driver);

    }

    @When("User Opens URL {string}")
    public void user_opens_url(String url) {

        driver.get(url);

    }

    @When("User enters Email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as_admin(String email, String password) {
        lp.setUserName(email);
        lp.setPassword(password);

    }

    @When("Click on login")
    public void click_on_login() throws InterruptedException {
        lp.clickLogin();
        Thread.sleep(2000);

    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {
        if(driver.getPageSource().contains("Login was unsuccessful")){
            driver.close();
            Assert.assertTrue(false);
        }else {
            Assert.assertEquals(title, driver.getTitle());

        }

    }

    @When("User Click on Logout Link")
    public void user_click_on_logout_link() throws InterruptedException {
        lp.clickLogout();
        Thread.sleep(2000);

    }

    @Then("Close browser")
    public void close_browser() {
        driver.quit();


    }

    // Customer Add Feature Steps
    @Then("user can view the dashboard")
    public void user_can_view_the_dashboard() {
        addCust=new AddCustomerPage(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration",addCust.getPageTitile());

    }
    @When("user click on customer manu")
    public void user_click_on_customer_manu() throws InterruptedException {
        Thread.sleep(3000);
        addCust.clickOnCustomerMenu();

    }
    @When("user click on customer menu item")
    public void user_click_on_customer_menu_item() {
        addCust.clickOnCustomerMenuItem();

    }
    @When("user click on add new button")
    public void user_click_on_add_new_button() throws InterruptedException {
        addCust.clickOnAddNewButton();
        Thread.sleep(2000);

    }
    @Then("user can view add new customer page")
    public void user_can_view_add_new_customer_page() {
        Assert.assertEquals("Add a new customer / nopCommerce administration",addCust.getPageTitile());

    }
    @Then("user enter customer info")
    public void user_enter_customer_info() throws InterruptedException {

        getJavaScriptExecutor().executeScript("window.scrollBy(0,200)");


        String email = randomString()+"@gmail.com";
        addCust.setUserEmail(email);
        addCust.setUserPassword("test123");
        addCust.clickOnCloseSelectedRole();
        addCust.setCustomerRole("Guests");
        Thread.sleep(2000);
        addCust.setUserFirstName("Rango");
        addCust.setUserLastName("Gputa");
        addCust.genderMaleRd();
        addCust.setDateOfBirth("11/09/1993");
        addCust.setCompanyName("Testing Company");
        addCust.clickIsTaxExempt();
        addCust.setNewsLetter("Your store name");
        addCust.setVendorId("Vendor 1");
        addCust.clickActive();
        addCust.setAdminComment("Testing......");

        getJavaScriptExecutor().executeScript("window.scrollBy(200`,0)");

    }
    @Then("user click on save button")
    public void user_click_on_save_button() throws InterruptedException {
        addCust.clickSubmitButton();
        Thread.sleep(3000);

    }
    @Then("user can view confirmation message {string}")
    public void user_can_view_confirmation_message(String msg) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new Customer has been added Successfully."));

    }

}
