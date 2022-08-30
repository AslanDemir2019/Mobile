Feature: Calibrate IOS User BoxOut Member Skip All The Pages Feature

  @MEQA-53 @Regression
  Scenario:AC.01 BoxOut Member Log in
    Given IOS user BoxOut Member wants to log in
    When BoxOut Member provide valid credentials
    Then BoxOut Member user should be navigated to Have You received Your Welcome Kit Page

  @MEQA-53 @Regression
  Scenario:AC.02 BoxOut Member Orientation flow
    Given IOS user BoxOut Member is on the Have You received Your Welcome Kit Page
    When BoxOut Member wants to complete the Orientation flow
    Then BoxOut Member should see pages displayed one by one

  @MEQA-53 @Regression
  Scenario:AC.03 BoxOut Member Skip All the Pages in the Flow
    Given IOS user BoxOut Member is starting the Orientation flow
    And BoxOut Member is on the Have You received Your Welcome Kit Page
    When BoxOut Member wants to skip all the pages
    Then there should be skip option on all the pages BoxOut Member views