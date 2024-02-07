package com.bbc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-identifier-input")
    public WebElement inputBox;

    @FindBy(id = "submit-button")
    public WebElement submitButton;

    @FindBy(css = ".sb-form-message__text")
    public WebElement errorMsg;





}
