package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_PDP_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_PDP_Verification_SD extends CommonActionHelper {

	OXO_PDP_PO oxoPDPPo = PageFactory.initElements(driver, OXO_PDP_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_Payment_Verification_SD.class);

	@Then("^Verify below Sub/Main Module of PDP Page$")
	public void verify_below_Sub_Main_Module_of_PDP_Page(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {

				String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// HomePage
				// ===============================================================================

				if (currentElement.equalsIgnoreCase("pdpBreadcrumb_Lnk"))
					assertTrue(isDisplayed(oxoPDPPo.pdpBreadcrumb_Lnk));				
				
				  else if (currentElement.equalsIgnoreCase("pdpImgSlider_Img"))
				  assertTrue(isDisplayed(oxoPDPPo.pdpImgSlider_Img));
				  else if (currentElement.equalsIgnoreCase("minicartCheckout_Btn"))
					  assertTrue(isDisplayed(oxoPDPPo.minicartCheckout_Btn));
				  else if (currentElement.equalsIgnoreCase("miniCartViewCart_Btn"))
					  assertTrue(isDisplayed(oxoPDPPo.miniCartViewCart_Btn));
				  else if (currentElement.equalsIgnoreCase("pdpWishList_Icon"))
					  assertTrue(isDisplayed(oxoPDPPo.pdpWishList_Icon));
				  else if (currentElement.equalsIgnoreCase("PdpAddToCart_Btn"))
					  assertTrue(isDisplayed(oxoPDPPo.PdpAddToCart_Btn));
				  else if (currentElement.equalsIgnoreCase("pdpProductName_Txt"))
					  assertTrue(isDisplayed(oxoPDPPo.pdpProductName_Txt));
				  else if (currentElement.equalsIgnoreCase("pdpProductPrice_Txt"))
					  assertTrue(isDisplayed(oxoPDPPo.pdpProductPrice_Txt));
				 
				 
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
