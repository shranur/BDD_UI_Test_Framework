#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Placing the order for an product 
  As a Valid User want to place the order for any product 

Background: User is logged in
			Given User navigate to Login page
			When User enters username and password
			|Username|anurag.ec27@gmail.com|
			|Password|Password|
			
			
			#anurag.ec23@gmail.com
			Then User should logged in
			
 

  #@tag2
  Scenario Outline: Ordering any product
    
    When User select the product category  
    Then User verify available product names for the selected category
    When User select product name for ordering 
    Then Verify the product is in Stock
    And Add the product in cart
    And User click on Shopping cart
    Then User should see the added product details 
    And User click on checkout 
    And User select the address and click on Continue
    And User select delivery details and click on continue
    And User select delivery method and click on continue
    And User select payment method and agree to T&C and click on continue
    And User validate the order details and click on Confirm Order
    Then User should see the message "Your order has been placed!"
    And User click on Continue


