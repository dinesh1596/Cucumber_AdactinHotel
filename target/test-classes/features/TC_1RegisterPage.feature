@HotelBooking
Feature: Verifying the new  user registration

  @WithoutCaptacha
  Scenario Outline: User can register the account by filling all the details without captcha Text field
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User enter "<userName>","<password>","<confirmPassword>","<fullName>","<emailAddress>"
    And User select the checkbox in TermsConditions field and click the Register button
    Then User verify the error message "Captcha is Empty"

    Examples: 
      | userName  | password     | confirmPassword | fullName    | emailAddress       |
      | Shanmathi | ShanMathi@22 | ShanMathi@22    | Shanmathi K | shanmath@gmail.com |
  
  @WithoutUserName
  Scenario Outline: User can register the account by filling all the details without username field
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User enter "<password>","<confirmPassword>","<fullName>","<emailAddress>"
    And User select the checkbox in TermsConditions field and click the Register button
    Then User verify the username error message is displayed "Username is Empty"

    Examples: 
      | password     | confirmPassword | fullName    | emailAddress       |
      | ShanMathi@22 | ShanMathi@22    | Shanmathi K | shanmath@gmail.com |
   
   @WithoutPassword
   Scenario Outline: User can register the account by filling all the details without password field
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User enter "<userName>","<confirmPassword>","<fullName>","<emailAddress>" and password field is not filled
    And User select the checkbox in TermsConditions field and click the Register button
    Then User verify the password error message is displayed "Password is Empty", "Passwords Do Not Match"

    Examples: 
      | userName  | confirmPassword | fullName    | emailAddress       |
      | Shanmathi | ShanMathi@22    | Shanmathi K | shanmath@gmail.com |
   
   @WithoutConfirmPassword
   Scenario Outline: User can register the account by filling all the details without confirm password field
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User enter "<userName>","<password>","<fullName>","<emailAddress>" and confirm password filed is not filled
    And User select the checkbox in TermsConditions field and click the Register button
    Then User verify the confirm password error message is displayed "Confirm Password is Empty"

    Examples: 
      | userName  | password     |     fullName    | emailAddress       |
      | Shanmathi | ShanMathi@22 |  Shanmathi K    | shanmath@gmail.com |
   
   @WithoutFullName
   Scenario Outline: User can register the account by filling all the details without fullname field
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User enter "<userName>","<password>","<confirmPassword>","<emailAddress>" and fullname is not filled
    And User select the checkbox in TermsConditions field and click the Register button
    Then User verify the fullname error message is displayed "Full Name is Empty"

    Examples: 
      | userName  | password     | confirmPassword | emailAddress       |
      | Shanmathi | ShanMathi@22 | ShanMathi@22    | shanmath@gmail.com |
     
    @WithoutEmailAddress
    Scenario Outline: User can register the account by filling all the details without emailaddress field
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User enter "<userName>","<password>","<confirmPassword>","<fullName>" and email address is not filled
    And User select the checkbox in TermsConditions field and click the Register button
    Then User verify the email address error message is displayed "Email Address is Empty"

    Examples: 
      | userName  | password     | confirmPassword | fullName    | 
      | Shanmathi | ShanMathi@22 | ShanMathi@22    | Shanmathi K |
    
    @WithoutTermAndConditions
    Scenario Outline: User can register the account by filling all the details without term and conditions field
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User enter "<userName>","<password>","<confirmPassword>","<fullName>","<emailAddress>"
    And User click the Register button
    Then User verify the Terms and Conditions error message is displayed "You must agree to Terms and Conditions"

    Examples: 
      | userName  | password     | confirmPassword | fullName    | emailAddress       |
      | Shanmathi | ShanMathi@22 | ShanMathi@22    | Shanmathi K | shanmath@gmail.com |
    
    @WithoutAnyFields
    Scenario Outline: User can register the account without filling all the details
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User without enter the value for all the fields, click the Register button
    Then User verify all the error messages "Username is Empty","Password is Empty","Confirm Password is Empty","Full Name is Empty","Email Address is Empty","Captcha is Empty","You must agree to Terms and Conditions"

    @UserNameValidation
    Scenario Outline: User can register the account by filling all the details and give invalid value in username field
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User enter "<userName>","<password>","<confirmPassword>","<fullName>","<emailAddress>"
    And User select the checkbox in TermsConditions field and click the Register button
    Then User verify the error message is displayed in username field "Username must contain minimum 8 characters"

    Examples: 
      | userName  | password     | confirmPassword | fullName    | emailAddress       |
      | Shan      | ShanMathi@22 | ShanMathi@22    | Shanmathi K | shanmath@gmail.com |
    
    @PasswordValidation
    Scenario Outline: User can register the account by filling all the details and give invalid value in password field
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User enter "<userName>","<password>","<confirmPassword>","<fullName>","<emailAddress>"
    And User select the checkbox in TermsConditions field and click the Register button
    Then User verify the password invalid error message is displayed "Password must contain minimum 6 characters"

    Examples: 
      | userName  | password     | confirmPassword | fullName    | emailAddress       |
      | Shanmathi | Shan         | ShanMathi@22    | Shanmathi K | shanmath@gmail.com |
    
    @Reset
    Scenario Outline: User can reset the register form by clicking the reset button
    Given User is on Home Page
    And User click new user register here link
    Then User Verifying the text "New User Registration Form (Fields marked with Red asterix (*) are mandatory)" in Register Screen
    When User enter "<userName>","<password>","<confirmPassword>","<fullName>","<emailAddress>"
    And User select the checkbox in TermsConditions field and click the Register button
    And User click the Reset button
    Then User verify the register form is reseted

    Examples: 
      | userName  | password     | confirmPassword | fullName    | emailAddress       |
      | Shanmathi | ShanMathi@22 | ShanMathi@22    | Shanmathi K | shanmath@gmail.com |
    
    
    
