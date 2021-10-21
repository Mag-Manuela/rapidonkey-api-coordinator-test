Feature: Users with valid credentials log in to Dispatcher App

  #Scenario 1
  @empty
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

    #Scenario 4
  @noAccount
  Scenario: Errors when deactivated account/ email not registered in the platform
    Given I land on Login Page
    When I click on Login
    Then There is no dispatcher account for this email address Error is displayed

  #Scenario 5
  @activate
  Scenario:
    Given I land on Login Page
    When I click on Login
    Then My account status is changed to active

  #Scenario 6
  @validLogin
  Scenario: Successful Login
    Given  I land on Login Page
    When I click on Login
    Then I am logged into the platform

    #Scenario 7
#  @forgotPassword
#  Scenario: Forgot Password
#    Given  I land on Login Page
#    When I click Forgot Password
#    Then I should start the Forgot Password funnel

#    #Scenario 8
#  Scenario: Refresh page after value input
#    Given  I land on Login Page
#    When I refresh page
#    Then Email and password fields return to their default states


