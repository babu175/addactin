Feature: Booking Functionality in the adactin application

@SmokeTest
Scenario Outline:: Verify the user is able to login in the application
Given user launches the application
When user enters the valid username in the "<username>" field
And user enters the valid password in the "<password>" field
And user clicks the login button	
Then user verifies whether the Homepage navigates to the Search Hotel Page

Examples:
|username|password|
|acc|111|
|bcc|333|
|abc|4747474747|
|babu|123456789|

Scenario: Verify user is in the Search Hotel Page
When user selects the location in the location field
And user selects the hotel in the hotel field
And user selects the room type in the room type field
And user selects the number of rooms
And user selects the check in date
And user selects the check out date
And user selects adult per room
And user selects children per room
And user clicks on the search button to search the given details
Then user verifies whether the Search Hotel page navigates to Select a Hotel page

Scenario: Verify user in the Select a Hotel Page
When user clicks on the Selected radio button
And user clicks on the continue button
Then user verifies whether the select a hotel page navigates to book a hotel page

Scenario: Verify user is in the Book a hotel page
When user enters the firstname in the FirstName field
And user enters the lastname in the LastName field
And user enters the billing address in the Billing Address field
And user enters the credit card type in the Credit card type field
And user selects the credit card type
And user selects the expiry date of the credit card
And user selects the expiry year of the credit card
And user enters the cvv in the Cvv field
And user clicks the book button to book the room
Then user verifies whether the Book a hotel page navigates to Booking Confirmation page

Scenario: Verify user is in Booking Confirmation page
When user verify and clicks the LogoutButton
Then user succesfuly logout the webpage