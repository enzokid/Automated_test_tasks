package org.example;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MailTest {

    public static StartPage startPage;
    public static LoginPage loginPage;
    public static WebDriver driver;


    @BeforeClass
    public static void setup() {

        System.setProperty("webdriver.gecko.driver", ConfProperties.getProperty("geckodriver"));
        WebDriver driver = new FirefoxDriver();

        StartPage startPage = new StartPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("startpage")); }

    @Test
    public void mailTest() {


        startPage.clickMailButton();

        loginPage.inputLogin(ConfProperties.getProperty("login"));

        loginPage.clickLoginButton();

        loginPage.inputPassword(ConfProperties.getProperty("password"));

        loginPage.clickPasswordButton();


        }


}

