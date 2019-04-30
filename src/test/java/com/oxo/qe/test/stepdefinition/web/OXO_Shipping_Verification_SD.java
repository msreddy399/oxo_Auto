package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_Shipping_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_Shipping_Verification_SD extends CommonActionHelper {

	OXO_Shipping_PO oxoShipPo = PageFactory.initElements(driver, OXO_Shipping_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_Shipping_Verification_SD.class);

	@Then("^Verify below Sub/Main Module of Shipping Page$")
	public void verify_below_Sub_Main_Module_of_Shipping_Page(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {

				String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// HomePage
				// ===============================================================================

				if (currentElement.equalsIgnoreCase("shippFirstName_Txt"))
					assertTrue(isDisplayed(oxoShipPo.shippFirstName_Txt));
				else if (currentElement.equalsIgnoreCase("shippLastName_Txt"))
					assertTrue(isDisplayed(oxoShipPo.shippLastName_Txt));
				else if(currentElement.equalsIgnoreCase("shippCompany_Txt"))
					assertTrue(isDisplayed(oxoShipPo.shippCompany_Txt));
				else if(currentElement.equalsIgnoreCase("shippStreetAddress_Txt"))
					assertTrue(isDisplayed(oxoShipPo.shippStreetAddress_Txt));
				else if(currentElement.equalsIgnoreCase("shippState_Dropdown"))
					assertTrue(isDisplayed(oxoShipPo.shippState_Dropdown));
				else if(currentElement.equalsIgnoreCase("shippZipCode_Txt"))
					assertTrue(isDisplayed(oxoShipPo.shippZipCode_Txt));
				else if(currentElement.equalsIgnoreCase("shippCountry_Txt"))
					assertTrue(isDisplayed(oxoShipPo.shippCountry_Txt));
				else if(currentElement.equalsIgnoreCase("shippPhoneNum_Txt"))
					assertTrue(isDisplayed(oxoShipPo.shippPhoneNum_Txt));
				else if(currentElement.equalsIgnoreCase("shippEmail_Txt"))
					assertTrue(isDisplayed(oxoShipPo.shippEmail_Txt));
				else if (currentElement.equalsIgnoreCase("shippPass_Txt"))
					assertTrue(isDisplayed(oxoShipPo.shippPass_Txt));
				else if (currentElement.equalsIgnoreCase("shippingShippMethod_RadioBtn"))
					assertTrue(isDisplayed(oxoShipPo.shippingShippMethod_RadioBtn));
				else if (currentElement.equalsIgnoreCase("shippingProceedPayment_Btn"))
					assertTrue(isDisplayed(oxoShipPo.shippingProceedPayment_Btn));
				else if (currentElement.equalsIgnoreCase("shippCartItem_Img"))
					assertTrue(isDisplayed(oxoShipPo.shippCartItem_Img));
				else if (currentElement.equalsIgnoreCase("shippAddrValidation_Btn"))
					assertTrue(isDisplayed(oxoShipPo.shippAddrValidation_Btn));
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