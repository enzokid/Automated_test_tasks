package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }



    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/a/span")
    private WebElement loginField;

    @FindBy(xpath = "//button[contains(text(), 'Войти')]")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@id=\"passp-field-passwd\"]")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[1]/form/div[3]/button")
    private WebElement passwordButton;

    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    public void inputPassword(String passwd) {
        passwordField.sendKeys(passwd); }

    public void clickLoginButton() {
        loginButton.click(); }

    public void clickPasswordButton() {
        passwordButton.click(); }

}
