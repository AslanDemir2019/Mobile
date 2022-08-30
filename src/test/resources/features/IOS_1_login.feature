Feature: Calibrate IOS User Login Page Feature

  @MEQA-12 @Regression
  Scenario: AC.01 IOS App Launch
    Given IOS user is on the dashboard
    When User wants to register
    Then IOS User should see register pages one after the other


  @MEQA-12 @Regression
  Scenario: AC.02 IOS AppNo Email Provided
    Given user is on login page
    When email is not provided
    Then Dashboard should not be displayed


  @MEQA-12 @Regression
  Scenario: AC.03 IOS App Wrong Email Provided
  Given IOS user is on login page
  When email is provided wrong
  Then Dashboard Page should not be displayed


  @MEQA-12 @Regression
  Scenario: AC.04 IOS App No Password Provided
  Given user wants to login page
  When password is not provided
  Then Dashboard shouldn't be displayed


  @MEQA-12 @Regression
  Scenario: AC.05 IOS App Wrong Password Provided
  Given Ios user is on login page Dashboard
  When password provided is wrong
  Then Dashboard should not be viewed
