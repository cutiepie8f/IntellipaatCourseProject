Feature: user validate the dropdown and search functionality of spicejet

  @SpicejetTest
  Scenario: Handle the dynamic Dropdown
    Given user handles the dynamic dropdown

  @SpicejetTest2
  Scenario: Validate the search functionality with specific keyword
  Given user navigates to home page and select city from source and  destination dropdown
  And  user select the number of passengers and select the currency
  And user click on the radio button and checkbox
  When user clicks on search button
  Then  user navigates to the booking page of the application

