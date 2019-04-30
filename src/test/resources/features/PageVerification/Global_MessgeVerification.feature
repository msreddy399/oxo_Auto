Feature: Message/Text Verification


	Scenario: Gloabl Message/Text Verification
    Given user launches the browser and navigates to "OXO_HOME" page
    
    Then Verify the message on the page
    |# Following Message should show on the page|
    |Resolutions|
    |worth keeping|
    |No matter your New Year’s goal,|
    |our tools help make it better|
    |Featured Collection|
    |Meal prep, mastered|
    |These airtight, leakproof containers won’t let|
    |The OXO Better Guarantee|
    |OXO Most Loved Products|
    |Most Loved|
	|From the OXO Blog|
	|Good Tips|
	|What's New|
	|The Latest|
	|#OXOBetter| 
	|Stay in the Loop|
	|Make everyday better, everyday.| 
	|Free Shipping over $19.|
	|Welcome back! Sign in|
	|New? Create an account|
	|Don’t have an account? Let’s create one now.|
	|Shipping|
	|Ordering Information|
    |Cook Up Some Fun With These Kid-Friendly Recipes|
    |The OXO Better Guarantee|
    |From the OXO Blog|
	|Good Tips|
	|#OXOBetter|
	|Stay in the Loop.|
	|Sign up and be the first to hear about exclusives, promotions and more!|
	|Thank you for signing up!|
	|You have no items in your wish list.|
	|You haven't put any items in your cart.|
	|Shipping|
	|Payment |
	|Thank you for your order!|
	|Cart (2)|
	
    
     Then Verify the message not displayed on the page
     |# Following message should not show on the page|
    