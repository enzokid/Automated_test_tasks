package org.example.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    private SelenideElement loginField = $("#passp-field-login");
    private SelenideElement loginButton = $(".Button2_view_action");

    private SelenideElement passwordField = $("#passp-field-passwd");
    private SelenideElement passwordButton = $(".Button2_view_action");


    public void setLogin(String login) {
        loginField.val(login);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void setPassword(String passwd) {
        passwordField.val(passwd);
    }


    public void clickPasswordButton() {
        passwordButton.click();
    }


}