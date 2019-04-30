package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OXO_MyAccount_SD extends CommonActionHelper {

	OXO_MyAccount_PO oxoMyAccountPO = PageFactory.initElements(driver, OXO_MyAccount_PO.class);

	@When("^user navigates to my account from dropdown$")
	public void user_navigates_to_my_account_from_dropdown() throws Throwable {

		//Thread.sleep(9000);
		waitForElement(oxoMyAccountPO.sign_drpdwn);
		oxoMyAccountPO.sign_drpdwn.click();
		waitForElement(oxoMyAccountPO.myAccount_Lnk);
		oxoMyAccountPO.myAccount_Lnk.click();
	}

	@Given("^verify user logged in sucessfully$")
	public void verify_user_logged_in_sucessfully() throws Throwable {

		Thread.sleep(9000);
		oxoMyAccountPO.sign_drpdwn.click();
		//assertTrue(isDisplayed(oxoMyAccountPO.signOut_Lnk));
	}

	@When("^User click on sign out$")
	public void user_click_on_sign_out() throws Throwable {

		oxoMyAccountPO.signOut_Lnk.click();
	}
	
	@Given("^clicks on address book$")
	public void clicks_on_address_book() throws Throwable {
		waitForElement(oxoMyAccountPO.myAddrBookDash_Lnk);
		assertTrue(clickOnButton(oxoMyAccountPO.myAddrBookDash_Lnk));
		
	}

	@Given("^clicks on add an address$")
	public void clicks_on_add_an_address() throws Throwable {
		waitForElement(oxoMyAccountPO.addAnAddress_Btn);
		assertTrue(clickOnButton(oxoMyAccountPO.addAnAddress_Btn));
		
	}

	@Given("^user enters address firstname \"(.*?)\"$")
	public void user_enters_address_firstname(String arg1) throws Throwable {
		waitForElement(oxoMyAccountPO.firstName_Txt);
		setInputText(oxoMyAccountPO.firstName_Txt, webPropHelper.getTestDataProperty(arg1));
		
	}

	@Given("^user enters address lastname \"(.*?)\"$")
	public void user_enters_address_lastname(String arg1) throws Throwable {
		waitForElement(oxoMyAccountPO.lastName_Txt);
		setInputText(oxoMyAccountPO.lastName_Txt, webPropHelper.getTestDataProperty(arg1));
		
	}

	@Given("^user enters address phonenumber \"(.*?)\"$")
	public void user_enters_address_phonenumber(String arg1) throws Throwable {
		waitForElement(oxoMyAccountPO.phoneNum_Txt);
		setInputText(oxoMyAccountPO.phoneNum_Txt, webPropHelper.getTestDataProperty(arg1));
		
	}

	@Given("^user enters address street address \"(.*?)\"$")
	public void user_enters_address_street_address(String arg1) throws Throwable {
		waitForElement(oxoMyAccountPO.street_Txt);
		setInputText(oxoMyAccountPO.street_Txt, webPropHelper.getTestDataProperty(arg1));
		
	}

	@Given("^user enters address city \"(.*?)\"$")
	public void user_enters_address_city(String arg1) throws Throwable {
		waitForElement(oxoMyAccountPO.city_Txt);
		setInputText(oxoMyAccountPO.city_Txt, webPropHelper.getTestDataProperty(arg1));
		tabInputBox(oxoMyAccountPO.city_Txt);
		
	}
	
	@When("^user clicks on save address$")
	public void user_clicks_on_save_address() throws Throwable {
		waitForElement(oxoMyAccountPO.saveAddr_Btn);
		assertTrue(clickOnButton(oxoMyAccountPO.saveAddr_Btn));
		waitForElement(oxoMyAccountPO.addNewAddress_Btn);
		
		
	}
	
	@Given("^clicks on delete in address book$")
	public void clicks_on_delete_in_address_book() throws Throwable {
		assertTrue(clickOnButton(oxoMyAccountPO.addrDelete_Lnk));
		assertTrue(clickOnButton(oxoMyAccountPO.addrDelete_Btn));
	}
	
	@Given("^clicks on my information in address book$")
	public void clicks_on_my_information_in_address_book() throws Throwable {
		assertTrue(clickOnButton(oxoMyAccountPO.myInfoDash_Lnk));
	}
	
	@Given("^clicks on my orders$")
	public void clicks_on_my_orders() throws Throwable {
		assertTrue(clickOnButton(oxoMyAccountPO.myOrdrDash_Lnk));
	}




}
