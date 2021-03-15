package org.example;
import org.junit.After;



import org.junit.Test;

import static com.codeborne.selenide.Selenide.switchTo;

public class MailTest extends BaseClass {

    @Test
    public void mailTest() {

        loginPage.acceptCookies();
        loginPage.clickLoginButton();
        switchTo().window(1);
        loginPage.inputLogin("leader.test1");

        loginPage.clickPasswordButton();


    }


}
