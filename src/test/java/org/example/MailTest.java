package org.example;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class MailTest extends BaseClass {

    @Test
    public void mailTest() {

        startPage.acceptCookies();
        startPage.clickMailButton();

        switchTo().window(1);

        loginPage.setLogin("leader.test1");
        loginPage.clickLoginButton();
        loginPage.setPassword("leader");
        loginPage.clickPasswordButton();

    }
}
