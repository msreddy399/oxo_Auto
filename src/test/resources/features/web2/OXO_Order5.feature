Feature: Verify OXO order5 Scenario

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page
	
@OXO_ORDER @OXO_ORDER_05 @P_HIGH
Scenario: Place an order as a registered user with address saved in user account when user Logged in from Home page header
    And user clicks on Wish list link in the header
    And user enter email "email" 
	And user enter password "Password"
	And Clicks on Sign In button
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	And user selects shipping method 
	And user clicks on proceed to payment 
	And user clicks on credit card radio button 
	And user selects credit card type 
	And user enter credit card number "CCNumber" 
	And user enter CVV number "cvv" 
	And user selects month and year 
	When user clicks on place order button 
	Then capature the order number