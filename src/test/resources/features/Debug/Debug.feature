Feature: Debug Testing 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page

@OXO_HomePage @OXO_HomePage_05
Scenario: Verify the cooking & baking category in Homepage header 
	When user clicks on cooking & baking category
	 Then Verify the message on the page 
		|# verify user is redirected to the cooking & baking category page|
		|Cooking & Baking|