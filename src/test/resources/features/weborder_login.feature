@ui
Feature: Web order app login
  As a user
  I should be able to login to web order app

  # This is where repeating beginning code can go, this is how we comment in feature file
  Background:
    #this is a shared step for all scenarios so it can remove duplicate
    #by putting it in Background section of feature
    Given we are at web order login page


  Scenario: User login successfully
   # Given we are at web order login page
    When we provide valid credentials
    Then we should see all order page

  Scenario: User login fail
   # Given we are at web order login page
    When we provide invalid credentials
    Then we should still be at login page
    And login error message should be present

    Scenario: User login with specific credentials
      # whatever is enclosed inside quotation " " will be sent as parameter value
      # step definition will lokk like this
      # @When("user provide username {string} and password {string}")
      When user provide username "Tester" and password "test"
      Then we should see all order page

      Scenario: User login with wrong credentials

        When user provide username "Bla" and password "Bla"
        Then we should still be at login page
        And login error message should be present
