package com.cydeo.step_definitions;

import com.cydeo.pages.WLoginPage;
import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class WebOrderLoginStepDef {
    WLoginPage wLoginPage;

    @Given("we are at web order login page")
    public void we_are_at_web_order_login_page() {
        //navigate to login page
        wLoginPage = new WLoginPage();
        wLoginPage.goTo();

    }
    @When("we provide valid credentials")
    public void we_provide_valid_credentials() {
        wLoginPage.login(ConfigReader.read("weborder_username"),ConfigReader.read("weborder_password"));

    }
    @Then("we should see all order page")
    public void we_should_see_all_order_page() {

        // cucumber-junit dependency already come with junit4
        // so we will be just using assertions methods coming from junit 4
        // it's extremely similar just coming from different dependency
        // so the package import will be different
        //This is where the assertions methods are coming from in junit4 already included in cucumber-junit dependency
        //import static org.junit.Assert.*;
//        assertEquals(4,4);
//        assertTrue(4>3) ;
        // check we are at the all order page by checking the title is Web Orders
        assertEquals("Web Orders", Driver.getDriver().getTitle());

    }

    //********************************************************************


    @When("we provide invalid credentials")
    public void weProvideInvalidCredentials() {
        wLoginPage.login("bla","bla");
    }

    @Then("we should still be at login page")
    public void weShouldStillBeAtLoginPage() {
        assertEquals("Web Orders Login",Driver.getDriver().getTitle());
    }

    @And("login error message should be present")
    public void loginErrorMessageShouldBePresent() {
        assertTrue(wLoginPage.loginErrorMsgPresent());
    }

    @When("user provide username {string} and password {string}")
    public void userProvideUsernameAndPassword(String username, String password) {
        //username = "whatever provided from scenario step
        //password = "whatever providef from scenario step
        wLoginPage.login(username,password);
    }
}
