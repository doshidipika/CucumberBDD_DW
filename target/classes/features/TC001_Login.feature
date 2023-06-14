Feature: Login Action # This is requirement
Scenario: Verify Login Action with Valid data display login successful  # In above requirement this is scenario/use case
Given user is on Home Page
When user clicks Sign in link check title
Then user enters user Name
And Password
And clicks on submit button
Then check login successful and display message Login