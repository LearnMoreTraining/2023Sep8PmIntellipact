Feature: To validate the login functionality of salesforce

  @errorMessageva @alpha
    #before
  Scenario: user validates the error message
    When user enters the username "jerry" and password "123"
    And user clicks the login button
    Then user validate the error message
    #after

   @sc2 @alpha @aravinth
     #before
  Scenario: user validate the login function
    Given user navigates to salesforce application
    When user enters the username "learnmore" and password "abc"
    And user clicks the login button
    Then user should navigate to homepage
     #after

   @sc3
     #before
  Scenario: user validate the label name
     Given sample
     When demo
     #after


