package stepDefinitions;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class BaseClass {

    public WebDriver driver;

    public LoginPage lp;

    public AddCustomerPage addCust;
// Creating for generating random unique email
    public static String randomString(){
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
    }
    public JavascriptExecutor getJavaScriptExecutor(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        return jse;
    }

}
