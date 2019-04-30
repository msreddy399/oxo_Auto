package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_HomePage_PO;
import com.oxo.qe.test.pageobject.OXO_MiniCart_PO;
import com.oxo.qe.test.pageobject.OXO_MyAccount_PO;
import com.oxo.qe.test.pageobject.OXO_PDP_PO;
import com.oxo.qe.test.pageobject.OXO_PLP_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OXO_PLP_SD extends CommonActionHelper {
	
	OXO_HomePage_PO oxoHomePagePO = PageFactory.initElements(driver, OXO_HomePage_PO.class);
	OXO_PLP_PO oxoPLPPO = PageFactory.initElements(driver, OXO_PLP_PO.class);
	OXO_PDP_PO oxoPDPPO = PageFactory.initElements(driver, OXO_PDP_PO.class);
	OXO_MyAccount_PO oxoMyAccountPO = PageFactory.initElements(driver, OXO_MyAccount_PO.class);
	OXO_MiniCart_PO oxoMiniCartPO = PageFactory.initElements(driver, OXO_MiniCart_PO.class);
	Actions action = new Actions(driver);
	
	@Given("^user selects a sub category$")
	public void user_selects_a_sub_category() throws Throwable {
		Thread.sleep(5000);
		oxoHomePagePO.L2_Cat.click();
	}
	
	@When("^user selects a product and clicks on add to cart$")
	public void user_selects_a_product_and_clicks_on_add_to_cart() throws Throwable {
		
		//scrollPageToWebElement(oxoPLPPO.PlpProduct_Img);
		
		waitForElement(oxoPLPPO.plpAddToCart_Btn);
		action.moveToElement(oxoPLPPO.plpAddToCart_Btn).build().perform();
		oxoPLPPO.plpAddToCart_Btn.click();
		
	}

	@Then("^verify the item is add to cart$")
	public void verify_the_item_is_add_to_cart() throws Throwable {
		
		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(wishlistLocator.getminiCart_Icon()).build().perform();
		 * wishlistLocator.getminiCartViewCart_Btn().click();
		 * wishlistLocator.getcartItem_Img().isDisplayed();
		 * wishlistLocator.getcartItemRemove_Btn().click();
		 */
		Thread.sleep(3000);
		action.moveToElement(oxoPDPPO.miniCart_Icon).build().perform();
		
		
	}
	
	@Given("^user enters email \"(.*?)\"$")
	public void user_enters_email(String arg1) throws Throwable {
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//driver.executeAsyncScript(script, args)
		//js.executeScript(script, args);
		waitForElement(oxoMyAccountPO.signIn_Txt);
		setInputText(oxoMyAccountPO.signIn_Txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Given("^user enters password \"(.*?)\"$")
	public void user_enters_password(String arg1) throws Throwable {
		waitForElement(oxoMyAccountPO.Password_Txt);
		setInputText(oxoMyAccountPO.Password_Txt, webPropHelper.getTestDataProperty(arg1));
		
	}
	
	
	@Given("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		waitForElement(oxoMyAccountPO.login_Btn);
		assertTrue(clickOnButton(oxoMyAccountPO.login_Btn));
		
	}
	
	@When("^user selects a product and clicks on wishlist icon$")
	public void user_selects_a_product_and_clicks_on_wishlist_icon() throws Throwable {
		//assertTrue(clickOnButton(oxoPLPPO.plpWishlist_Icon));
		waitForElement(oxoPLPPO.plpWishlist_Icon);
		action.moveToElement(oxoPLPPO.plpWishlist_Icon).build().perform();
		oxoPLPPO.plpWishlist_Icon.click();
		
	}

	@Then("^verify the item is add to Wish list$")
	public void verify_the_item_is_add_to_Wish_list() throws Throwable {
				
		
	}
	
	@When("^user enter email \"(.*?)\"$")
	public void user_enter_email(String arg1) throws Throwable {
		setInputText(oxoMyAccountPO.signIn2_Txt, webPropHelper.getTestDataProperty(arg1));
		
	}

	@When("^user enter password \"(.*?)\"$")
	public void user_enter_password(String arg1) throws Throwable {
		setInputText(oxoMyAccountPO.Password2_Txt, webPropHelper.getTestDataProperty(arg1));
		
	}

	@When("^Clicks on Sign In button$")
	public void clicks_on_Sign_In_button() throws Throwable {
		waitForElement(oxoMyAccountPO.Sign_Btn);
		assertTrue(clickOnButton(oxoMyAccountPO.Sign_Btn));
		Thread.sleep(9000);
		
	}
	
	@When("^user clicks on wish list links$")
	public void user_clicks_on_wish_list_links() throws Throwable {
		waitForElement(oxoPLPPO.plpWishList_Lnk);
		assertTrue(clickOnButton(oxoPLPPO.plpWishList_Lnk));
		
	}
	
	@When("^user clicks on breadcrumb link in plp$")
	public void user_clicks_on_breadcrumb_link_in_plp() throws Throwable {
		waitForElement(oxoPLPPO.plpBreadcrumbcat_Lnk);
		assertTrue(clickOnButton(oxoPLPPO.plpBreadcrumbcat_Lnk));
		
	}
	
	@When("^user find the shop cart link and clicks on it$")
	public void user_find_the_shop_cart_link_and_clicks_on_it() throws Throwable {
		waitForElement(oxoPLPPO.plpShopCart_Lnk);
		assertTrue(clickOnButton(oxoPLPPO.plpShopCart_Lnk));
	}
	
	@When("^user selects the plp sorting$")
	public void user_selects_the_plp_sorting() throws Throwable {
		waitForElement(oxoPLPPO.plpSort_Lnk);
		assertTrue(clickOnButton(oxoPLPPO.plpSort_Lnk));
		
	}
	
	@When("^user clicks on clear all link$")
	public void user_clicks_on_clear_all_link() throws Throwable {
		waitForElement(oxoPLPPO.plpSortClr_Lnk);
		assertTrue(clickOnButton(oxoPLPPO.plpSortClr_Lnk));
		
	}
	
	@When("^user enters the product name in PLP search \"(.*?)\"$")
	public void user_enters_the_product_name_in_PLP_search(String arg1) throws Throwable {
		waitForElement(oxoPLPPO.plpFooterSearck_Txt);
		setInputText(oxoPLPPO.plpFooterSearck_Txt, webPropHelper.getTestDataProperty(arg1));
		assertTrue(clickOnButton(oxoPLPPO.plpFooterSearck_Icon));
		
		
	}



}
