#Author: Shipra Kumari
Feature: hotel booking

Background:
Given user is on hotel booking form

Scenario: check the heading of the hotel booking form
Then display the confirm message

Scenario: prompt user to fill the first name field
When user leaves the first name field blank and click the submit button
Then display the pop up message

Scenario: prompt user to fill the last name field
When user leaves the last name field empty and click the submit
Then display message to fill

Scenario: prompt user to fill the email 
When user does not enter the email and click the submit button
Then display appropriate message

Scenario: prompt user to fill mobile field
When user skips the mobile field and click the button to submit
Then display the message 

Scenario: pop up to fill address field
When user does not enter address and click submit
Then show the message to fill

Scenario: prompt user to select city
When user does not select the city
Then display the message to select

Scenario: prompt to select state
When  user does not select the state
Then display the pop up to select

Scenario: pop up to fill card holder name
When user forgets to enter card holder name and clicks submit
Then message should be shown

Scenario: pop up to fill debit card number
When user forgets to enter Debit card number and clicks submit
Then message should be shown to fill

Scenario: pop up to fill CVV
When user does not enter the CVV
Then user will get the message

Scenario: prompt user to fill expiration month
When user skips to enter expiration month
Then user gets the message to fill

Scenario: prompt user to fill expiration year
When user does not enter the expiry year
Then pop up msg is displayed



Scenario: booking failed as user enterd the invalid mobile number
When user enters wrong pattern mobile number and click submit
|000000000|
|^%$&$%&*|
|1234556|
|987654321000|
|nfvgjvgdjf|
Then show the error message

Scenario: booking failed as user enterd the invalid email id
When user enters wrong pattern email id and click submit
|ffce.fdvb.bvjh|
|654754745|
|%^$%.DFYTD|
|fgcf@ghgf@mjv|
Then error message is displayed

Scenario Outline: Validate the number of rooms alloted 
When user enters <numberOfGuests>
Then for <numberOfGuests> allocate <numberOfRooms>
Examples:
|numberOfGuests|numberOfRooms|
|1|1|
|2|2|
|1|3|
|3|3|
|1|2|
|2|1|

Scenario: booking confirmed with valid details
When user enters the all valid data
Then display the success message



