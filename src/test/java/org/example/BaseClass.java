package org.example;

import org.example.pages.LoginPage;
import org.example.pages.StartPage;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class BaseClass {
    protected LoginPage loginPage = new LoginPage();
    protected StartPage startPage = new StartPage();

    @Before
    public void setUp() {
        fastSetValue = false;
        pageLoadStrategy = "eager";
        startMaximized = true;
        clearBrowserCookies();
        open("https://yandex.ru/");

    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}