Feature: Verify OXO order3 Scenario

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page
	
@OXO_ORDER @OXO_ORDER_03 @P_HIGH
Scenario: Place an order as a registered user with out address saved in user account when user Logged in from Shipping page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	And user clicks on checkout as a guest in checkout login page 
	And user enters shipping email "emailwithoutaddress2" 
	And user enters shipping password "Password" 
	And clicks on login button 
	And user enters shipping street address "streetAddress" 
	And user enters shipping city "city" 
	And user selects an address from avs popup 
	And user enters shipping phonenumber "phonenumber" 
	And user selects shipping method 
	And user clicks on proceed to payment 
	And user clicks on credit card radio button 
	And user selects credit card type 
	And user enter credit card number "CCNumber" 
	And user enter CVV number "cvv" 
	And user selects month and year 
	And user clicks on place order button 
	And capature the order number
	And user navigates to my account from dropdown
	And clicks on address book
	When clicks on delete in address book
	Then Verify below Sub/Main Module of MyAccount Page 
		|# Verify following elements in MyAccount |
		|addAnAddress_Btn| 