Feature: Calibrate IOS User Logout Page Feature

  @MEQA-15 @Regression
  Scenario: AC.01 Logout Button
    Given  Ios user is on the App Dashboard Page
    And user has already gone through providing information pages
    When user wants to logout
    And user has navigated back to User Profile
    Then  User should be able to see logout button

#  @MEQA-15 @Smoke
#  Scenario: AC.02 Logout & Log Back In
#    Given user is on Ios App Dashboard
#    And user wants to logout after going through information pages
#    When user logs out
#    And logs back in
#    Then email and password fields should be empty
#
