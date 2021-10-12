package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobStepDef {

    @Given("student attends all the classes")
    public void student_attends_all_the_classes() {
        System.out.println("Given code goes here: student attends all the classes");
    }
    @When("student learns all the topics")
    public void student_learns_all_the_topics() {
        System.out.println("When code goes here: student learns all the topics");

    }
    @Then("student should be ready for the job")
    public void student_should_be_ready_for_the_job() {
        System.out.println("Then code goes here: student should be ready for the job");

    }

    //*****************************************************************

    @Given("student is prepared")
    public void student_is_prepared() {
        System.out.println("Given code goes here: student is prepared");
    }
    @When("student uploads their resume")
    public void student_uploads_their_resume() {
        System.out.println("When ode goes here: student uploads their resume");
    }
    @Then("student will be in the market")
    public void student_will_be_in_the_market() {
        System.out.println("Then code goes here: student will be in the market");
    }


    //*****************************************************************

    @Given("you are prepared for a job")
    public void you_are_prepared_for_a_job() {
        System.out.println("CONDITION 1 : YOU ARE PREPARED FOR THE JOB");
    }
    @Given("you are in the market")
    public void you_are_in_the_market() {
        System.out.println("CONDITION 2 : YOU ARE IN THE MARKET");
    }
    @When("you apply for {int} jobs a day")
    public void you_apply_for_jobs_a_day(Integer applicationCount) {
        System.out.println("WHEN Applying for "+ applicationCount+" job");
    }
    @Then("you will eventually get hte job")
    public void you_will_eventually_get_hte_job() {
        System.out.println("THEN YOU SHOULD GET THE JOB");
    }


}
