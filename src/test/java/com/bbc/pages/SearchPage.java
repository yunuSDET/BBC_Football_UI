package com.bbc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {


    @FindBy(xpath = "//a//p")
    public List<WebElement> headers;


    @FindBy(id = "searchInput")
    public WebElement inputBox;


}
