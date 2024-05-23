Feature: Create a new volunteering opportunity

Scenario: Validate the Assign page

Given user is on the Assign page
When user can select the continent from the Select Continent
And user can select Countries from the Select Country
And user can select Companies from the Select Companies
And user can select Regions from the Select Regions
And user can select Site from the Select Sites
And user can select Department from the Select Department(s)
And user can select Team from the Select Team(s)
And user can select User from the Select User(s)
Then user click the Next Step button to navigate to the next module