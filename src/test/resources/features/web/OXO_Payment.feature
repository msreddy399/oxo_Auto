Feature: Verify OXO Payment Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_PAYMENT @OXO_PAYMENT_01 @P_MEDIUM
Scenario: Verify whether user is able to navigate to payment page as a guest user
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
	And user enters shipping email "emailwithoutaddress" 
	And user selects shipping method 
	When user clicks on proceed to payment 
	Then Verify the message on the page
    |# Verify the folloowing message in payment page|
    |Payment |
    
@OXO_PAYMENT @OXO_PAYMENT_02 @P_MEDIUM
Scenario: Verify whether registered user with out address saved in user account is able to navigate to payment page when user Logged in Home page header
    And user clicks on Wish list link in the header
    And user enter email "emailwithoutaddress" 
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
	When user clicks on proceed to payment 
	Then Verify the message on the page
    |# Verify the folloowing message in payment page|
    |Payment |    	
    
@OXO_PAYMENT @OXO_PAYMENT_03 @P_MEDIUM
Scenario: Verify whether registered user with out address saved in user account is able to navigate to payment page when user Logged in checkout login page
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
	And user clicks on checkout button
	And user enters shipping street address "streetAddress"
	And user enters shipping city "city"
	And user selects the state from dropdown
	And user enters shipping zipcode "zipcode"
	And user enters shipping phonenumber "phonenumber" 
	And user selects shipping method 
	When user clicks on proceed to payment 
	Then Verify the message on the page
    |# Verify the folloowing message in payment page|
    |Payment | 	    
    
@OXO_PAYMENT @OXO_PAYMENT_04 @P_MEDIUM
Scenario: Verify whether registered user with out address saved in user account is able to navigate to payment page when user Logged in Shipping page
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	And clicks on add to cart button 
	And user navigates to cart page 
	And user clicks on checkout button 
	And user clicks on checkout as a guest in checkout login page 
	And user enters shipping email "emailwithoutaddress" 
	And user enters shipping password "Password"
	And clicks on login button 
	And user enters shipping street address "streetAddress"
	And user enters shipping city "city"
	And user selects the state from dropdown
	And user enters shipping zipcode "zipcode"
	And user enters shipping phonenumber "phonenumber" 	
	And user selects shipping method 
	When user clicks on proceed to payment 
	Then Verify the message on the page
    |# Verify the folloowing message in payment page|
    |Payment |	
    
@OXO_PAYMENT @OXO_PAYMENT_05 @P_MEDIUM
Scenario: Verify whether registered user with address saved in user account is able to navigate to payment page  when user Logged in from Home page header
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
	When user clicks on proceed to payment 
	Then Verify the message on the page
    |# Verify the folloowing message in payment page|
    |Payment |    	
    
@OXO_PAYMENT @OXO_PAYMENT_06 @P_MEDIUM
Scenario: Verify whether registered user with address saved in user account is able to navigate to payment page  when user Logged in from shipping page
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
	When user clicks on proceed to payment 
	Then Verify the message on the page
   |# Verify the folloowing message in payment page|
    |Payment |     
    
@OXO_PAYMENT @OXO_PAYMENT_07 @P_MEDIUM
Scenario: Verify whether registered user with address saved in user account is able to navigate to payment page  when user Logged in from checkout login page
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
	When user clicks on proceed to payment 
	Then Verify the message on the page
    |# Verify the folloowing message in payment page|
    |Payment |      
	
@OXO_PAYMENT @OXO_PAYMENT_08 @P_MEDIUM
Scenario: Verify whether user is able to navigate back to the cart from payment page
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
	And user enters shipping email "emailwithoutaddress" 
	And user selects shipping method 
	And user clicks on proceed to payment 
#	When user clicks on back to cart link 
#	Then Verify below Sub/Main Module of CartPage 
#		|# Verify following elements in cart Page | 
#		|cartPrd_Img|
#		|cartRemoveItem_Lnk|
#		|cartPrice_Txt|
#		|cartPrdName_Txt|
#		|cartSkuId_Txt|
		
@OXO_PAYMENT @OXO_PAYMENT_09 @P_MEDIUM
Scenario: Verify the cart items in payment page
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
	And user enters shipping email "emailwithoutaddress" 
	And user selects shipping method 
	And user clicks on proceed to payment 
#	When user clicks on item in cart dropdown in shipping page
#	Then Verify below Sub/Main Module of Shipping Page
#		|# Verify following elements in Shipping Page |
#		|shippCartItem_Img|		
		
@OXO_PAYMENT @OXO_PAYMENT_10 @P_MEDIUM
Scenario: Verify the cart items in payment page
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
	And user enters shipping email "emailwithoutaddress" 
	And user selects shipping method 
	When user clicks on proceed to payment 
	Then Verify below Sub/Main Module of CartPage
		|# Verify following elements in CartPage |
#		|cartOrderSummary_Txt|
		|cartOrderSummaryPrice_Txt|
		|cartOrderSummarySubtotalPrice_Txt|
		|cartOrderTotalPrice_Txt|		
		
@OXO_PAYMENT @OXO_PAYMENT_11 @P_MEDIUM
Scenario: click on edit and verify user is able to navigate back to the shipping page from payment page
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
	And user enters shipping email "emailwithoutaddress" 
	And user selects shipping method 
	When user clicks on proceed to payment 
	When user clicks on edit in payment page
	Then Verify the message on the page 
		|# Verify the folloowing message in shipping page|
		|Shipping|		
		
@OXO_PAYMENT @OXO_PAYMENT_12 @P_MEDIUM
Scenario: Verify the payment methods in Payment page
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
	And user enters shipping email "emailwithoutaddress" 
	And user selects shipping method 
    When user clicks on proceed to payment 
	Then Verify below Sub/Main Module of Payment Page
		|# Verify following elements in Payment Page |
		|billingPaypal_RdBtn|
		|billingCredit_RdBtn|
				