Feature: Calibrate IOS User Missing Email or Password Error Feature

  Background:
    Given Ios user is on the all Sign In page

  @MEQA-17
  Scenario: AC.01 Missing email message
    When user provides invalid email and valid password
    Then user should not be able to sign in
    And an error message should be displayed for email

  @MEQA-17
  Scenario: AC.02 Missing password message

    When user provides valid email and invalid password
    Then the Ios user should not sign in
    And an error message should be displayed for password

  @MEQA-17
  Scenario: AC.03 Missing email and password message
    When user does not provide valid email and password
    Then user should not be able to sign in and navigate to Dashboard
    And an error message should be displayed for email and password

  @MEQA-17
  Scenario: AC.04 Valid email and password
    When user provides valid email and valid password
    Then user should be able to sign in