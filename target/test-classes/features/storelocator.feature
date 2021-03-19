@storelocator
Feature: storelocator
Scenario Outline: verify storelocator with valid data
Given I am on HomePage
When I click on store locator
And I enter "<postcode>"
And click on find store
Then I need to see stores related to my postcode
Examples:
|postcode|
|IG7 5NP|
|IG2 6BX|