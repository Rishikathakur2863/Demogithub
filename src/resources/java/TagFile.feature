Feature: demo on use of tags in cucumber
@First
Scenario: Regressing Testing 
Given User is testing for the login functionality
Then User able to login successfully
 
 @second
 Scenario: System Testing
 Given User is testing the search functionality
 Then search works successfully
 
 @demo
 Scenario: Display the name of the tester
 Given "Rishika" is the tester on the testme app

