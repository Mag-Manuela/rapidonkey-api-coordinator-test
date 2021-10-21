Feature: Users with active accounts forgot password to log in to the platform
  #Scenario 1
  @forgot
  Scenario: Successful Reset password email sent
    Given I land on Forgot password
    When I click on Submit
    Then I see the Success message
