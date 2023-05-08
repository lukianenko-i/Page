package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfProperties;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    public static WebDriver driver;



    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("addressPage"));


    }

    @AfterClass
    public static void Stop() {
        driver.quit();
    }
}
