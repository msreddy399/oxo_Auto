package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_HomePage_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OXO_HomePage_SD extends CommonActionHelper {
	
	OXO_HomePage_PO oxoHomePagePO = PageFactory.initElements(driver, OXO_HomePage_PO.class);
	
	@When("^user clicks on Wish list link in the header$")
	public void user_clicks_on_Wish_list_link_in_the_header() throws Throwable {
		
		assertTrue(clickOnButton(oxoHomePagePO.wishList_Lnk)); 	   
		//assertFalse(false);
	}

	@When("^user clicks on Sign In link in the header$")
	public void user_clicks_on_Sign_In_link_in_the_header() throws Throwable {
		driver.navigate().refresh();
		waitForElement(oxoHomePagePO.signIn_Lnk);
		assertTrue(clickOnButton(oxoHomePagePO.signIn_Lnk)); 
	    
	}

	@When("^user clicks on See details links$")
	public void user_clicks_on_See_details_links() throws Throwable {
		
		assertTrue(clickOnButton(oxoHomePagePO.shippingDetails_Lnk));
		Thread.sleep(thread_medium);	    
	}

	@When("^user clicks on OXO logo in header$")
	public void user_clicks_on_OXO_logo_in_header() throws Throwable {
		
		assertTrue(clickOnButton(oxoHomePagePO.oxo_Logo)); 	    
	}
	
	@When("^user clicks on cooking & baking category$")
	public void user_clicks_on_cooking_baking_category() throws Throwable {
		
		Thread.sleep(5000);
		//assertTrue(clickOnButton(oxoHomePagePO.L1_Cat_CookingAndBaking));
		Actions hover = new Actions(getDriver());
		//hover.moveToElement(oxoHomePagePO.L1_Cat_CookingAndBaking).click().build().perform();
		//hover.contextClick(oxoHomePagePO.L1_Cat_CookingAndBaking).perform();
		hover.click(oxoHomePagePO.L1_Cat_CookingAndBaking).build().perform();
		
		//oxoHomePagePO.L2_Cat.click();
	}

	@Then("^verify user is redirected to the appropriate category$")
	public void verify_user_is_redirected_to_the_appropriate_category() throws Throwable {
	    
	    
	}

	@When("^user clicks on Beverage category$")
	public void user_clicks_on_Beverage_category() throws Throwable {
	    
	    
	}

	@When("^user clicks on Cleaning & Organization category$")
	public void user_clicks_on_Cleaning_Organization_category() throws Throwable {
	    
	    
	}

	@When("^user clicks on Baby & Toddler category$")
	public void user_clicks_on_Baby_Toddler_category() throws Throwable {
	    
	    
	}

	@Then("^verify user is redirected to the good tips page$")
	public void verify_user_is_redirected_to_the_good_tips_page() throws Throwable {
	    
	    
	}

	@When("^user clicks on Good Tips Blog$")
	public void user_clicks_on_Good_Tips_Blog() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.L1_Cat_GoodTipsBlog));
		
		/*
		 * Actions hover = new Actions(getDriver());
		 * hover.moveToElement(oxoHomePagePO.L1_Cat_GoodTipsBlog).click().build().
		 * perform();
		 */
	    
	    
	}
	
	@When("^user clicks on search icon$")
	public void user_clicks_on_search_icon() throws Throwable {
		//waitForElement(oxoHomePagePO.Search_Icon);
		assertTrue(clickOnButton(oxoHomePagePO.Search_Icon));
		
	}

	@When("^Search box will be shown to enter the text$")
	public void search_box_will_be_shown_to_enter_the_text() throws Throwable {
		waitForElement(oxoHomePagePO.Search_Placeholder_Txt);
		assertTrue(isDisplayed(oxoHomePagePO.Search_Placeholder_Txt));
		
	}

	@When("^user clicks on close icon$")
	public void user_clicks_on_close_icon() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.Search_Close_btn));
		
		
	}

	@Then("^user should redirect back to the current page$")
	public void user_should_redirect_back_to_the_current_page() throws Throwable {
		assertTrue(isDisplayed(oxoHomePagePO.Search_Icon));
		
	}
	
	@When("^user clicks on empty mini cart$")
	public void user_clicks_on_empty_mini_cart() throws Throwable {
		
		Actions hover = new Actions(getDriver());
		hover.moveToElement(oxoHomePagePO.minicart_Icon).click().build().perform();
		
	}
	
	@When("^User clicks on shop now button$")
	public void user_clicks_on_shop_now_button() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.Shop_Now1_Btn));
		
	}
	
	@When("^User clicks on shop now button in Featured Collection section$")
	public void user_clicks_on_shop_now_button_in_Featured_Collection_section() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.Shop_Now2_Btn));
		
	}
	
	@When("^user clicks on any image in the Featured Collection section$")
	public void user_clicks_on_any_image_in_the_Featured_Collection_section() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.Fea_Col_prd_Img));
	}

	@Then("^user should redirect to the pdp page of that product$")
	public void user_should_redirect_to_the_pdp_page_of_that_product() throws Throwable {
		assertTrue(isDisplayed(oxoHomePagePO.WishListPLP_Icon));
		
	}
	
	@When("^user clicks on Learn More button$")
	public void user_clicks_on_Learn_More_button() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.LearnMore_Btn));
		
	}
	
	@When("^user clicks on Shop OXO Most Loved button$")
	public void user_clicks_on_Shop_OXO_Most_Loved_button() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.LearnMore_Btn));
	}
	
	@When("^user clicks on OXO Good Tips Blog button$")
	public void user_clicks_on_OXO_Good_Tips_Blog_button() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.GoodTipsBlog_Icon));
	}
	
	@When("^user clicks on any product image in the latest slider section$")
	public void user_clicks_on_any_product_image_in_the_latest_slider_section() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.Latest_prd_Img));
		
	}
	
	@When("^user clicks on follow us button in the instagram slider section$")
	public void user_clicks_on_follow_us_button_in_the_instagram_slider_section() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.FollowsUs_Btn));
		
	}

	@Then("^verify the user is redirected to the oxo instagram page$")
	public void verify_the_user_is_redirected_to_the_oxo_instagram_page() throws Throwable {
		//code to implemented
		
	}
	
	@When("^user clicks on any image in the instagram slider section$")
	public void user_clicks_on_any_image_in_the_instagram_slider_section() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.Instagram_Slider_Img));
	}

	@Then("^verify the details are displayed in the popup$")
	public void verify_the_details_are_displayed_in_the_popup() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.Instagram_Slider_popup_Img));
		
	}
	
	@When("^user enters email and clicks on submit button$")
	public void user_enters_email_and_clicks_on_submit_button() throws Throwable {
		setInputText(oxoHomePagePO.StayInEmail_txt, "sree@sss.lll");
		assertTrue(clickOnButton(oxoHomePagePO.StayInEmail_btn));
	}
	
	@When("^user clicks on OXO logo in footer$")
	public void user_clicks_on_OXO_logo_in_footer() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.oxoFooter_Logo));
		
	}
	
	@When("^user clicks on country selector dropdown$")
	public void user_clicks_on_country_selector_dropdown() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.countrySelector_drpdwn));
		
	}

	@When("^verify the list of countries displayed in the dropdown$")
	public void verify_the_list_of_countries_displayed_in_the_dropdown() throws Throwable {		
		assertTrue(isDisplayed(oxoHomePagePO.UK_drpdwn));
		assertTrue(isDisplayed(oxoHomePagePO.Germany_drpdwn));
		assertTrue(isDisplayed(oxoHomePagePO.Japan_drpdwn));
		
	}

	@When("^user clicks on country any country in the dropdown$")
	public void user_clicks_on_country_any_country_in_the_dropdown() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.UK_drpdwn));
		
	}

	@Then("^verify the user is redirected to the selected country$")
	public void verify_the_user_is_redirected_to_the_selected_country() throws Throwable {
		
		assertFalse(isDisplayed(oxoHomePagePO.signIn_Lnk));
	}
	
	@When("^User clicks on Terms Of Use$")
	public void user_clicks_on_Terms_Of_Use() throws Throwable {
		clickOnLink(oxoHomePagePO.termsOfUse_Lnk);
		
	}
	
	@When("^User clicks on privacy policy$")
	public void user_clicks_on_privacy_policy() throws Throwable {
		clickOnLink(oxoHomePagePO.privacyPolicy_Lnk);
		
	}
	
	@When("^User clicks on links Help$")
	public void user_clicks_on_links_Help() throws Throwable {
		clickOnLink(oxoHomePagePO.privacyPolicy_Lnk);
	    
	    
	}

	@When("^User clicks on Contact Us$")
	public void user_clicks_on_Contact_Us() throws Throwable {
		clickOnLink(oxoHomePagePO.contactUS_Lnk);	    
	}

	@Then("^User clicks on FAQ$")
	public void user_clicks_on_FAQ() throws Throwable {
		clickOnLink(oxoHomePagePO.faq_Lnk);
	     
	}

	@Then("^User clicks on Store Locator$")
	public void user_clicks_on_Store_Locator() throws Throwable {
		clickOnLink(oxoHomePagePO.storeLoc_Lnk);
	    
	}

	@Then("^User clicks on Product Registration$")
	public void user_clicks_on_Product_Registration() throws Throwable {
		clickOnLink(oxoHomePagePO.prdReg_Lnk);
	       
	}

	@Then("^User clicks on Voluntary Recall$")
	public void user_clicks_on_Voluntary_Recall() throws Throwable {
		clickOnLink(oxoHomePagePO.volRecal_Lnk);  
	    
	}

	@Then("^User clicks on Privacy Policy$")
	public void user_clicks_on_Privacy_Policy() throws Throwable {
		clickOnLink(oxoHomePagePO.privacyPolicy_Lnk2);
	       
	}

	@Then("^User clicks on Terms & Conditions$")
	public void user_clicks_on_Terms_Conditions() throws Throwable {
		clickOnLink(oxoHomePagePO.termsOfUse_Lnk2);
	  	    
	}

	@Then("^User clicks on Blogger Outreach$")
	public void user_clicks_on_Blogger_Outreach() throws Throwable {
		clickOnLink(oxoHomePagePO.BlogOutreach_Lnk);
	       
	}
	
	@When("^User clicks on Track order$")
	public void user_clicks_on_Track_order() throws Throwable {
		clickOnLink(oxoHomePagePO.TrackOrder_Lnk);
		
	}

	@Then("^User clicks on Shipping iformation$")
	public void user_clicks_on_Shipping_iformation() throws Throwable {
		clickOnLink(oxoHomePagePO.ShippInfo_Lnk);
	}

	@Then("^User clicks on Better Guarantee$")
	public void user_clicks_on_Better_Guarantee() throws Throwable {
		clickOnLink(oxoHomePagePO.BetterGaurantee_Lnk);
	}
	
	@When("^User clicks on Good Tips Blog2$")
	public void user_clicks_on_Good_Tips_Blog2() throws Throwable {
		clickOnLink(oxoHomePagePO.goodTipsBlog_Lnk);
		
	}

	@Then("^User clicks on Investor Submission$")
	public void user_clicks_on_Investor_Submission() throws Throwable {
		clickOnLink(oxoHomePagePO.investorSubmission_Lnk);
		
	}

	@Then("^User clicks on Careers$")
	public void user_clicks_on_Careers() throws Throwable {
		clickOnLink(oxoHomePagePO.careers_Lnk);
		
	}

	@Then("^User clicks on Investor Relations$")
	public void user_clicks_on_Investor_Relations() throws Throwable {
		clickOnLink(oxoHomePagePO.investRel_Lnk);
		
	}

}
