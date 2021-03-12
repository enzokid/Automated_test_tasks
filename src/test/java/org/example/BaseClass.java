package org.example;

import org.example.pages.LoginPage;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class BaseClass {
    protected LoginPage loginPage = new LoginPage();

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