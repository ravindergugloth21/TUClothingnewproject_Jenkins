Feature: search
Background:
Given I am on HomePage
When I click on search

Scenario: verify search
And enter "Dress"
Then I should see dress related products

@second
Scenario Outline: verify with valid and invalid data
And enter "<keyword>"
Then I should see related "<result>"
Examples:
|keyword|result|
|Jeans|Search for 'Jeans'|
|Blue|Search for 'Blue'|
|Womens|Search for 'Womens'|