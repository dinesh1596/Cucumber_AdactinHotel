@LoginPage
Feature: Verifying the Login Details

  @Valid
  Scenario Outline: User Login with valid credentials
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>" and "<password>"
    And User clicks the login button
    Then User should be successfully logged in, verify the text message  "Hello Shanmathi22!"
    
    Examples:
       |userName     |password|
       | Shanmathi22 | E9Z51L |

  @Invalid
  Scenario: User Login with Invalid credentials
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter the invalid credentials
      | userName  | password |
      | Shanmathi | Shan@22  |
    And User clicks the login button
    Then User verify the invalid login credentials error message  "Invalid Login details or Your Password might have expired. Click here to reset your password"
  
  @InvalidPassword
  Scenario: User Login with valid username and invalid password
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter the invalid Password
    |Shanmathi22|AM29|
    And User clicks the login button
    Then User verify the invalid login credentials error message  "Invalid Login details or Your Password might have expired. Click here to reset your password"

  @InvalidUsername
  Scenario Outline: User Login with invalid username and valid password
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter invalid username, valid password "<userName>","<password>"
    And User clicks the login button
    Then User verify the invalid login credentials error message  "Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | userName | password |
      | Shan     | AM29JB   |

  @WithoutUsername
  Scenario Outline: User Login without username
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<password>"
    And User clicks the login button
    Then User verify the username field error message "Enter Username"

    Examples: 
      | password |
      | AM29JB   |

  @WithoutPassword
  Scenario Outline: User Login without password
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter the value in username filed "<userName>"
    And User clicks the login button
    Then User verify the password field error message "Enter Password"

    Examples: 
      | userName    |
      | Shanmathi22 |

  @WithoutUsernameAndPassword
  Scenario Outline: User Login without username and password
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User without enter username and password, clicks the login button
    Then User verify the username field error message "Enter Username"

  @ForgotPassword
  Scenario Outline: User can access Forgot password Link on Home Page
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User clicks the Forgot Password link
    Then User verify the Forgot password page "Forgot Password Form (Fields marked with Red asterix (*) are mandatory)"
