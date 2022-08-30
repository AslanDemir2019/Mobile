Feature: Calibrate IOS User Logout Functionality Feature

  @MEQA-20 @Regression
  Scenario:AC.01 Log Out btn
    Given Ios user is on Dashboard and have signed in
    When user clicks on the Profile Navigation bar
    Then Log Out button should be Displayed

  @MEQA-20 @Regression
  Scenario:AC.02 Log Out
    Given an IOS user is on the Profile Screen
    And user has clicked on Log Out btn
    Then user should  logout from the App successfully