Feature: Create Team Captain Dashboard

Scenario: user can add new team to assign an event

Given user is on the Add New Team
When user can select the company in SelectCompany
And user can enter the team name in TeamName
And user can select the project in SelectProject
And user can select the team event in SelectTeamEvent
And user can switch the status to Active or Inactive in Status
And user can select the captain from SelectCaptain
And user also can add the captain by InviteCaptain button
And user can select the user from SelectUsers
And user also can add the users by InviteUsers button
Then user can submit to create a Team by clicking SubmitButton

