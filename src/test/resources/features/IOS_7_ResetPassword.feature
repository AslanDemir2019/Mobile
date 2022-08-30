Feature: Calibrate IOS User Reset Password Feature

  Background:
      Given Ios user is on the Login page Dashboard

  @MEQA-14 @Regression
  Scenario: AC.01 Reset Password Option
    When user has forgotten the password
    Then user should see a Reset Password option


  @MEQA-14 @Regression
  Scenario: AC.02 Reset Password Email
    When user wants to reset password
    And  clicks Reset Password option
    Then user should be navigated to Reset Password Email Page


  @MEQA-14 @Regression
  Scenario: AC.03 Reset Password Email Sent
    When user wants to reset his her password
    And  clicks on the Reset Password
    Then user should go to Reset Password Email Page
    When the Ios user provides a valid email
    And clicks on Request Password Reset option
    Then Email sent notification should be displayed


  @MEQA-14 @Regression
  Scenario: AC.04 Back to Sign In Button
    When user provides an email for resetting
    Then Back To Sign In Button should be displayed


  @MEQA-14 @Regression
  Scenario: AC.05 Back to Sign In Page
    When user provides a valid email to reset password
    And clicks on Back to sign in page option
    Then user should be navigated to Calibrate Sign In Page Dashboard


#  @MEQA-14
#  Scenario: AC.06 Same Email and Password
#    Given Ios user is on the Login page Dashboard
#    And have reseted password
#    When user provides same email and password
#    Then user should not be able to sign in to Calibrate App
