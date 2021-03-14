Feature: 	Login functionality
   In order to do internet banking
   As a valid bank customer
   I want to login successfully
   
   
Scenario Outline: Login Successful
Given I am in the login page of the ParaBank
When  I enter valid <username> and <password> with <userFullname>
Then I should be navigate  to the overview page 

Examples:
|username|password|userFullname|
|"chetan"|"chetan"|"chetan pawar"|




