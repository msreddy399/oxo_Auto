package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_Cart_PO;
import com.oxo.qe.test.pageobject.OXO_PDP_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OXO_Cart_SD extends CommonActionHelper {
	
	Actions action = new Actions(driver);
	OXO_PDP_PO oxoPDPPO = PageFactory.initElements(driver, OXO_PDP_PO.class);
	OXO_Cart_PO oxoCartPO = PageFactory.initElements(driver, OXO_Cart_PO.class);
	
	@Given("^user navigates to cart page$")
	public void user_navigates_to_cart_page() throws Throwable {
		
		//Thread.sleep(3000);
        waitForElement(oxoPDPPO.miniCart_Icon);
		action.moveToElement(oxoPDPPO.miniCart_Icon).build().perform();
		assertTrue(clickOnButton(oxoPDPPO.miniCartViewCart_Btn)); 
		
	}

	@When("^user clicks on continue shopping link in cart page$")
	public void user_clicks_on_continue_shopping_link_in_cart_page() throws Throwable {
		 waitForElement(oxoCartPO.cartContShopping_Lnk);
		assertTrue(clickOnButton(oxoCartPO.cartContShopping_Lnk));
		
	}
	
	@When("^user clicks on product image$")
	public void user_clicks_on_product_image() throws Throwable {
		waitForElement(oxoCartPO.cartPrd_Img);
		assertTrue(clickOnButton(oxoCartPO.cartPrd_Img));
		
	}

	@When("^user clicks on remove item from cart$")
	public void user_clicks_on_remove_item_from_cart() throws Throwable {
		waitForElement(oxoCartPO.cartRemoveItem_Lnk);
		assertTrue(clickOnButton(oxoCartPO.cartRemoveItem_Lnk));
		
	}
	
	@When("^user clicks on checkout button$")
	public void user_clicks_on_chec_bukouttton() throws Throwable {
		waitForElement(oxoCartPO.cartCheckout_Btn);
		assertTrue(clickOnButton(oxoCartPO.cartCheckout_Btn));
		Thread.sleep(2000);
		
	}
	
	@When("^user clicks on update quantity in cart page$")
	public void user_clicks_on_update_quantity_in_cart_page() throws Throwable {
		waitForElement(oxoCartPO.cartQty_drpdwn);
		selectByValue(oxoCartPO.cartQty_drpdwn, "2");
		Thread.sleep(2000);
	}


	



}
