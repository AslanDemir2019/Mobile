Feature: Calibrate IOS User Have You Received Welcome Kit Feature

  @MEQA-xxx
  Scenario: AC.01 Option Yes and complete flow
  Given ios user logs into the App
  And clicks on Get Started button
  When user clicks on Yes for Have You received your Welcome Kit
  Then user should be able to complete the Orientation Flow


  @MEQA-xxx
  Scenario: AC.02 Option No
    Given IOS user has loged in
    And clicked on The Get Started Button
    When user clicks on No option for Have You received your Welcome Kit
    Then Your program hasn't started yet should be displayed