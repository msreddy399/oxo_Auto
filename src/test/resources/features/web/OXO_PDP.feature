Feature: Verify OXO Poduct detail Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_PDP @OXO_PDP_01 @P_MEDIUM
Scenario: Verify the product attributes in PDP 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	When selects an item from search result 
	Then Verify below Sub/Main Module of PDP Page 
		|# Verify following elements in PDP Page |
		|PdpAddToCart_Btn|
		|pdpWishList_Icon|
		|pdpProductName_Txt|
		|pdpProductPrice_Txt|	
	
@OXO_PDP @OXO_PDP_02 @P_MEDIUM
Scenario: Verify the breadcrumb in PDP 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	When selects an item from search result 
	Then Verify below Sub/Main Module of PDP Page 
		|# Verify following elements in PDP Page |
		|pdpBreadcrumb_Lnk|
		
@OXO_PDP @OXO_PDP_03 @P_MEDIUM
Scenario: Verify whether user is able to navigate to plp from the pdp breadcrumb 
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user clicks on breadcrumb link in pdp
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|PlpBanner_Img1|
		|PlpBanner_Img2|
		|plpBannerTittle_Txt|
		|plpBannerSubTittle_Txt|		
		
@OXO_PDP @OXO_PDP_04 @P_MEDIUM
Scenario: Verify the product image slider in PDP 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	When selects an item from search result 
	Then Verify below Sub/Main Module of PDP Page 
		|# Verify following elements in PDP Page |
		|pdpImgSlider_Img|
		
@OXO_PDP @OXO_PDP_05 @P_MEDIUM
Scenario: Verify the add to cart functionality in PDP as a guest user 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And verify the item is add to cart
#	Then Verify below Sub/Main Module of PDP Page 
#		|# Verify following elements in PDP Page |
#		|minicartCheckout_Btn|
#		|miniCartViewCart_Btn| 
   When user navigates to cart page 
	Then Verify below Sub/Main Module of CartPage 
		|# Verify following elements in Cart Page | 
		|cartPrd_Img|
		|cartRemoveItem_Lnk|
		|cartPrice_Txt|
		|cartPrdName_Txt|
		|cartSkuId_Txt|
	
@OXO_PDP @OXO_PDP_06 @P_MEDIUM
Scenario: Verify the add to cart functionality in PDP as a registered user 
#	And user clicks on Sign In link in the header 
#	And user enters email "email" 
#	And user enters password "Password" 
#	And Clicks on login button
    And user clicks on Wish list link in the header
    And user enter email "emailwishlist" 
	And user enter password "Password"
	And Clicks on Sign In button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And verify the item is add to cart
#	Then Verify below Sub/Main Module of PDP Page 
#		|# Verify following elements in PDP Page |
#		|minicartCheckout_Btn|
#		|miniCartViewCart_Btn| 
   When user navigates to cart page 
	Then Verify below Sub/Main Module of CartPage 
		|# Verify following elements in Cart Page | 
		|cartPrd_Img|
		|cartRemoveItem_Lnk|
		|cartPrice_Txt|
		|cartPrdName_Txt|
		|cartSkuId_Txt|
	
@OXO_PDP @OXO_PDP_07 @P_MEDIUM
Scenario: Verify the wishlist functionality in PDP as a guest user 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	When clicks on add to wish list icon in PDP
	And user enter email "emailwishlist" 
	And user enter password "Password"
	When Clicks on Sign In button
    Then Verify below Sub/Main Module of Wish List Page 
		|# Verify following elements in Wish List Page |
		|wishList_Img|
		|wishListRemove_Btn|
		|wishListAddToCart_Btn|
		|wishListAddAllToCart_Btn|
	And user remove item from wishlist	
	
@OXO_PDP @OXO_PDP_08 @P_MEDIUM
Scenario: Verify the wishlist functionality in PDP as a registered user 
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
	And user remove item from wishlist		
	
@OXO_PDP @OXO_PDP_09 @P_MEDIUM
Scenario: Verify whether user is able to update quantity in PDP 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result
	When user clicks on update quantity in PDP
	Then verify quantity is updated
	
@OXO_PDP @OXO_PDP_10 @P_MEDIUM
Scenario: Verify the product details link in PDP 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result
	When user clicks on product details link in PDP
	Then Verify the message on the page
    |# Verify the folloowing message|
    |Product Details|
    |Description|
    |More Info|
    |SKU|	