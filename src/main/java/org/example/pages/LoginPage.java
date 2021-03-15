package org.example.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {


    private SelenideElement loginField = $("#passp-field-login");
    private SelenideElement loginButton = $(".button.desk-notif-card__login-enter-expanded");
    private SelenideElement passwordField = $("#passp-field-passwd");
    private SelenideElement passwordButton = $(".Button2_view_action");
    private SelenideElement acceptCookies = $(".sc-pNWxx.sc-jrsJCI.dryRrI.emsrNO");


    public void acceptCookies() {
        acceptCookies.click();
    }

    public void inputLogin(String login) {
        loginField.val(login);
    }

    public void inputPassword(String passwd) {
        passwordField.val(passwd);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickPasswordButton() {
        passwordButton.click();
    }
}