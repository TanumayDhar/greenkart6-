#Sanity scenario added
Feature: Search for vegetables and place order in the application.

  Background: 
    Given User navigated to the GreenKart landing page

  @Sanity
  Scenario: Search for items and navigate to check out page.
    When user searched for "beetroot" vegetable
    And added items to cart
    And user proceed to checkout page for purchase
    Then verify selected "Beetroot - 1 Kg" items are displayed in check out page
    And user clicked on place order
    And user select country as "Australia"
    And clicked on check box and proceed for order
    Then verify order successfull.

  @Smoke
  Scenario: Search for items and validate results.
    When user searched for "cucumber" vegetable
    Then "Cucumber - 1 Kg" results are displayed

  @Regression
  Scenario: Search for items and navigate to check out page.
    When user searched for "brinjal" vegetable
    And added items to cart
    And user proceed to checkout page for purchase
    Then verify selected "Brinjal - 1 Kg" items are displayed in check out page
