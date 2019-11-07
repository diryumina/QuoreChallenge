package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public Pages pages;




    @Before
    public void setUp() {
        driver = Driver.getDriver();
        pages = new Pages();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void tearDown() {
    driver.close();
    }




}
