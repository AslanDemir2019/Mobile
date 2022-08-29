Feature: Calibrate IOS User Withings Member 'No' option on the 'Have you received your welcome kit' screen Feature

  @MEQA-56
  Scenario:AC.01 Withings Member 'No' option on the 'Have you received your welcome kit'
    Given Withings Member wants logging in to the app
    When Withing Member provides valid credentials
    Then Withings Member should be navigated to Have You received Your Welcome Kit Screen

  @MEQA-56
  Scenario:AC.02 Withings_Member Answers No
    Given Withings Member is on the DASHBOARD
    And has answered NO
    When the withings Member wants to complete Orientation flow
    Then pages should displayed one by one to the member

  @MEQA-56
  Scenario:AC.03 Withings Member  Skip All Option in Flow
    Given the Withings Member is starting the flow
    And Withing Member is on Have You received Your Welcome Kit Screen
    When Withings Member wants to skip all the pages one after the other
    Then there should be skip option on top right corners to the Member