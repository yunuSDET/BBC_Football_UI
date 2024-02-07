package com.bbc.step_definitions;

import com.bbc.pages.LoginPage;
import com.bbc.utilities.BrowserUtils;
import com.bbc.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDef {

    LoginPage loginPage=new LoginPage();


    @When("user clicks sign in link")
    public void user_clicks_sign_in_link() {

       while (true){
           try {
               loginPage=new LoginPage();
               loginPage.signInLink.click();
               break;
           }catch (RuntimeException e){
               Driver.getDriver().navigate().refresh();
               System.out.println("Page is refreshed to avoid the popup");
           }
       }

    }
    @When("user types {string} into input box and {string}")
    public void user_types_into_input_box_and(String keyword, String submitAction) {

        loginPage.inputBox.sendKeys(keyword);
        if(submitAction.equals("enter")){
            loginPage.inputBox.sendKeys(Keys.ENTER);
        }else{
            loginPage.submitButton.click();
        }
    }
    @Then("user should see {string}")
    public void user_should_see(String errorMsg) {
        Assert.assertEquals(loginPage.errorMsg.getText(),errorMsg);
    }


}
