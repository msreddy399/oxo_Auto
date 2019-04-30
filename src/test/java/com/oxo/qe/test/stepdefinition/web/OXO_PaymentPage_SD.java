package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_Payment_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OXO_PaymentPage_SD extends CommonActionHelper {
	
	OXO_Payment_PO oxoPaymentPO = PageFactory.initElements(driver, OXO_Payment_PO.class);
	
	@When("^user clicks on edit in payment page$")
	public void user_clicks_on_edit_in_payment_page() throws Throwable {
		assertTrue(isClickable(oxoPaymentPO.paymentPageShipEdit_Lnk));
		//isClickable(oxoPaymentPO.paymentPageShipEdit_Lnk);
		clickOnButton(oxoPaymentPO.paymentPageShipEdit_Lnk);
	}
	
	@Given("^user clicks on credit card radio button$")
	public void user_clicks_on_credit_card_radio_button() throws Throwable {
		//oxoPaymentPO.billingCredit_RdBtn.click();
		clickOnRadioButton(oxoPaymentPO.billingCredit_RdBtn);
	    
	   
	}

	@Given("^user selects credit card type$")
	public void user_selects_credit_card_type() throws Throwable {
		driver.switchTo().frame("paymetric_xisecure_frame");
		selectByValue(oxoPaymentPO.creditCard_Dropdown, "vi");
		
	    
	   
	}

	@Given("^user enter credit card number \"(.*?)\"$")
	public void user_enter_credit_card_number(String arg1) throws Throwable {
		setInputText(oxoPaymentPO.creditCard_Txt, webPropHelper.getTestDataProperty(arg1));
	    
	   
	}

	@Given("^user enter CVV number \"(.*?)\"$")
	public void user_enter_CVV_number(String arg1) throws Throwable {
		setInputText(oxoPaymentPO.creditCardCvv_Txt, webPropHelper.getTestDataProperty(arg1));
	    
	   
	}

	@Given("^user selects month and year$")
	public void user_selects_month_and_year() throws Throwable {
		selectByValue(oxoPaymentPO.creditCardExpMon_Dropdown, "1");
		selectByValue(oxoPaymentPO.creditCardExpYear_Dropdown, "2021");
	   
	}

	@When("^user clicks on place order button$")
	public void user_clicks_on_place_order_button() throws Throwable {
		  driver.switchTo().defaultContent();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,400)");
		  js.executeScript("arguments[0].click();", oxoPaymentPO.billingPlaceOrder_Btn); 
	    
	   
	}

	


}
