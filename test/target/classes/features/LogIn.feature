Feature: Users with valid credentials log in to Dispatcher App

  #Scenario 1
  @invalidLogin
  Scenario Outline: Errors when any of the fields is empty
    Given I land on Login Page
    When I click on Login
    Then Field "<field>" shows Empty Error
    Examples:
      | field    |
      | email    |
      | password |

  #Scenario 2 and 3
  @invalidLogin
  Scenario Outline: Errors when invalid field is wrong
    Given I land on Login Page
    When I click on Login
    Then Field "<field>" shows Invalid Error
    Examples:
      | field    |
      | email    |
      | password |








  #Scenario 6
  @validLogin
  Scenario: Successful Login
    Given  I land on Login Page
    When I click on Login
    Then I am logged into the platform
    And I am directed to the Dashboard page


