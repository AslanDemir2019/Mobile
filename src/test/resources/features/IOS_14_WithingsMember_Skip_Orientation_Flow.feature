Feature: Calibrate IOS User Withings Member Skip OrientationFlow Feature

  @MEQA-55
  Scenario:AC.01 Withings Member Orientation Flow Complete
    Given Withings Member wants to log in
    When Member provide valid credentials
    Then Member user should be navigated to Have You received Your Welcome Kit Screen

  @MEQA-55
  Scenario:AC.02 Withings Member Orientation Flow Answers No
    Given Withings Member is on the Have You received Your Welcome Kit question
    And answers NO
    When Member wants to complete Orientation flow still
    Then pages should displayed

  @MEQA-55
  Scenario:AC.03 Withings Member Orientation Work Flow Skip All Option
    Given Withings Member is starting the Orientation flow
    And Member is on Have You received Your Welcome Kit Page
    When Withings Member wants to skip all the screens to the END
    Then there should be skip option on top right corners of all the pages

