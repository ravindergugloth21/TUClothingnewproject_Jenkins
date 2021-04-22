@Followus
Feature: Add products to Basket
Scenario: Verify follow us functionality with Instagram
Given I am in Homepage
When I click Instagram logo next to follow us
And I  enter instragram credentials
|email|test@gmail.com|
|password|asdf!23@|
Then I should see my IG page
 Then starting again to see wthr this reflects on Master or feature when pushed to newJoinee