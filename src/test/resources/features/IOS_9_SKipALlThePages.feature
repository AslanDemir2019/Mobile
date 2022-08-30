Feature: Calibrate IOS User Skip All The Pages Feature

  @MEQA-55 @Regression
  Scenario:AC.01 Member Log in
    Given IOS user wants to log in
    When user provide valid credentials
    Then user should be navigated to Have You received Your Welcome Kit Page

  @MEQA-55 @Regression
  Scenario:AC.02 Orientation flow
    Given IOS user is on the Have You received Your Welcome Kit Page
    When user wants to complete the Orientation flow
    Then pages should be displayed one by one

  @MEQA-55 @Regression
  Scenario:AC.03 Skip All the Pages
    Given IOS user is starting the Orientation flow
    And is on the Have You received Your Welcome Kit Page
    When user wants to skip all the pages
    Then there should be skip option on all the pages