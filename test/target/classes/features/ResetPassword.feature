Feature: Users with active accounts reset passwords
  Scenario: Errors when New password and Confirm password do not match
    Given I land on Reset password by opening the link received in the email
    When I click on Reset password
    Then "The passwords don't match" error is displayed
