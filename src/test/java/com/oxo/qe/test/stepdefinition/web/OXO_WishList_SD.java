package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_Cart_PO;
import com.oxo.qe.test.pageobject.OXO_PLP_PO;
import com.oxo.qe.test.pageobject.OXO_WishList_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OXO_WishList_SD extends CommonActionHelper {
	
	OXO_WishList_PO oxoWishPo = PageFactory.initElements(driver, OXO_WishList_PO.class);
	OXO_Cart_PO oxoCartPo = PageFactory.initElements(driver, OXO_Cart_PO.class);
	OXO_PLP_PO oxoPLPPO = PageFactory.initElements(driver, OXO_PLP_PO.class);
	
	@When("^user remove item from wishlist$")
	public void user_remove_item_from_wishlist() throws Throwable {
		waitForElement(oxoWishPo.wishListRemove_Btn);
		assertTrue(clickOnButton(oxoWishPo.wishListRemove_Btn)); 
	}

	@Then("^verify the item is removed succesfully$")
	public void verify_the_item_is_removed_succesfully() throws Throwable {
		
	}
	
	@When("^user clicks on add to cart button$")
	public void user_clicks_on_add_to_cart_button() throws Throwable {
		waitForElement(oxoWishPo.wishListAddToCart_Btn);
		assertTrue(clickOnButton(oxoWishPo.wishListAddToCart_Btn)); 
		
	}
	
	@When("^user clicks on add all to cart button$")
	public void user_clicks_on_add_all_to_cart_button() throws Throwable {
		waitForElement(oxoWishPo.wishListAddAllToCart_Btn);
		assertTrue(clickOnButton(oxoWishPo.wishListAddAllToCart_Btn));
	}
	
	@When("^user clicks on move to wishlist link in cart page$")
	public void user_clicks_on_move_to_wishlist_link_in_cart_page() throws Throwable {
		waitForElement(oxoCartPo.cartWishlist_Lnk);
		assertTrue(clickOnButton(oxoCartPo.cartWishlist_Lnk));
		
	}

	@Then("^verify the item is moved to wish list page$")
	public void verify_the_item_is_moved_to_wish_list_page() throws Throwable {
		waitForElement(oxoPLPPO.plpWishList_Lnk);
		assertTrue(clickOnButton(oxoPLPPO.plpWishList_Lnk));
		waitForElement(oxoWishPo.wishListRemove_Btn);
		assertTrue(clickOnButton(oxoWishPo.wishListRemove_Btn)); 
		
		
	}

}
