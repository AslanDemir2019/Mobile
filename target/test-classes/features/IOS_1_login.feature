Feature: Calibrate IOS User Login Page

  @Ios
  Scenario: AC.01 IOS App Launch
    Given IOS user is on the dashboard
    When User wants to register
    Then IOS User should see register pages one after the other

