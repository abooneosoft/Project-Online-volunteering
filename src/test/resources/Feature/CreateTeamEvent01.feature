Feature: Verify the template - (Create a Team Event Template);

Scenario: Validate the main page

Given user is on the These are your task tab
When user click the each module 
And user should navigate to the respective module 
And verify the modules are horizontally scrollable
And verify the left and right arrow button is clickable
And validate the left and right button is navigate to previous and next module
And validate the Next Step button to navigate to the next module

Scenario: Validate the Assign page

When user clicks on Select Continent module 
And drop-down and search box will appear for continents
When user click the Select Country 
And drop-down appear for Countries
When user click the Select Company
And drop-down appear for Companies
When user click the Select Region Test(s)
And drop-down appear for Regions
When user click the Select Site Test(s)
And drop-down appear for Sites
When user click the Select Department Test(s)
And drop-down appear for Departments
When user click the Select Team
And drop-down appear for Teams
When user click the Select User
And drop-down appear for Users
When user click the Select Additional Event Lead
And drop-down appear for Event Leads
When user click the Select Beneficiary
And drop-down appear for Beneficiaries
And user click the  Select Beneficiary Users
Then drop-down appear for Beneficiary Users

Scenario: Validate the Event Overview page

Given User is on Event Overview
When user click on the Template title to enter the title
And verify the Template title place holder is enter title
When click on Title tab to enter the title and the place holder should be enter title
And click on Short Description tab to enter the Description and the place holder should be Enter Short Description
When user click on the Feature image module or Browse button
Then user should navigate to Local repository to upload
When click on Video button Text to enter the title and the place holder should be Enter Video button text
And click on Enter the embedded code here to your video to enter the embedded code on text
Then validate the Previous step button and Next Step button to navigate to the Previous and Next Template

Scenario: Validate the Volunteering Details page

Given User is on The Volunteering Details
When click on Ev Number to enter the Ev Number and the place holder should be Ev Number
And verify Event Creator is clickable
When user click the Select Project Manager drop-down appear for Select Manager
When user click the Select Event Manager drop-down appear for Select Manager
And user click the Name of the beneficiary you are supporting to enter the Beneficiary Name 
And the place holder should be Beneficiary Name
When user click the Main point of contacts email address at the beneficiary to enter the email
And the place holder should be Beneficiary Email
When user click the What is the date and start time of the event? and Date and Time dialogue should be appear
And validate the calendar modules should be clickable
When user clicks the date the time should be appear
When user clicks the time the minutes should be appear and clickable
And user enter the date, validate the clear button is clickable 
When validate the How many hours of the volunteer’s time is required?
And click on the Hours and Minutes to drop-down the hours and minutes
When user clicks the Choose timezone to view the drop-down for time zones with search box 
When validate The Location Check box
And click on check box to display address entry
And validate the Street1,Street2, City, Region / State, Post Code, Select Country, Directions modules,Parking Information
When user click the select country drop-down appear for the countries
And user should fill the direction box otherwise, a message (This field is required is shown)
And user should fill the Parking Information box otherwise, a message (This field is required is shown)
And validate the check box I don’t know the exact location yet is clickable
And validate Please enter the What3 words of your location is clickable and the place holder should be Enter What3 words
When user validate the Additional details for the volunteers
And verify Remote, Indoors, Outdoors and Other, please specify radio buttons are clickable
And validate the remote button to display the Please enter video conference link text box
And verify the place holder should be Enter video conference link
Given user is on volunteering event and volunteers tasks/activities 
When user click Describe the volunteering event and volunteers tasks/activities to enter text
And validate the letter formatting options are clickable
When user click the Impact the volunteering event will have on the charity to enter text
And verify the place holder text placeholder Example: Keeping residents in a care home company not only enhances their well-being but also strengthens the charitys mission by creating a supportive and joyful environment that positively impacts lives.
And validate Upload documents to go into document hub, Upload your Risk Assessment and Upload your Confidentiality Cause to navigate to uploading files
Then user click Next Step button to navigate to Volunteers Impact

Scenario: Validate the Volunteering Impact page

Given user on Volunteering Impact page
When click on every option validate the options are clickable
And mouse hover each option to verify the statement of the specific module
And verify user can click all the module
And verify the selected modules are highlighted and rest are not
Then user click Next Step button to navigate to Set up the Sign-up Form

