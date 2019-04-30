package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_MiniCart_PO;
import com.oxo.qe.test.pageobject.OXO_PDP_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OXO_Minicart_SD extends CommonActionHelper {
	
	OXO_MiniCart_PO oxoMiniCartPO = PageFactory.initElements(driver, OXO_MiniCart_PO.class);
	OXO_PDP_PO oxoPDPPO = PageFactory.initElements(driver, OXO_PDP_PO.class);
	Actions action = new Actions(driver);
	
	@When("^user clicks on remove item link$")
	public void user_clicks_on_remove_item_link() throws Throwable {
		
		waitForElement(oxoMiniCartPO.minicartRemove_Btn);
		assertTrue(clickOnButton(oxoMiniCartPO.minicartRemove_Btn));
		waitForElement(oxoMiniCartPO.minicartModalRemove_Btn);
		assertTrue(clickOnButton(oxoMiniCartPO.minicartModalRemove_Btn)); 
	}
	
	@Given("^user click on remove item link$")
	public void user_click_on_remove_item_link() throws Throwable {
		waitForElement(oxoMiniCartPO.minicartRemove_Btn);
		assertTrue(clickOnButton(oxoMiniCartPO.minicartRemove_Btn));
	}

	@Then("^verify the item is removed from the mini cart$")
	public void verify_the_item_is_removed_from_the_mini_cart() throws Throwable {
		
	}
	
	@When("^user cancel removing item from mini cart$")
	public void user_cancel_removing_item_from_mini_cart() throws Throwable {
		waitForElement(oxoMiniCartPO.minicartModalCancel_Btn);
		assertTrue(clickOnButton(oxoMiniCartPO.minicartModalCancel_Btn)); 
		
	}

	@Then("^verify item is avialable in mini cart$")
	public void verify_item_is_avialable_in_mini_cart() throws Throwable {
		//action.moveToElement(oxoPDPPO.miniCart_Icon).build().perform();
		
	}

}
