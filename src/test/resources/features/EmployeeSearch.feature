Feature: Search employee

  Background:
      #Given user is able to access to HRMS application
    When usr enters a valid username and password
    And user click on valid button
    Then user able to see dashboard page
    When user click on PIM pption
    And user clicks on employee list option

  @regression @moi
  Scenario: Search employee by ID
       #Given user is able to access to HRMS application
    #When usr enters a valid username and password
    #And user click on valid button
    #Then user able to see dashboard page
    #When user click on PIM pption
    When user enters valid employee id
    And user clicks on search button
    Then user is able to see employee details


  @regression @bg
  Scenario: Search employee by name
      #Given user is able to access to HRMS application
    #When usr enters a valid username and password
    #And user click on valid button
    #Then user able to see dashboard page
    #When user click on PIM pption
    When user enters valid employee name
    And user clicks on search button
    Then user is able to see employee details
