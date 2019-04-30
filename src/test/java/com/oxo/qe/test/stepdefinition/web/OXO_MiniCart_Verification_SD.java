package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_MiniCart_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_MiniCart_Verification_SD extends CommonActionHelper {
	
	OXO_MiniCart_PO oxoMiniCartPO = PageFactory.initElements(driver, OXO_MiniCart_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_HomePage_Verification_SD.class);

	@Then("^Verify below Sub/Main Module of minicart Page$")
	public void verify_below_Sub_Main_Module_of_minicart_Page(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {
				String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// HomePage
				// ===============================================================================
				if (currentElement.equalsIgnoreCase("minicartRemove_Btn"))
					assertTrue(isDisplayed(oxoMiniCartPO.minicartRemove_Btn));
				else if (currentElement.equalsIgnoreCase("minicartModalRemove_Btn"))
					assertTrue(isDisplayed(oxoMiniCartPO.minicartModalRemove_Btn));
				else if (currentElement.equalsIgnoreCase("minicartModalCancel_Btn"))
					assertTrue(isDisplayed(oxoMiniCartPO.minicartModalCancel_Btn));
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
