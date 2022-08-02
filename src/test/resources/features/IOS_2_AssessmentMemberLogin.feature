Feature: Calibrate IOS User Assessment Member LoginPage Feature

  @MEQA-13
  Scenario: AC.01 IOS App Launch For Assessment Member
    Given Assessment Member is on the dashboard
    When Assessment Member wants to register
    Then Assessment Member should see Dashboard

  @MEQA-13
  Scenario: AC.02 IOS App Assessment Member Without Email
    Given Assessment Member is on login page
    When Assessment Member email is not provided
    Then Dashboard should not be displayed to Assessment Member


  @MEQA-13
  Scenario: AC.03 IOS App Assessment Member With Wrong Email
    Given Assessment Member is on login
    When Assessment Member email is provided wrong
    Then Dashboard Page should not be displayed for Assessment Member


  @MEQA-13
  Scenario: AC.04 IOS App Assessment Member Without Password
    Given Assessment Member wants to login
    When password is not provided by Assessment Member
    Then Dashboard shouldn't be displayed to Assessment Member


  @MEQA-13
  Scenario: AC.05 IOS App Assessment Member With Wrong Email
    Given Assessment Member is on login page Dashboard
    When Assessment Member provides wrong password
    Then Dashboard should not be viewed to Assessment Member

