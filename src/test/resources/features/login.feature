Feature: login related scenarios

  Background:
   # Given user is able to access to HRMS application
  @sprint1 @smoke@ @miloud
  Scenario: valid admin login

    When usr enters a valid username and password
    And user click on valid button
    Then user able to see dashboard page

    @miloud1
  Scenario: unvalid admin login

    When usr enters a invalid username and password
    And user click on valid button
    Then user can see error message

