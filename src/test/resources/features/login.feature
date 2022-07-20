Feature: Calibrate Android User Login Page

  @Calibrate-1
  Scenario: AC.01 Login
    Given Android user navigate to Calibrate Mobile App
    When User provides valid credentials
    Then User should see Home page

  @Demo
  Scenario: AC.02 App WalkThrough
    Given Android user is on the dashboard for the first time
    When User wants to do a setup
    Then User should be able to see the sequence of pages one after the other

