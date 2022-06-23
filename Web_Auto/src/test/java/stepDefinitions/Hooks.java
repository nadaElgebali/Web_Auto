package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driverOne = null;

    @Before
    public static void triggerBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\Web_Automation_Teeting\\src\\main\\resources\\chromedriver.exe");
        driverOne = new ChromeDriver();
        driverOne.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driverOne.manage().window().maximize();
        driverOne.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
    }

    @After
    public static void closeBroswer(){

        driverOne.quit();
    }

}
