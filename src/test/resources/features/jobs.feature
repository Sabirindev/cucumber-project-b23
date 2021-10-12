Feature: Getting jobs
  As a student I should be able to get job after learning all good tools

  Scenario: Student prepare for a job
    Given student attends all the classes
    When student learns all the topics
    Then student should be ready for the job

    Scenario: student goes to market
      Given student is prepared
      When student uploads their resume
      Then student will be in the market

      Scenario: student applies fot the job
        Given you are prepared for a job
        And you are in the market
        When you apply for 100 jobs a day
        Then you will eventually get hte job