Scenario: Verify the Sign-up Form page

Given user on Sign-up Form page
When click on Next Steps to enter the text
And verify the Source button and Formatting options are clickable
When click What is the maximum capacity of volunteers for this event? module to enter the number
And verify the up and down arrow to validate the count
When user click What text would you like to appear on the sign-up button? to enter the text, verify the place holder should be Enter Sign up button text
When user click the Sign-Up Deadline (date box which adds countdown to frontend)and Date and Time dialogue should be appear
And validate the calendar modules should be clickable
When user clicks the date the time should be appear
When user clicks the time the minutes should be appear and clickable
And user enter the date, validate the clear button is clickable 
And validate the additional features added options
And verify all the toggle switches below the additional feature
And verify Email Address text box to enter text and validate add button to add the additional text box
And verify the garbage button to reduce the text box
Then click the Next step button to navigate to Event Confirmation Page

Scenario: Verify the Event Confirmation page

Given user on Event Confirmation page
When user click the Send Confirmation email toggle off then below tabs should disappear
And validate the toggle on and verify the below modules
And user click Please choose your template here and the search box and drop down should appear 
And verify the Email subject text box to enter the email and verify the place holder Enter Email Subject
When user validate the Body of email module to enter the text
And validate the font formatting options are clickable 
And click on Add Dynamic Tags to verify the drop down
Then click on Next Step to navigate to Volunteering itinerary

Scenario: Verify the Volunteering itinerary page

Given user on Volunteering itinerary page
When user click on Date VI’s need to be reviewed module to drop down the Date *
And click clear button to clear the entered date
When user click the Send Volunteering Itinerary toggle to off then the below module should disappear
And validate the Please choose your template here module to verify the search box and drop down
When verify the Please choose the date and time module to drop down the Date & Time
And validate the calendar modules should be clickable
When user clicks the date the time should be appear
When user clicks the time the minutes should be appear and clickable
And user enter the date, validate the clear button is clickable 
When user click on Who is the Event Facilitator? module to enter the Contact Name and Contact Time
And verify the place holder Enter Point Contact Name and Enter Point Contact Number
And user click the Upload company logo and browse button to verify the upload option
And user click the Upload documents to be sent as an attachment with the volunteering itinerary and browse button to verify the upload option
When user click the Subject module to enter the text
And validate the Body of email box to verify the font formatting options are clickable 
And click on Add Dynamic Tags to verify the drop down
Then click on Feedback Survey to navigate to Feedback Survey

Scenario: Verify the Feedback Survey Page

Given user on Notifications Page
When validate switch off the Send Feedback Survey toggle to disappear the below modules
And click on Select Feedback Survey Email Template verify the search box and drop down  
And click the Email Subject to enter the Email Subject and verify the place holder should Enter Email Subject
And validate the Body of email box to verify the font formatting options are clickable 
And click on Add Dynamic Tags to verify the drop down
And validate the Moderate feedback before publishing toggle
And user click the save as template button to navigate to the Save Feedback Survey Email Template
And verify the Save Feedback Survey Email Template to validate the yes and cancel buttons are clickable
When user click on Feedback Template to open the search box and drop down
And click on Add Questions button to open the Question Type module 
And verify the Question Type module drop down and verify the Is Required check box 
And to delete the new question box validate the remove button is clickable and verify the pop-up before removing
And verify the save as template button is clickable and validate the pop-up	
And verify the Select Feedback Survey Template drop-down and search box
And click on Add Questions button to open the Question Type module 
And verify the Question Type module drop down and verify the Is Required check box  
And to delete the new question box validate the remove button is clickable and verify the pop-up before removing
And verify the save as template button is clickable and validate the pop-up	
Then verify the next step button to move on to the upcoming page


Scenario: Verify the Attendee Management Page

Given user can enter first name, last name and email
When user click on add button to add the another set of entry
When user click on the trash button to remove the addition of entry
Then verify the next step button to move on to the review page
 
Scenario: Verify the Review Page

Given user can see the Congratulation message
When user scroll, user can see the overview of all the tabs
Then validate the submit button is clickable
When click on previous step button to check the previous pages


