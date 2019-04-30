Feature: Verify OXO order8 Scenario 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
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
	
			