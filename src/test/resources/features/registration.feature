@registration
Feature: registration
Scenario: verify registration
Given I am on HomePage
When I click on registration link
And I click on register
And I enter values

|rrrr@gmail.com|MR|Ravi|Raj|Sruthi22|Sruthi22|
And I click terms and conditions
Then I should be able to register


@mapstry
Scenario: verify registration
Given I am on HomePage
When I click on registration link
And I click on register
And I enter values using Map
|email|rrr@gmail.com|
|Title|MR|
|FirstName|seenu|
|SurName|ccc|
|Password|fffffff|
|ConfirmPassword|fffff|

And I click terms and conditions
Then I should be able to register
