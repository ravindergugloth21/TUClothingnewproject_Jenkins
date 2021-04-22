@add@Smoke
Feature: Add products to Basket
Background:
Given I am in Homepage 

Scenario Outline: Verify functionality to add  product to basket
When I search for "<oneitem>" to add to basket
And I add  the product to the basket 
Then I should see  "<one product>" in the basket
Examples:
|oneitem|one product|
|Spring Bouquet Dress|https://tuclothing.sainsburys.co.uk/cart|


Scenario Outline: Verify functionality to add product to basket
When I search for "<oneitem>" to add to basket
And I search and add another product to the basket
Then I should see two "<twoproducts>" in the basket
Examples:
|oneitem|twoproducts|
|Spring Bouquet Dress|2 items|