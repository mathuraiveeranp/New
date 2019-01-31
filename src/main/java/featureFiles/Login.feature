Feature: Login into LeafTap

Background:
Given Open the browser
And Maximize the window
And Set implicit timeout
And Load the URL

@Positive
Scenario Outline: Login into LeafTap application with valid details

And Enter the username as <userName>
And Enter the password as <passWord>
When Click the login button
Then Verify the successful login

Examples:
|userName|passWord|
|DemoSalesManager|crmsfa|
#|DemoCSR|crmsfa|
#
#@Negative
#Scenario Outline:: Login into LeafTap application with invalid details
#
#And Enter the username as <userName>
#And Enter the password as <passWord>
#When Click the login button
#But Verify the unsuccessful login
#
#Examples:
#|userName|passWord|
#|DemoSalesManager|crmsfa1|