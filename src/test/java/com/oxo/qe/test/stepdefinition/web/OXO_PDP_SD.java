package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_HomePage_PO;
import com.oxo.qe.test.pageobject.OXO_PDP_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OXO_PDP_SD extends CommonActionHelper {
	
	OXO_HomePage_PO oxoHomePagePO = PageFactory.initElements(driver, OXO_HomePage_PO.class);
	OXO_PDP_PO oxoPDPPo = PageFactory.initElements(driver, OXO_PDP_PO.class);
	
	@When("^User enters the product name \"(.*?)\"$")
	public void user_enters_the_product_name(String arg1) throws Throwable {
		waitForElement(oxoHomePagePO.Search_Placeholder_Txt);
		setInputText(oxoHomePagePO.Search_Placeholder_Txt, webPropHelper.getTestDataProperty(arg1));
		
	}

	@When("^selects an item from search result$")
	public void selects_an_item_from_search_result() throws Throwable {
		waitForElement(oxoHomePagePO.searchprd_Img);
		assertTrue(clickOnButton(oxoHomePagePO.searchprd_Img)); 
		
	}
	
	@When("^clicks on add to cart button$")
	public void clicks_on_add_to_cart_button() throws Throwable {
		
		assertTrue(clickOnButton(oxoPDPPo.PdpAddToCart_Btn));
		//waitForElement(oxoPDPPo.PdpAddToCart_Btn);
		//oxoPDPPo.PdpAddToCart_Btn.click();
		Thread.sleep(5000);
		
	}
	
	@When("^clicks on add to wish list icon in PDP$")
	public void clicks_on_add_to_wish_list_icon_in_PDP() throws Throwable {
		waitForElement(oxoPDPPo.pdpWishList_Icon);
		assertTrue(clickOnButton(oxoPDPPo.pdpWishList_Icon)); 
		
	}
	
	@When("^user clicks on breadcrumb link in pdp$")
	public void user_clicks_on_breadcrumb_link_in_pdp() throws Throwable {
		assertTrue(clickOnButton(oxoPDPPo.pdpBreadcrumbcat_Lnk));
		
	}
	
	@When("^user clicks on update quantity in PDP$")
	public void user_clicks_on_update_quantity_in_PDP() throws Throwable {
		waitForElement(oxoPDPPo.pdpQtyUpdate_Icon);
		selectByValue(oxoPDPPo.pdpQtyUpdate_Icon, "2");
	}

	@Then("^verify quantity is updated$")
	public void verify_quantity_is_updated() throws Throwable {
		selectByValue(oxoPDPPo.pdpQtyUpdate_Icon, "2");		
	}
	
	@When("^user clicks on product details link in PDP$")
	public void user_clicks_on_product_details_link_in_PDP() throws Throwable {
		waitForElement(oxoPDPPo.pdpProductDetails_Lnk);
		assertTrue(clickOnButton(oxoPDPPo.pdpProductDetails_Lnk));
	}

	
	
	


}
