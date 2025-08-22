Feature: check user is able to login with credetials
Scenario: login
Given login page should be open in default browser
When click on username button and enter <username1>
And add <password1>
And click on signin button and check <status>
Then open home page

Examples:
|username1|password1|status|
|username|pass|failed|
|user|password|failed|
|user1|pass|failed|
|username|password|passed|
