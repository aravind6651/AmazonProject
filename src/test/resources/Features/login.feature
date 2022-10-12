Feature: validate the login page

Scenario: validate the login with the valid credential

Given user is on the login page
When  user enters the valid username and password
And   user clicks the login button
Then  user is on the home page


