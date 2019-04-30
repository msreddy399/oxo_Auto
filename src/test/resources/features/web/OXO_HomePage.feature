Feature: Verify OXO Home Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_01 @P_MEDIUM
Scenario: Verify the Wish list in link in the Homepage header 
	When user clicks on Wish list link in the header
	Then Verify the message on the page 
		|# verify the text message in sign in page|
		|Welcome back! Sign in|
		|New? Create an account|
		|Don’t have an account? Let’s create one now.|
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_02 @P_MEDIUM
Scenario: Verify the Sign In in link in the Homepage header 
	When user clicks on Sign In link in the header
	Then Verify the message on the page 
		|# verify the text message in sign modal box|
		|Welcome back! Sign in|
		|New? Create an account|
		|Don’t have an account? Let’s create one now.|
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_03 @P_MEDIUM
Scenario: Verify the See details link in the Homepage header 
	When user clicks on See details links 
	Then Verify the message on the page 
		|# verify the text message in sign in page|
		|Shipping|
		|Ordering Information| 
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_04 @P_MEDIUM
Scenario: Verify the OXO logo in the Homepage header 
	When user clicks on OXO logo in header 
	Then Verify below Sub/Main Module of HomePage 
		|# Verify following elements in Header |
		|signIn_Lnk|
		|wishList_Lnk|
		|Search_Icon|
	
@OXO_HOMEPAGE @OXO_HOMEPAGE_05 @P_LOW
Scenario: Verify the cooking & baking category in Homepage header 
	When user clicks on cooking & baking category
	 Then Verify the message on the page 
		|# verify user is redirected to the cooking & baking category page|
		|Cooking & Baking|	 
	 
@OXO_HOMEPAGE @OXO_HOMEPAGE_06 @P_LOW
Scenario: Verify the Beverage category in Homepage header 
	When user clicks on Beverage category
	 Then Verify the message on the page 
		|# verify user is redirected to the Beverage page|
		|Beverage|
	 
@OXO_HOMEPAGE @OXO_HOMEPAGE_07 @P_LOW
Scenario: Verify the Cleaning & Organization category in Homepage header 
	When user clicks on Cleaning & Organization category
	 Then Verify the message on the page 
		|# verify user is redirected to the Cleaning & Organization category page|
		|Cleaning |
	 
@OXO_HOMEPAGE @OXO_HOMEPAGE_08 @P_LOW
Scenario: Verify the Baby & Toddler category in Homepage header 
	When user clicks on Baby & Toddler category
	Then Verify the message on the page 
		|# verify user is redirected to the Baby & Toddler category page|
		|Baby and Toddler|
	 
@OXO_HOMEPAGE @OXO_HOMEPAGE_09 @P_LOW
Scenario: Verify the Good Tips Blog in Homepage header 
	When user clicks on Good Tips Blog
	 Then verify user is redirected to the appropriate category
	 Then Verify the message on the page 
		|# verify user is redirected to the Baby & Toddler category page|
		|Cook Up Some Fun With These Kid-Friendly Recipes|		  
	
@OXO_HOMEPAGE @OXO_HOMEPAGE_10 @P_MEDIUM
Scenario: Verify the global search in the Homepage header 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	When user clicks on close icon 
	Then user should redirect back to the current page 
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_11 @P_MEDIUM
Scenario: Verify the empty mini cart in the Homepage header 
	When user clicks on empty mini cart
	Then Verify the message on the page 
		|# verify the text message|
		|Cart|
@OXO_HOMEPAGE @OXO_HOMEPAGE_12 @P_LOW
Scenario: Verify the most searched products banner in home page   
    Then Verify the message on the page 
		|# Verify the folloowing message|
		|Resolutions|
		|worth keeping|
    	|No matter your New Year’s goal,|
		|our tools help make it better|
	When User clicks on shop now button
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Cooking |
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_13 @P_LOW
Scenario: Verify the Featured Collection products section in home page   
    Then Verify the message on the page 
		|# Verify the folloowing message|
		|Meal prep, mastered|
       |These airtight, leakproof containers won’t let|
	 When User clicks on shop now button in Featured Collection section
	 Then Verify the message on the page 
		|# Verify the folloowing message|
		|Smart Seal|
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_14 @P_LOW
Scenario: Verify the Featured Collection product images in home page
Then Verify the message on the page 
		|# Verify the folloowing message|
		|Meal prep, mastered|
       |These airtight, leakproof containers won’t let|
    When user clicks on any image in the Featured Collection section
    Then user should redirect to the pdp page of that product
       
@OXO_HOMEPAGE @OXO_HOMEPAGE_15 @P_LOW
Scenario: Verify The OXO Better Guarantee section in home page
   Then Verify the message on the page 
		|# Verify the folloowing message|
		|The OXO Better Guarantee|
   When user clicks on Learn More button
    Then Verify the message on the page 
		|# Verify the folloowing message|
		|The OXO Better Guarantee|
		 
@OXO_HOMEPAGE @OXO_HOMEPAGE_15 @P_LOW
Scenario: Verify The OXO Most Loved Products section in home page
Then Verify the message on the page 
		|# Verify the folloowing message|
		|OXO Most Loved Products|
		|Most Loved|
   When user clicks on Shop OXO Most Loved button
    Then Verify the message on the page 
		|# Verify the folloowing message|
		|Most Loved|
		 
