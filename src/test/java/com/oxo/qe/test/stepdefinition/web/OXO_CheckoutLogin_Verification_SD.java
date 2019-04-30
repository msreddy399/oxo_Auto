package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_CheckoutLogin_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_CheckoutLogin_Verification_SD extends CommonActionHelper {

	OXO_CheckoutLogin_PO oxoCheckPo = PageFactory.initElements(driver, OXO_CheckoutLogin_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_Cart_Verification_SD.class);

	@Then("^Verify below Sub/Main Module of OXO_CheckoutLogin Page$")
	public void verify_below_Sub_Main_Module_of_OXO_CheckoutLogin_Page(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {

				String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// CheckoutLogin Page
				// ===============================================================================
				if (currentElement.equalsIgnoreCase("checkoutLoginEmail_Txt"))
					assertTrue(isDisplayed(oxoCheckPo.checkoutLoginEmail_Txt));
				else if (currentElement.equalsIgnoreCase("checkoutLoginPass_Txt"))
					assertTrue(isDisplayed(oxoCheckPo.checkoutLoginPass_Txt));
				else if (currentElement.equalsIgnoreCase("checkoutLoginSignIn_Btn"))
					assertTrue(isDisplayed(oxoCheckPo.checkoutLoginSignIn_Btn));
				else if (currentElement.equalsIgnoreCase("checkoutLoginGuest_Btn"))
					assertTrue(isDisplayed(oxoCheckPo.checkoutLoginGuest_Btn));
				else {
					logger.error("Element <" + currentElement + "> is not found in the SD list.");
					throw new NullArgumentException("Element <" + currentElement + "> is not found in the SD list.");
				}

			}

		} catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
	}

}