Feature: Verify OXO shipping Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_SHIPPING @OXO_SHIPPING_01 @P_MEDIUM
Scenario: Verify whether user is able to navigate to shipping page as a guest user 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	When user clicks on checkout as a guest in checkout login page 
	Then Verify the message on the page 
		|# verify the message in the shipping page|
		|Shipping|
		
@OXO_SHIPPING @OXO_SHIPPING_02 @P_MEDIUM
Scenario: Verify whether user is able to navigate to shipping page from mini cart
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	When user clicks on checkout button in mini cart
	Then Verify the message on the page 
		|# verify the message in the shipping page|
		|Shipping|	
	
@OXO_SHIPPING @OXO_SHIPPING_03 @P_MEDIUM
Scenario: Verify whether user is able to navigate to shipping page when user Logged in from Home page header 
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
	When user clicks on checkout button
	Then Verify the message on the page 
		|# verify the message in the shipping page|
		|Shipping|
		
@OXO_SHIPPING @OXO_SHIPPING_04 @P_MEDIUM
Scenario: Verify whether user is able to navigate to shipping page when user Logged in from checkout login page
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	Then Verify the message on the page 
		|# verify the message in the shipping page|
		|Shipping|	
		
@OXO_SHIPPING @OXO_SHIPPING_06 @P_MEDIUM
Scenario: Verify the cart items in shipping page
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	And user clicks on checkout as a guest in checkout login page
	When user clicks on item in cart dropdown in shipping page
	Then Verify below Sub/Main Module of Shipping Page
		|# Verify following elements in Shipping Page |
		|shippCartItem_Img|
		
@OXO_SHIPPING @OXO_SHIPPING_07 @P_MEDIUM
Scenario: Verify avs modal popup in shipping page 
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
	When user enters shipping city "city"  
#	Then Verify below Sub/Main Module of Shipping Page
#		|# Verify following elements in Shipping Page |
#		|shippAddrValidation_Btn| 
		
@OXO_SHIPPING @OXO_SHIPPING_05 @P_MEDIUM
Scenario: Verify whether user is able to navigate back to the cart page from shipping page
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
#	And user clicks on checkout as a guest in checkout login page 
	When user clicks on back to cart link 
	Then Verify below Sub/Main Module of CartPage 
		|# Verify following elements in cart Page | 
#		|cartPrd_Img|
		|cartRemoveItem_Lnk|
		|cartPrice_Txt|
		|cartPrdName_Txt|
		|cartSkuId_Txt|
				