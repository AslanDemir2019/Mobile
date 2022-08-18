Feature: Calibrate IOS User Withings Member OrientationFlow Feature

  @MEQA-54
  Scenario:AC.01 Withings Member Orientation Flow Log in
    Given IOS user Withings Member wants to log in
    When Withings Member provide valid credentials
    Then Withings Member user should be navigated to Have You received Your Welcome Kit Page

  @MEQA-54
  Scenario:AC.02 Withings Member Orientation Flow
    Given IOS user Withings Member is on the Have You received Your Welcome Kit Page
    And answers NO to the question
    When Withings Member wants to complete the Orientation flow
    Then Withings Member should see pages displayed one by one

  @MEQA-54
  Scenario:AC.03 Withings Member Orientation Flow Skip All the Pages
    Given IOS user Withings Member is starting the Orientation flow
    And Withings Member is on the Have You received Your Welcome Kit Page
    When Withings Member wants to skip all the pages
    Then there should be skip option on all the pages Withings Member views

