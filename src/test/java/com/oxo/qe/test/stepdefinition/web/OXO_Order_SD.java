package com.oxo.qe.test.stepdefinition.web;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_Order_PO;

import cucumber.api.java.en.Then;

public class OXO_Order_SD extends CommonActionHelper{
	
	private static final Logger logger = Logger.getLogger(OXO_Cart_Verification_SD.class);
	 String OrderNumber;
	
	OXO_Order_PO oxoOrderPo =PageFactory.initElements(driver, OXO_Order_PO.class);
	
	
	@Then("^capature the order number$")
	public void capature_the_order_number() throws Throwable {
		OrderNumber = waitForElement(oxoOrderPo.orderNum_Txt).getText();
		logger.info(" &&&&&&order number&&&&& " + OrderNumber);
		
	}
	
	@Then("^capatures the order number$")
	public void capatures_the_order_number() throws Throwable {
		OrderNumber = waitForElement(oxoOrderPo.orderNum2_Txt).getText();
		logger.info(" &&&&&&order number&&&&& " + OrderNumber);
		
	}

}
