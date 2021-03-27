package org.example.pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class StartPage {

    private SelenideElement acceptCookies = $(".sc-pNWxx.sc-jrsJCI.dryRrI.emsrNO");
    private SelenideElement mailButton = $(".button.desk-notif-card__login-enter-expanded");


    public void acceptCookies() {
        acceptCookies.click();
    }

    public void clickMailButton() {

        mailButton.click();
    }

}