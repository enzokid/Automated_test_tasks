package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {

    public WebDriver driver;
    public StartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/div/a")
    private WebElement mailButton;

    public void clickMailButton() {
        mailButton.click(); }

}
