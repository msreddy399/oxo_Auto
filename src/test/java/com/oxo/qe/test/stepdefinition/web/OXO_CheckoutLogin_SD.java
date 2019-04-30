package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_CheckoutLogin_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OXO_CheckoutLogin_SD extends CommonActionHelper {
	
	OXO_CheckoutLogin_PO oxoCheckLoginPO = PageFactory.initElements(driver, OXO_CheckoutLogin_PO.class);

	
	@Given("^user enters email in checkout login page \"(.*?)\"$")
	public void user_enters_email_in_checkout_login_page(String arg1) throws Throwable {
		waitForElement(oxoCheckLoginPO.checkoutLoginEmail_Txt);
		setInputText(oxoCheckLoginPO.checkoutLoginEmail_Txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Given("^user enters password in checkout login page \"(.*?)\"$")
	public void user_enters_password_in_checkout_login_page(String arg1) throws Throwable {
		waitForElement(oxoCheckLoginPO.checkoutLoginPass_Txt);
		setInputText(oxoCheckLoginPO.checkoutLoginPass_Txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Given("^Clicks on sign button$")
	public void clicks_on_sign_button() throws Throwable {
		waitForElement(oxoCheckLoginPO.checkoutLoginSignIn_Btn);
		assertTrue(clickOnButton(oxoCheckLoginPO.checkoutLoginSignIn_Btn));
	}
	
	@When("^user clicks on close icon in checkout login page$")
	public void user_clicks_on_close_icon_in_checkout_login_page() throws Throwable {
		waitForElement(oxoCheckLoginPO.checkoutLoginClose_Icon);
		assertTrue(clickOnButton(oxoCheckLoginPO.checkoutLoginClose_Icon));
		
	}

}