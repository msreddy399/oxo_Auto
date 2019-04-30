Feature: Verify OXO order Scenarios 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_ORDER @OXO_ORDER_01 @P_HIGH
Scenario: Place an order as guest user 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	And user clicks on checkout as a guest in checkout login page 
	And user enters shipping firstname "firstname" 
	And user enters shipping lastname "lastname" 
	And user enters shipping street address "streetAddress"
	And user enters shipping city "city"
	And user selects the state from dropdown
	And user enters shipping zipcode "zipcode"
	And user enters shipping phonenumber "phonenumber" 
	And user enters shipping email "emailwishlist" 
	And user selects shipping method 
	And user clicks on proceed to payment 
	And user clicks on credit card radio button 
	And user selects credit card type 
	And user enter credit card number "CCNumber" 
	And user enter CVV number "cvv" 
	And user selects month and year 
	When user clicks on place order button 
	Then capatures the order number 
	
@OXO_ORDER @OXO_ORDER_02 @P_HIGH
Scenario: Place an order as a registered user with out address saved in user account when user Logged in from Home page header  
    And user clicks on Wish list link in the header
    And user enter email "emailwishlist" 
	And user enter password "Password"
	And Clicks on Sign In button
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	And user enters shipping street address "streetAddress"
	And user enters shipping city "city"
	And user selects the state from dropdown
	And user enters shipping zipcode "zipcode"
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
	And user selects the state from dropdown
	And user enters shipping zipcode "zipcode"
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
	
@OXO_ORDER @OXO_ORDER_04 @P_HIGH
Scenario: Place an order as a registered user with out address saved in user account when user Logged in from checkout login page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	And user enters email in checkout login page "emailwithoutaddress3" 
	And user enters password in checkout login page "Password" 
	And Clicks on sign button 
	And user clicks on checkout button 
	And user enters shipping street address "streetAddress"
	And user enters shipping city "city"
	And user selects the state from dropdown
	And user enters shipping zipcode "zipcode"
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
	And clicks on delete in address book
	Then Verify below Sub/Main Module of MyAccount Page 
		|# Verify following elements in MyAccount |
		|addAnAddress_Btn|  
	
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
	
@OXO_ORDER @OXO_ORDER_06 @P_HIGH
Scenario: Place an order as a registered user with address saved in user account when user Logged in from checkout login page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	And user enters email in checkout login page "email" 
	And user enters password in checkout login page "Password" 
	And Clicks on sign button 
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
	Then capature the order number 	
	
@OXO_ORDER @OXO_ORDER_08 @P_HIGH
Scenario: verify order confirmation page items  
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
	Then Verify the message on the page
   |# Verify the folloowing message in order confirmation page|
    |Thank you for your order|
    |Questions about your order|
    |Returns or Exchanges|
    |Order Summary|
    Then Verify below Sub/Main Module of OrderConfirmation Page
		|# Verify following elements in OrderConfirmation Page |
		|orderItems_Lnk|
		|orderShipp_Lnk|
		|orderPayment_Lnk|	
	
			