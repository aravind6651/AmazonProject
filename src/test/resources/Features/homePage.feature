Feature: validate the home page

Scenario: Validate the home page with credentials

Given user is on the fb login page
When  user enters the fb username and password
| username        |  password  |
| apple@gmail.com |  apple@123 |
| orange@gmail.com|  orange@12 |
| guava@gmail.com |  guava@123 |
And   user clicks the fb login button
Then  user is on the fb home page
