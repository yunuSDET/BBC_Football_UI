package com.bbc.step_definitions;

import com.bbc.pages.SearchPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class SearchStepDef {

    SearchPage searchPage=new SearchPage();



    @When("user clicks search box")
    public void user_clicks_search_box() {
       searchPage.searchBox.click();
    }
    @When("user types {string} into search box and hits the enter")
    public void user_types_into_search_box_and_hits_the_enter(String keyword) {
        searchPage.inputBox.sendKeys(keyword, Keys.ENTER);
    }
    @When("list first and last headings on the page")
    public void list_first_and_last_headings_on_the_page() {
        System.out.println(searchPage.headers.get(0).getText());
        System.out.println(searchPage.headers.get(searchPage.headers.size()-1).getText().split("Listen Now")[1].trim());
    }




}
