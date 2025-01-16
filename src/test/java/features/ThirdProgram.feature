Feature: Application login

Background:
When launch the browser from config variables
And hit the home page url of banking site
#Before-->Background-->Scenario-->After

@RegressionTest @NetBanking
Scenario: user page default login 

Given User is on NetBanking landing page
When user login to the application with "User" and password 1234
Then Home page is displayed
And Cards are displayed

