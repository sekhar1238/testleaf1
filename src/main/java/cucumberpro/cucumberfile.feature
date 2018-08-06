Feature: Open the browesr

Scenario: Positive Create lead 

Given open the browser
And Maximize the window
And Load the url
And Set the timeout
And Enter the username as demosalesmanager  
And Enter the password as crmsfa
And click Login
And click CRMSFA
And click Create Lead
And Enter Company name as c1
And Enter First Name as f1
And Enter Last name as l1
When Submit Lead Details
Then Verify first name is same as f1

