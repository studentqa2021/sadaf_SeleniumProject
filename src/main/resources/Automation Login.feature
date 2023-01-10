Feature: Login function testing
Scenario: As a user, must do successfull login with valid credential
Given Open a browser
And go to application URL
When click signin button
And put user name
And put password
And click sign in button
Then check sign out button there or not