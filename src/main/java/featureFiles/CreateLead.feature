Feature: Creating a lead

Background:
Given Open the browser
And Maximize the window
And Set implicit timeout
And Load the URL

Scenario Outline: Creating a lead with mandatory values

And Enter the username as <userName>
And Enter the password as <passWord>
When Click the login button
Then Verify the successful login
When Click crmsfa link
#And Click leads link
And Click create lead link
And Enter company name as <companyName>
And Enter first name as <firstName>
And Enter last name as <lastName>
And Click submit button
Then Verify successful lead creation as <companyName>

Examples:
|userName|passWord|companyName|firstName|lastName|
|DemoSalesManager|crmsfa|TestLeaf|AAA|BBB|