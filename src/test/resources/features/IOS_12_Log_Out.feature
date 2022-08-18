Feature: Calibrate IOS User Logout Feature

  @MEQA-15
  Scenario:AC.01 Log Out button
    Given Ios user is on the App Dashboard and have signed in
    When user clicks on Profile Nav bar
    Then user should see Log Out button Displayed

  @MEQA-15
  Scenario:AC.02 Log Out from App
    Given ios user is on the Profile
    And has clicked on Log Out button
    Then user should successfully logout from the App