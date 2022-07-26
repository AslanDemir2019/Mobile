Feature: Calibrate IOS User Malformed Email Error Message Feature

  @MEQA-18
  Scenario Outline: AC.01  Invalid Email Format -
    Given IOS user is on the Sign In page
    When they have entered an "< invalidEmail >" address
    Then they should see Invalid email address message and they should not be able to continue.
    Examples: List of invalid email addresses
      | invalidEmail                             |
      | #@%^%#$@#$@#.com                         |
      | @example.com                             |
      | Joe Smith <email@example.com>            |
      | email.example.com                        |
      | email@example@example.com                |
      | .email@example.com                       |
      | email.@example.com                       |
      | email..email@example.com                 |
      | あいうえお@example.com                     |
      | email@example.com (Joe Smith)            |
      | email@example                            |
      | email@-example.com                       |
      | email@example.web                        |
      | email@111.222.333.44444                  |
      | email@example..com                       |
      | Abc..123@example.com                     |
      | "(),:;<>[\]@example.com                  |
      | just"not"right@example.com               |
      | this\ is"really"not\allowed@example.com  |