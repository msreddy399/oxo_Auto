package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_Order_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class OXO_OrderConfirmation_Verification_SD extends CommonActionHelper {
	
	OXO_Order_PO orderPO = PageFactory.initElements(driver, OXO_Order_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_OrderConfirmation_Verification_SD.class);
	
	@Then("^Verify below Sub/Main Module of OrderConfirmation Page$")
	public void verify_below_Sub_Main_Module_of_OrderConfirmation_Page(DataTable arg1) throws Throwable {
	    
		try {
			List<List<String>> elements = arg1.raw();
			for(int i=1; i<elements.size(); i++) {
				
				String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// HomePage
				// ===============================================================================

				if (currentElement.equalsIgnoreCase("orderItems_Lnk"))
					assertTrue(isDisplayed(orderPO.orderItems_Lnk));
				else if (currentElement.equalsIgnoreCase("orderShipp_Lnk"))
					assertTrue(isDisplayed(orderPO.orderShipp_Lnk));
				else if (currentElement.equalsIgnoreCase("orderPayment_Lnk"))
					assertTrue(isDisplayed(orderPO.orderPayment_Lnk));
				
			}		
		  
		}catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
		    
		}

	}
