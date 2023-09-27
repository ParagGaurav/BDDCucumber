package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverProvider {

    private static WebDriver driver = null;
    public static WebDriver getInstance(){
       if( driver == null){
           ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.addArguments("--remote-allow-origins=*");
           driver = new ChromeDriver(chromeOptions);

       }
        return driver;
    }

    private WebDriverProvider(){

    }
}
