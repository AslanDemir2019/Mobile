Feature: Calibrate IOS User Error Message for Wrong Credentials Feature


  Background:
    Given Ios User is on the Login page

  @MEQA-16 @Regression
  Scenario: AC.01 Wrong email
    When ios user provides an invalid email and valid password
    Then ios user should not be able to Login
    And an error message should be displayed under Your Email section

  @MEQA-16 @Regression
  Scenario: AC.02 Wrong password
    When the Ios user provides a valid email but an invalid password
    Then the Ios user should not Login
    And an error message should be displayed under the password section

  @MEQA-16 @Regression
  Scenario: AC.03 No email and password
    When Ios user does not provide any email or password
    Then Ios user should not Login onto Dashboard
    And an error message should be displayed