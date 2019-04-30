Feature: Verify OXO Checkout Login Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_CHECKOUTLOGIN @OXO_CHECKOUTLOGIN_01 @P_MEDIUM
Scenario: Verify whether user is able to navigate to checkout login page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	When user clicks on checkout button
	Then Verify below Sub/Main Module of OXO_CheckoutLogin Page
		|# Verify following elements in CheckoutLogin Page |
		|checkoutLoginEmail_Txt|
		|checkoutLoginPass_Txt|
		|checkoutLoginSignIn_Btn|
		|checkoutLoginGuest_Btn| 
	
@OXO_CHECKOUTLOGIN @OXO_CHECKOUTLOGIN_02 @P_MEDIUM
Scenario: Verify the sign in button functionality in checkout login page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button
	And user enters email in checkout login page "emailwithoutaddress" 
	And user enters password in checkout login page "Password" 
	And Clicks on sign button
	When user clicks on checkout button
	Then Verify the message on the page 
		|# Following Message should show in the shipping page|
		|Shipping|	
	
@OXO_CHECKOUTLOGIN @OXO_CHECKOUTLOGIN_03 @P_MEDIUM
Scenario: Verify the checkout as a guest button functionality in checkout login page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	When user clicks on checkout as a guest in checkout login page
	Then Verify the message on the page 
		|# Following Message should show in the shipping page|
		|Shipping|	
	
@OXO_CHECKOUTLOGIN @OXO_CHECKOUTLOGIN_04 @P_MEDIUM
Scenario: Verify whether user is able to navigate back to cart page by clicking on close icon in checkout login page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	When user clicks on close icon in checkout login page
	Then Verify the message on the page 
		|# verify the text message in cart page|
		|Cart|
	
	