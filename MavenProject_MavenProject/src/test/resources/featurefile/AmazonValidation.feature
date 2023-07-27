Feature: user validates the amazon search functionality
  @RegressionTest @TCS006
  Scenario: Validate the search functionality with specific keywords
    Given user navigates to "https://www.amazon.in/"
    When user enters the "iphone" in search bar
    And user clicks on search icon
    Then user validates the search result

    @TCS004
    Scenario: validate the sort by functionality
      Given user search the product "iphone" and navigate to search result page
      When user sort by newest arrival
      Then validate whether the newest arrival is selected

      @LoginTest
      Scenario: Login
        Given user navigates to signin page
        When user enters the username and password
        Then validate whether the user navigates to signin page

        @StaticDropdown
        Scenario: Handle the static dropdown
          Given user selects the value from the static dropdown