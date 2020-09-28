Feature: Common Features
This feature includes scenario that would register a new user
1. register with your user
2. login with your user
3. click on compose

Background:
Given I am able to naviagte onto the elarning page


Scenario Outline: register with your user
When I Enter the first name as "<fname>"
And I Enter the last name as "<lname>"
And I Enter the email as "<email>"
And I Enter the user name as "<uname>"
And I Enter the pass as "<pwd1>"
And I Enter the confirm password as "<pwd2>"
And I click on the register button
Then I should see the message


Scenario Outline: login with your user and compose a mail
When I Enter the username as "<user>"
And I Enter the password as "<pwd>"
And I click on the login button 
And I should see the welcome message
And I click on compose button 
And I Enter Send to mail as "<sendtomail>"
And I Enter subject as "<subject>"
And I Enter message as "<message>"
And I click on send message button
Then I should get acknowledgement message

Examples:
|user		  |pwd       |
|S_K_3		|varad     |