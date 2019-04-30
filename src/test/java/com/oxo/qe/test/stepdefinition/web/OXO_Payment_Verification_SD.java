package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_Payment_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_Payment_Verification_SD extends CommonActionHelper {

	OXO_Payment_PO oxoPayPO = PageFactory.initElements(driver, OXO_Payment_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_Payment_Verification_SD.class);

	@Then("^Verify below Sub/Main Module of Payment Page$")
	public void verify_below_Sub_Main_Module_of_Payment_Page(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {

				String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// HomePage
				// ===============================================================================

				if (currentElement.equalsIgnoreCase("paymentPageShipEdit_Lnk"))
					assertTrue(isDisplayed(oxoPayPO.paymentPageShipEdit_Lnk));
				else if (currentElement.equalsIgnoreCase("billingPromoCode_Txt"))
					assertTrue(isDisplayed(oxoPayPO.billingPromoCode_Txt));
				else if (currentElement.equalsIgnoreCase("billingPromoCodeApply_Btn"))
					assertTrue(isDisplayed(oxoPayPO.billingPromoCodeApply_Btn));
				else if (currentElement.equalsIgnoreCase("billingPaypal_RdBtn"))
					assertTrue(isDisplayed(oxoPayPO.billingPaypal_RdBtn));
				else if (currentElement.equalsIgnoreCase("billingCredit_RdBtn"))
					assertTrue(isDisplayed(oxoPayPO.billingCredit_RdBtn));
				else if (currentElement.equalsIgnoreCase("billingShippingAddressSame_Chkbx"))
					assertTrue(isDisplayed(oxoPayPO.billingShippingAddressSame_Chkbx));
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
