Feature: To validate the homepage of Amazon.in

  #before
  @Search
  Scenario: Search function of Amazon
    Given user should navigate to url
    When user enter the search keyword "table" and click on search icon
    Then user validate the message
  #after

  @multi
  Scenario Outline: Search functionality with multiple data
    When user enter the search keyword "<Search Keyword>" and click on search icon
    Then user validate the message
    And user enter "<First Name>" and "<DOB>"
    Examples:
      | Search Keyword | First Name | DOB  |
      | iphone         | aravinth   | 1995 |
      | book           | xyz        | 1997 |
      | table          | abc        | 1998 |


  @loginAmazon
  Scenario: Validate the login function
    Given user should navigate to url
    When user clicks the login button on homepage
    And user enter the credi

  @staticdropdown @manualtest
  Scenario: handle the static dropdown
    Given user should navigate to url
    When user selects the value from category dropdown


    @Mouse
      #before
  Scenario: user check the your list
    Given user clicks the baby wishlist
    Then verify whether the user naviages to baby wishlist page
      #after

  @Table
  Scenario: user handles the table
    Given user iterates the colun values




