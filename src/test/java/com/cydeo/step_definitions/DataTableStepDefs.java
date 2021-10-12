package com.cydeo.step_definitions;

import com.cydeo.pages.WLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;


public class DataTableStepDefs {

    //@Given("I have a {string}")
    @Given("I have a {word}")
    public void i_have_a(String animal) {
        System.out.println("Given I have a " + animal);
    }

    @When("I call their names")
    public void i_call_their_names() {
        System.out.println("When I call their names");

    }

    @Then("they come to me")
    public void they_come_to_me() {
        System.out.println("Then they come to me");
    }

//       ******************************************

    @Given("I have following animal")
    public void i_have_following_animal(List<String> animalsLst) {
        System.out.println("animalsLst = " + animalsLst);
    }

    @When("I call their names with below names")
    public void iCallTheirNamesWithBelowNames(List<String> namesLst) {
        System.out.println("namesLst = " + namesLst);
    }

    @Then("they come to me with below noise")
    public void theyComeToMeWithBelowNoise(Map<String,String > animalNoiseMap) {
        System.out.println("animalNoiseMap = " + animalNoiseMap);
    }



//    //this can be represented by List< List<String>> animalRowLst as well like below
//    @Then("they come to me with below noise")
//    public void theyComeToMeWithBelowNoise(List<List<String >> animalRowLst) {
//        System.out.println("animalRowLst = " + animalRowLst);
//
//    }


    @When("we provide below credentials")
    public void weProvideBelowCredentials(Map<String ,String> credentialMap) {
        System.out.println("credentialMap = " + credentialMap);
        String usernameFromTable = credentialMap.get("username");
        String passwordFromTable = credentialMap.get("password");

        WLoginPage wLoginPage = new WLoginPage();
        wLoginPage.login(usernameFromTable,passwordFromTable);

    }

    @Given("this is the prodyct reference")
    public void thisIsTheProdyctReference(List<Map<String,Object>> productMapLst) {
        for (Map<String, Object> entry : productMapLst) {
            System.out.println("entry = " + entry);
        }
    }
}

