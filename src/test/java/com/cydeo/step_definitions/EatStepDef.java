package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatStepDef {

    @Given("Alice is hungry")
    public void alice_is_hungry() {
        System.out.println("This is @Gven code alice_s_hungry");
    }
    @When("she eats {int} cucumbers")
    public void she_eats_cucumbers(Integer quantity) {
        System.out.println("this is @When code she eats cucumbers "+ quantity);
    }
    @Then("she will be full")
    public void she_will_be_full() {
        System.out.println("this is @then code she will be full");

    }

    //**********************************************************************

    @Given("Ivan is hungry")
    public void ivan_is_hungry() {
        System.out.println("@Given Ivan is hungry");
    }
    @When("He eats {int} cucumbers")
    public void he_eats_cucumbers(Integer int1) {
        System.out.println("@When He eats cucumbers");
    }
    @Then("He turns into cucumber")
    public void he_turns_into_cucumber() {
        System.out.println("@Then He turns into cucumber");
    }
}
