Feature: Verify OXO MiniCart

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_MINICART @OXO_MINICART_01 @P_MEDIUM
Scenario: verify whether guest user added item is available in minicart 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	When clicks on add to cart button 
	Then verify the item is add to cart 
		
@OXO_MINICART @OXO_MINICART_02 @P_MEDIUM
Scenario: Verify whether guest user is able to remove item from mini cart 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And verify the item is add to cart 
	When user clicks on remove item link 
	Then verify the item is removed from the mini cart 
	
@OXO_MINICART @OXO_MINICART_03 @P_LOW
Scenario: Verify whether guest user is able to cancel removing item from mini cart 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And verify the item is add to cart 
	And user click on remove item link
	When user cancel removing item from mini cart 
	Then verify item is avialable in mini cart 
	
@OXO_MINICART @OXO_MINICART_04 @P_MEDIUM
Scenario: Verify whether guest user is able to land on cart page by clicking view cart button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	When user navigates to cart page 
	Then Verify below Sub/Main Module of CartPage 
		|# Verify following elements in the Cart Page | 
#		|cartPrd_Img|
		|cartRemoveItem_Lnk|
		|cartPrice_Txt|
		|cartPrdName_Txt|
		|cartSkuId_Txt|
		
@OXO_MINICART @OXO_MINICART_05 @P_MEDIUM
Scenario: Verify whether guest user is able to land on checkout page by clicking view checkout button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	When user clicks on checkout button in mini cart 
	Then Verify the message on the page 
		|# Following Message should show in the Shipping page|
		|Shipping|
		
@OXO_MINICART @OXO_MINICART_06 @P_MEDIUM
Scenario: verify the registered user added item is available in minicart 
	And user clicks on Sign In link in the header 
	And user enters email "email" 
	And user enters password "Password" 
	And Clicks on login button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	When clicks on add to cart button 
	Then verify the item is add to cart 
		
@OXO_MINICART @OXO_MINICART_07 @P_MEDIUM
Scenario: Verify whether registered user is able to remove item from mini cart 
	And user clicks on Sign In link in the header 
	And user enters email "email" 
	And user enters password "Password" 
	And Clicks on login button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And verify the item is add to cart 
	When user clicks on remove item link 
	Then verify the item is removed from the mini cart 
	
	
@OXO_MINICART @OXO_MINICART_08 @P_MEDIUM
Scenario: Verify whether registered user is able to land on Shipping page by clicking view checkout button 
	And user clicks on Sign In link in the header 
	And user enters email "email" 
	And user enters password "Password" 
	And Clicks on login button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	When user clicks on checkout button in mini cart 
	Then Verify the message on the page 
		|# Following Message should show in the Shipping page|
		|Shipping|
		
@OXO_MINICART @OXO_MINICART_09 @P_MEDIUM
Scenario: Verify whether registered user is able to land on cart page by clicking view cart button 
	And user clicks on Sign In link in the header 
	And user enters email "email" 
	And user enters password "Password" 
	And Clicks on login button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	When user navigates to cart page 
	Then Verify below Sub/Main Module of CartPage 
		|# Verify following elements in Cart Page | 
		|cartPrdName_Txt|
		|cartSkuId_Txt|
		
@OXO_MINICART @OXO_MINICART_10 @P_LOW
Scenario: Verify whether registered user is able to cancel removing item from mini cart 
	And user clicks on Sign In link in the header 
	And user enters email "email" 
	And user enters password "Password" 
	And Clicks on login button 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And verify the item is add to cart 
	And user click on remove item link 
	When user cancel removing item from mini cart 
	Then verify item is avialable in mini cart 
