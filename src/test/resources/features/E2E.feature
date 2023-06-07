Feature: End to End flow of application

As a Valid User I want to place an Order
so that I can own a product

Background: User is logged in
			Given User navigate to Login page
			When User enters username and password
			|Username|anurag.ec27@gmail.com|
			|Password|Password|
			
			
			#anurag.ec23@gmail.com
			Then User should logged in
		
 
 Scenario Outline: Ordering a Iphone
    When User search for product and Add to cart
    Then User should see the message  Success: You have added item to your shopping cart!
    And User click on Shopping cart
    #Then User should see the added product details 
    And User click on checkout 
    And User select the address and click on Continue
    |Firstname| anurag|
    |Lastname|test|
    |Address1|100,Test|
    |City|Morena|
    |Postcode|476001|
    
    And User select delivery details and click on continue
    And User select delivery method and click on continue
    And User select payment method and agree to T&C and click on continue
    And User validate the order details and click on Confirm Order
    Then User should see the message "Your order has been placed!"
    And User click on Continue
    
    

