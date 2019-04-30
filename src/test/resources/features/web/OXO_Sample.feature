Feature: Verify sample 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_ORDER @OXO_ORDER_07 @P_HIGH
Scenario: Place an order as a registered user with out address saved in user account when user Logged in from Shipping page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	And user clicks on checkout as a guest in checkout login page 
	And user enters shipping email "email" 
	And user enters shipping password "Password" 
	And clicks on login button 
	And user selects shipping method 
	And user clicks on proceed to payment 
	And user clicks on credit card radio button 
	And user selects credit card type 
	And user enter credit card number "CCNumber" 
	And user enter CVV number "cvv" 
	And user selects month and year 
	When user clicks on place order button 
		