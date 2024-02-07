package com.bbc.step_definitions;

import com.bbc.pages.ScoresFixturesPage;
import com.bbc.utilities.BrowserUtils;
import com.bbc.utilities.ConfigurationReader;
import com.bbc.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ScoresFixturesStepDef {


    ScoresFixturesPage scoresFixturesPage = new ScoresFixturesPage();


    @Given("user lands on {string} page")
    public void user_lands_on_page(String title) {
        String url = ConfigurationReader.getProperty(title);
        Driver.getDriver().get(url);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }



    @When("user sees all team names with a match today")
    public void user_sees_all_team_names_with_a_match_today() {
        BrowserUtils.waitFor(2);
        if(scoresFixturesPage.teams.isEmpty()) return;
        for (WebElement team : scoresFixturesPage.teams) {
            System.out.println(team.getText());
        }



    }
    @When("if there is no matches today display a message")
    public void if_there_is_no_matches_today_display_a_message() {
        if(scoresFixturesPage.teams.isEmpty()) System.out.println("There is no matches today!");
    }


}
