package com.test.hemachandrarao.context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ScenarioContext {
    public void setDriver(WebDriver driver) {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\DLG\\src\\main\\resources\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        this.driver = driver;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
//            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    private WebDriver driver;
}
