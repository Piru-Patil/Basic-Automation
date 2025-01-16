Feature: Application login

Background:
Given set up the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@RegressionTest
Scenario: Admin page defaul login

Given User is on NetBanking landing page
When user login to the application with "Admin" and password "4321"
Then Home page is displayed
And Cards are displayed

#Reusable
@MobileTest
Scenario: user page default login 

Given User is on NetBanking landing page
When user login to the application with "User" and password 1234
Then Home page is displayed
And Cards are displayed

@RegressionTest @SmokeTest
Scenario Outline: mortgage user page default login 

Given User is on NetBanking landing page
When user login to the application with "<username>" and password "<password>"
Then Home page is displayed
And Cards are displayed

Examples: 
 | username | password |
 | Credxyz | 2134 |
 | Debitabc | 2311 |
 | Custwer | 2211 |
 
 @RegressionTest
Scenario: user page default login
 
Given User is on Practice landing page
When user signup into application
| rahul |
| shetty |
| abcd@gmail.com |
| 739273483 |
Then Home page is displayed
And Cards are displayed

 
 

 