@OXO_HOMEPAGE @OXO_HOMEPAGE_16 @P_LOW
Scenario: Verify The OXO Good Tips blog section in home page 
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|From the OXO Blog|
		|Good Tips|
	When user clicks on OXO Good Tips Blog button 
	Then Verify the message on the page 
		|# verify user is redirected to the Baby & Toddler category page|
		|Cook Up Some Fun With These Kid-Friendly Recipes|
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_17 @P_LOW
Scenario: Verify The Latest slider section in home page
Then Verify the message on the page 
		|# Verify the folloowing message|
		|What's New|
		|The Latest|
   When user clicks on any product image in the latest slider section
   Then user should redirect to the pdp page of that product
   
@OXO_HOMEPAGE @OXO_HOMEPAGE_18 @P_LOW
Scenario: Verify The instagram slider section in home page
Then Verify the message on the page 
		|# Verify the folloowing message|
		|#OXOBetter|
   When user clicks on follow us button in the instagram slider section
   Then verify the user is redirected to the oxo instagram page
   
@OXO_HOMEPAGE @OXO_HOMEPAGE_19 @P_LOW
Scenario: Verify The instagram slider image in home page
Then Verify the message on the page 
		|# Verify the folloowing message in top banner|
		|#OXOBetter|
   When user clicks on any image in the instagram slider section
   Then verify the details are displayed in the popup
   
@OXO_HOMEPAGE @OXO_HOMEPAGE_20 @P_LOW
Scenario: Verify The Stay in the Loop section in home page 
	Then Verify the message on the page 
		|# verify the text message in sign in page|
		|Stay in the Loop.|
		|Sign up and be the first to hear about exclusives, promotions and more!|
	When user enters email and clicks on submit button 
	Then Verify below Sub/Main Module of HomePage 
		|# Verify following elements in HomePage |
		|BackToHomePage_Btn|
		  	
@OXO_HOMEPAGE @OXO_HOMEPAGE_21 @P_LOW
Scenario: Verify the footer social medai links in home page 
	Then Verify below Sub/Main Module of HomePage 
		|# Verify following elements in Footer |
		|instgram_Icon|
		|facebook_Icon|
		|pinterest_Icon|
		|youtube_Icon|
		|twitter_Icon|
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_22 @P_MEDIUM
Scenario: Verify the OXO logo in the Homepage Footer 
	When user clicks on OXO logo in footer 
	Then Verify below Sub/Main Module of HomePage 
		|# Verify following elements in HomePage |
		|signIn_Lnk|
		|wishList_Lnk|
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_23 @P_MEDIUM
Scenario: Verify the country selector  
	When user clicks on country selector dropdown 
	Then verify the list of countries displayed in the dropdown
	Then Verify below Sub/Main Module of HomePage 
		|# Verify following elements in Footer |
		|UK_drpdwn|
		|Germany_drpdwn|
		|Japan_drpdwn|
		
@OXO_HOMEPAGE @OXO_HOMEPAGE_24 @P_MEDIUM
Scenario: Verify the country selector in Footer 
	And user clicks on country selector dropdown 
	And verify the list of countries displayed in the dropdown 
	Then Verify below Sub/Main Module of HomePage 
		|# Verify following elements in Footer |
		|UK_drpdwn|
		|Germany_drpdwn|
		|Japan_drpdwn|
	When user clicks on country any country in the dropdown 
	Then verify the user is redirected to the selected country 		
	
@OXO_HOMEPAGE @OXO_HOMEPAGE_25 @P_LOW
Scenario: Verify the terms of use and privacy policy links in footer 
	When User clicks on Terms Of Use 
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Terms |
	When User clicks on privacy policy 
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Privacy Policy|					

@OXO_HOMEPAGE @OXO_HOMEPAGE_26 @P_LOW
Scenario: Verify the all the links under Help in home page Footer
	And User clicks on Contact Us
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Terms |
	And User clicks on FAQ
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Frequently Asked Questions |
	And User clicks on Store Locator
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Find a Store |	
	And User clicks on Product Registration 
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Product Registration | 
	And User clicks on Voluntary Recall
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Tot Nest Booster Seat Voluntary Recall |
	And User clicks on Privacy Policy
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Privacy Policy |
	And User clicks on Terms & Conditions
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Terms |
	And User clicks on Blogger Outreach    
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Terms |

@OXO_HOMEPAGE @OXO_HOMEPAGE_27 @P_LOW
Scenario: Verify the all the links under Shipping & Returns in home page Footer 
	And User clicks on Track order
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Track Order |
	And User clicks on Shipping iformation 
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Shipping |
	When User clicks on Better Guarantee 
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|The OXO Better Guarantee |
			
@OXO_HOMEPAGE @OXO_HOMEPAGE_28 @P_LOW
Scenario: Verify the all the links under Company in home page Footer 
	When User clicks on Good Tips Blog2
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Cook Up Some Fun With These Kid-Friendly Recipes |
	And User clicks on Investor Submission 
	Then Verify the message on the page 
		|# Verify the folloowing message|
		|Inventor Submission |
#	And User clicks on Careers 
#	And User clicks on Investor Relations 
	