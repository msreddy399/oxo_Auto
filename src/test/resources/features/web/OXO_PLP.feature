Feature: Verify OXO Poduct listing Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_PLP @OXO_PLP_01 @P_MEDIUM
Scenario: Verify the PLP banner image and title 
	And user clicks on cooking & baking category 
	When user selects a sub category 
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|PlpBanner_Img1|
		|PlpBanner_Img2|
		|plpBannerTittle_Txt|
		|plpBannerSubTittle_Txt|
		
@OXO_PLP @OXO_PLP_02 @P_MEDIUM
Scenario: Verify the presence of breadcrumb in PLP 
	And user clicks on cooking & baking category 
	When user selects a sub category 
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|plpBreadcrumb_Lnk|
		
@OXO_PLP @OXO_PLP_03 @P_MEDIUM
Scenario: Verify whether user is able to navigate to parent category from the plp breadcrumb 
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user clicks on breadcrumb link in plp 
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|plpBreadcrumbcat_Lnk|
		
@OXO_PLP @OXO_PLP_04 @P_MEDIUM
Scenario: Verify the PLP filter
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user selects the plp sorting
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|plpSortClr_Lnk|
		
@OXO_PLP @OXO_PLP_05 @P_MEDIUM
Scenario: Verify the PLP filter clear all link
	And user clicks on cooking & baking category 
	And user selects a sub category 
	And user selects the plp sorting
	When user clicks on clear all link
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|PlpProduct_Img|
		|plpProductName_Txt|
		|plpProductPrice_Txt|				
		
@OXO_PLP @OXO_PLP_06 @P_MEDIUM
Scenario: Verify the product attributes in PLP 
	And user clicks on cooking & baking category 
	When user selects a sub category 
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|PlpProduct_Img|
		|plpProductName_Txt|
		|plpProductPrice_Txt|
		
@OXO_PLP @OXO_PLP_07 @P_MEDIUM
Scenario: Verify the add to cart functionality as a guest user from PLP 
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user selects a product and clicks on add to cart 
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|plpShopCart_Lnk|
		
@OXO_PLP @OXO_PLP_08 @P_MEDIUM
Scenario: Verify the add to cart functionality as a registered user from PLP 
#	And user clicks on Sign In link in the header 
#	And user enters email "email" 
#	And user enters password "Password" 
#	And Clicks on login button 
    And user clicks on Wish list link in the header
    And user enter email "emailwishlist" 
	And user enter password "Password"
	And Clicks on Sign In button
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user selects a product and clicks on add to cart 
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|plpShopCart_Lnk|
		
@OXO_PLP @OXO_PLP_09 @P_MEDIUM
Scenario: Verify the add to cart functionality as a guest user from PLP 
	And user clicks on cooking & baking category 
	And user selects a sub category 
	And user selects a product and clicks on add to cart 
	When user find the shop cart link and clicks on it 
	Then Verify the message on the page 
		|# verify the text message in cart page|
		|Cart|		
		
@OXO_PLP @OXO_PLP_10 @P_MEDIUM
Scenario: Verify the wish list functionality as a guest user from PLP 
	And user clicks on cooking & baking category 
	And user selects a sub category 
	And user selects a product and clicks on wishlist icon 
	And user enter email "emailwishlist" 
	And user enter password "Password" 
	When Clicks on Sign In button 
	Then Verify below Sub/Main Module of Wish List Page 
		|# Verify following elements in wish list Page |
		|wishList_Img|
		|wishListRemove_Btn|
		|wishListAddToCart_Btn|
		|wishListAddAllToCart_Btn|
	And user remove item from wishlist 
	
@OXO_PLP @OXO_PLP_11 @P_MEDIUM
Scenario: Verify the wish list functionality as a registered user from PLP 
#	And user clicks on Sign In link in the header 
#	And user enters email "emailwishlist" 
#	And user enters password "Password" 
#	And Clicks on login button 
    And user clicks on Wish list link in the header
    And user enter email "emailwishlist" 
	And user enter password "Password"
	And Clicks on Sign In button 
	And user clicks on cooking & baking category 
	And user selects a sub category 
	And user selects a product and clicks on wishlist icon 
	When user clicks on wish list links 
	Then Verify below Sub/Main Module of Wish List Page 
		|# Verify following elements in PLP Page |
		|wishList_Img|
		|wishListRemove_Btn|
		|wishListAddToCart_Btn|
		|wishListAddAllToCart_Btn|
	And user remove item from wishlist 
	
@OXO_PLP @OXO_PLP_12 @P_MEDIUM
Scenario: Verify the search functionality in bottom of the PLP 
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user enters the product name in PLP search "productName" 
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|PlpProduct_Img|
		|plpProductName_Txt|
		|plpProductPrice_Txt|
	