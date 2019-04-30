Feature: Verify OXO Cart Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_CART @OXO_CART_01 @P_MEDIUM
Scenario: Verify the continue Shopping link in cart page
	And user clicks on search icon
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And  user navigates to cart page 
	When user clicks on continue shopping link in cart page 
	Then Verify below Sub/Main Module of HomePage 
		|# Verify following elements in HomePage |
		|signIn_Lnk|
		|wishList_Lnk|
	
@OXO_CART @OXO_CART_02 @P_MEDIUM
Scenario: Verify cart item product attributes in cart page
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	When user navigates to cart page 
	Then Verify below Sub/Main Module of CartPage 
		|# Verify following elements in Cart Page | 
#		|cartPrd_Img|
		|cartRemoveItem_Lnk|
		|cartPrice_Txt|
		|cartPrdName_Txt|
		|cartSkuId_Txt|
	
@OXO_CART @OXO_CART_03 @P_MEDIUM
Scenario: Click on cart image should redirect user to PDP 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And  user navigates to cart page 
	When user clicks on product image 
	Then Verify below Sub/Main Module of PDP Page 
		|# Verify following elements in PDP Page |
		|PdpAddToCart_Btn|
		|pdpWishList_Icon| 
	
@OXO_CART @OXO_CART_04 @P_MEDIUM
Scenario: Verify whether user is able to update quantity in cart page
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And  user navigates to cart page 
	When user clicks on update quantity in cart page 
	Then Verify the message on the page 
		|# verify the text message in cart page|
		|Cart (2)|
	
@OXO_CART @OXO_CART_05 @P_MEDIUM
Scenario: Verify the remove item link in cart page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And  user navigates to cart page 
	When user clicks on remove item from cart 
	Then Verify the message on the page 
		|# verify the text message in cart page|
		|You haven't put any items in your cart.|

	
@OXO_CART @OXO_CART_06 @P_MEDIUM
Scenario: Verify the order summary details in cart page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	When user navigates to cart page 
	Then Verify below Sub/Main Module of CartPage
		|# Verify following elements in Cart Page |
		|cartOrderSummary_Txt|
		|cartOrderSummaryPrice_Txt|
		|cartOrderSummarySubtotalPrice_Txt|
		|cartOrderTotalPrice_Txt|
	
@OXO_CART @OXO_CART_07 @P_MEDIUM
Scenario: verify checkout button functionality as a guest user in cart page
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
	
@OXO_CART @OXO_CART_08 @P_MEDIUM
Scenario: verify checkout button functionality as a registered user in cart page
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
	When user clicks on checkout button 
	Then Verify the message on the page
    |# Following Message should show on the shipping page|
    |Shipping| 	
	
@OXO_CART @OXO_CART_09 @P_MEDIUM
Scenario: Verify paypal payment method in cart page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	When user navigates to cart page 
	Then Verify below Sub/Main Module of CartPage 
		|# Verify following elements in Cart Page | 
		|cartPayPal_Btn|
		
@OXO_CART @OXO_CART_10 @P_MEDIUM
Scenario: Verify move to wishlist link functionality in cart page
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
	When user clicks on move to wishlist link in cart page
	Then verify the item is moved to wish list page
