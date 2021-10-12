## below line is how we add tag to a feature at feature level

  ## you can add more than one tags on anything
@calculator @non_ui
Feature: Calculator feature
  As a user, I should be able to use the calculator,
  that I can do arithmetic operations.

  ## below line is how we add tag to a feature at a scenario level
  @addition
  Scenario: Add 2 numbers
    Given calculater app is open
    When I add 2 with 2
    Then I should get result 4 displayed

  @smoke
  Scenario: Add 2 numbers another example
    Given calculater app is open
    When I add 5 with 4
    Then I should get result 9 displayed
