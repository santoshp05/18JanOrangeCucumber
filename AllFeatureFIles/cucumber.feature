Feature: Test Ornge HRM Application

  #Santosh
  Scenario: Test Orange HRM functionality
    Given user is on homepage
    When user enter username and password
    And user click on login button

  #Sahara
  Scenario: Test Orange HRM functionality
    Then User Validate url
    And Validate get Title

  #Kajal
  Scenario: PIM Page Funcationality
    When User Click on PIM button
    Then click on AddEmployee
    And Enter FirstName , LastName and Save button
