Feature: As a user validates the login functionality of salesforce application
  @TCS001 @RegressionTest @TCS006 @Salesforce
  Scenario: Error message validation in login page
    Given user navigates to salesforce "https://login.salesforce.com/"
    When user enter the username "Learnmore" and password "123"
    And user clicks on login button
    Then user validates the error message


  @TCS002 @RegressionTest @TCS001 @Salesforce
  Scenario: login validation
      Given user navigates to "https://login.salesforce.com/"
      When user enter the username "Learnmore" and password "123"
      And user clicks on login button
      Then user navigates to the home page of the application
