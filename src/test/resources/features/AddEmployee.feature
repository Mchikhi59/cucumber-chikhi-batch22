Feature: Add employee

  Background:
    #Given user is able to access to HRMS application
    When usr enters a valid username and password
    And user click on valid button
    Then user able to see dashboard page
    When user click on PIM pption
    And use clicks on add employee option

  @sprint @regression @smoke
  Scenario: Adding employee by username and lastname

    And user enter firstname and lastname
    And user clicks on save button
    Then employee added successfully


    @sprint
  Scenario:  Adding employee by username middlename and lastname
    And user enter username middlename and lastname
    And user clicks on save button
    Then employee added successfully

  @params@db
  Scenario: adding employee using parameters
    And user enter "miloud" and "chikhi" and "mc" in the application
    And user clicks on save button
    Then employee added successfully

  @exemple
  Scenario Outline: adding a multiple emplyees
    And user add "<firstname>" , "<middlename>" and "<lastname>"
    And user clicks on save button
    Then employee added successfully
    Examples:
      | firstname | middlename | lastname |
      | mark | mj | jacob |
      | rob | rg | gulti |
      | jeff | js | smith |


  @data
  Scenario: adding a multiple emplyees using data table
    When user add a multiple employees using data table and save
      | firstname | middlename | lastname |
      | mark      | mj         | jacob    |
      | rob       | rg         | gulti    |
      | jeff      | js         | smith    |

  @excel
  Scenario: adding employees using excel file
    When user adds multiple employees from excel file
