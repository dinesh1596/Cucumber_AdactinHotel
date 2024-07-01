@FP
Feature: Verifying the Forgot password page

Scenario: User verfiy the error message "Email Address is Empty" is displayed
 Given User is on Home Page
 Then User Verifying the text "Existing User Login - Build 1" in Home Page
 And User click the Forgot Password hyperlink
 Then User verifying the text "Forgot Password Form (Fields marked with Red asterix (*) are mandatory)" is displayed
 And User click the Email Password button
 Then User verify the error message "Email Address is Empty" is displayed without entering email id.
 
Scenario Outline: User verify the error message "Email Address does not exsit in database" is displayed
 Given User is on Home Page
 Then User Verifying the text "Existing User Login - Build 1" in Home Page
 And User click the Forgot Password hyperlink
 Then User verifying the text "Forgot Password Form (Fields marked with Red asterix (*) are mandatory)" is displayed
 When User enter unregistered "<emailID>" in email field
 And User click the Email Password button
 Then User verify the error message "Email Address does not exsit in database" is displayed on entering unregistered email id.
 
 Examples:
      |emailID            |
      |shanmathi@gmail.com|
 
Scenario Outline: User verify the error message "Invalid email, Please enter correct email." is displayed
 Given User is on Home Page
 Then User Verifying the text "Existing User Login - Build 1" in Home Page
 And User click the Forgot Password hyperlink
 Then User verifying the text "Forgot Password Form (Fields marked with Red asterix (*) are mandatory)" is displayed
 When User enter invalid "<emailID>" in email field
 And User click the Email Password button
 Then User verify the error message "Invalid email, Please enter correct email." is displayed on entering invalid email id.
 
 Examples:
      |emailID           |
      |shanmathigmail.com|
      
Scenario Outline: User can reset the Forgot password form on clicking the reset button
 Given User is on Home Page
 Then User Verifying the text "Existing User Login - Build 1" in Home Page
 And User click the Forgot Password hyperlink
 Then User verifying the text "Forgot Password Form (Fields marked with Red asterix (*) are mandatory)" is displayed
 When User enter "<emailID>" in email field
 And User click the Reset button
 Then User verify the forgot passwor form is reset
 
 Examples:
      |emailID           |
      |shanmathigmail.com|
 