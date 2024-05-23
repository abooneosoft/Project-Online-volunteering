Feature: Verify the Login page functionalities

Scenario: verify the login page with valid credentials

Given user should be on the login page
When user click the sign up button 
And the button is clickable
And verify the www.onlinevolunteering.com link is clickable
And verify the Contact button is clickable
And verify the Privacy Policy button is clickable
And verify the Cookie Policy button is clickable
And verify the Forgot Password ? button is clickable
And user enter the username and password
And click the Sign In button
Then user navigate to the Home page

Scenario: verify the sign out button to navigate to login page

Given user should be on the Home page
When user mouse hover the My Profile button
And verify the Sign Out button is clickable
And user click sign out button
Then user navigate to the Login page

Scenario: verify all the buttons navigations in login page

When user click the sign up button user should navigate to sign up page
When user click back then user navigate to login page
When user click the privacy policy document should be open
When user click the cookie policy document should be open
When user click the URL, user should navigate to https://www.employeevolunteering.com/
Then user click the contact button mail box should open

