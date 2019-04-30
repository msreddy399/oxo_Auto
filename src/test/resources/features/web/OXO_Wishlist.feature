Feature: Verify OXO Wish List Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_WISHLIST @OXO_WISHLIST_01 @P_MEDIUM
Scenario: Verify the product attributes in Wish List page
	And user clicks on Wish list link in the header
    And user enter email "emailwishlist" 
	And user enter password "Password"
	And Clicks on Sign In button
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to wish list icon in PDP 
	When user clicks on wish list links 
	Then Verify below Sub/Main Module of Wish List Page 
		|# Verify following elements in Wish List Page |
		|wishList_Img|
		|wishListRemove_Btn|
		|wishListAddToCart_Btn|
		|wishListAddAllToCart_Btn|
		|wishListPrdName_Txt|
		|wishListPrdPrice_Txt|
	And user remove item from wishlist	
	
@OXO_WISHLIST @OXO_WISHLIST_02 @P_MEDIUM
Scenario: Verify user is able to remove item from wish list page
	And user clicks on Wish list link in the header
    And user enter email "emailwishlist" 
	And user enter password "Password"
	And Clicks on Sign In button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to wish list icon in PDP 
	And user clicks on wish list links 
	When user remove item from wishlist 
	Then Verify the message on the page 
		|# Verify the following message in wish list page|
		|You have no items in your wish list.|

@OXO_WISHLIST @OXO_WISHLIST_03 @P_MEDIUM
Scenario: Verify guest user is able to add item to wish list from PDP page 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	When clicks on add to wish list icon in PDP
	And user enter email "emailwishlist" 
	And user enter password "Password"
	When Clicks on Sign In button
    Then Verify below Sub/Main Module of Wish List Page 
		|# Verify following elements in Wish Page |
		|wishList_Img|
		|wishListRemove_Btn|
		|wishListAddToCart_Btn|
		|wishListAddAllToCart_Btn|
  And user remove item from wishlist 
	
@OXO_WISHLIST @OXO_WISHLIST_04 @P_MEDIUM
Scenario: Verify Logged in user is able to add item to wish list from PDP page 
	And user clicks on Wish list link in the header
    And user enter email "emailwishlist" 
	And user enter password "Password"
	And Clicks on Sign In button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to wish list icon in PDP
	When user clicks on wish list links 
	Then Verify below Sub/Main Module of Wish List Page 
		|# Verify following elements in Wish Page |
		|wishList_Img|
		|wishListRemove_Btn|
		|wishListAddToCart_Btn|
		|wishListAddAllToCart_Btn|
	And user remove item from wishlist		
		
@OXO_WISHLIST @OXO_WISHLIST_05 @P_MEDIUM
Scenario: Verify guest user is able to add item to wish list from PLP
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user selects a product and clicks on wishlist icon 
	And user enter email "emailwishlist" 
	And user enter password "Password"
	When Clicks on Sign In button
    Then Verify below Sub/Main Module of Wish List Page 
		|# Verify following elements in Wish Page |
		|wishList_Img|
		|wishListRemove_Btn|
		|wishListAddToCart_Btn|
		|wishListAddAllToCart_Btn|
   And user remove item from wishlist		
	
@OXO_WISHLIST @OXO_WISHLIST_06 @P_MEDIUM
Scenario: Verify Logged in user is able to add item to wish list from PLP
	And user clicks on Wish list link in the header
    And user enter email "emailwishlist" 
	And user enter password "Password"
	And Clicks on Sign In button
	And user clicks on cooking & baking category 
	And user selects a sub category 
	And user selects a product and clicks on wishlist icon
	When user clicks on wish list links
    Then Verify below Sub/Main Module of Wish List Page 
		|# Verify following elements in wish list Page |
		|wishList_Img|
		|wishListRemove_Btn|
		|wishListAddToCart_Btn|
		|wishListAddAllToCart_Btn|	
	And user remove item from wishlist	
	
@OXO_WISHLIST @OXO_WISHLIST_07 @P_MEDIUM
Scenario: Verify user is able to move item to cart from wish list
	And user clicks on Wish list link in the header
    And user enter email "emailwishlist" 
	And user enter password "Password"
	And Clicks on Sign In button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to wish list icon in PDP 
	And user clicks on wish list links 
	When user clicks on add to cart button
	Then Verify the message on the page 
		|# Verify the following message in wish list page|
		|You have no items in your wish list.|
	And user navigates to cart page 
	And user clicks on remove item from cart	
		
@OXO_WISHLIST @OXO_WISHLIST_08 @P_MEDIUM
Scenario: Verify user is able to move all items to cart from wish list
	And user clicks on Wish list link in the header
    And user enter email "emailwishlist" 
	And user enter password "Password"
	And Clicks on Sign In button
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to wish list icon in PDP 
	And user clicks on wish list links 
	When user clicks on add all to cart button
	Then Verify the message on the page 
		|# Verify the following message in wish list page|
		|You have no items in your wish list.|		
	And user navigates to cart page 
	And user clicks on remove item from cart		
		
@OXO_WISHLIST @OXO_WISHLIST_09 @P_MEDIUM
Scenario: Verify user is able to move item to wish list from cart page
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
	
