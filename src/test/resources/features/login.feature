Feature: login related scenarios

  Background:
   # Given user is able to access to HRMS application
  @sprint @smoke@ @
  Scenario: valid admin login

    When usr enters a valid username and password
    And user click on valid button
    Then user able to see dashboard page

    @inavlid
  Scenario: invalid admin login

    When usr enters a invalid username and password
    And user click on valid button
    Then user can see error message

