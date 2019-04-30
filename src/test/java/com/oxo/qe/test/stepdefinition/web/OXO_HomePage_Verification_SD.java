package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_HomePage_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_HomePage_Verification_SD extends CommonActionHelper {
	
	OXO_HomePage_PO oxoHomePagePO = PageFactory.initElements(driver, OXO_HomePage_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_HomePage_Verification_SD.class);

	
	@Then("^Verify below Sub/Main Module of HomePage$")
	public void Verify_below_Sub_Main_Module_of_My_Account(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {
				String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// HomePage
				// ===============================================================================
				if (currentElement.equalsIgnoreCase("signIn_Lnk"))
					assertTrue(isDisplayed(oxoHomePagePO.signIn_Lnk));
				else if (currentElement.equalsIgnoreCase("wishList_Lnk"))
					assertTrue(isDisplayed(oxoHomePagePO.wishList_Lnk));
				else if(currentElement.equalsIgnoreCase("Search_Icon"))
					assertTrue(isDisplayed(oxoHomePagePO.Search_Icon));
				else if(currentElement.equalsIgnoreCase("Search_Txt"))
					assertTrue(isDisplayed(oxoHomePagePO.Search_Txt));
				else if(currentElement.equalsIgnoreCase("oxo_Logo"))
					assertTrue(isDisplayed(oxoHomePagePO.oxo_Logo));
				else if(currentElement.equalsIgnoreCase("minicart_Icon"))
					assertTrue(isDisplayed(oxoHomePagePO.minicart_Icon));
				else if(currentElement.equalsIgnoreCase("shippingDetails_Lnk"))
					assertTrue(isDisplayed(oxoHomePagePO.shippingDetails_Lnk));
				/*
				 * else if(currentElement.equalsIgnoreCase("L1_Cat"))
				 * assertTrue(isDisplayed(oxoHomePagePO.L1_Cat));
				 */
				else if(currentElement.equalsIgnoreCase("L2_Cat"))
					assertTrue(isDisplayed(oxoHomePagePO.L2_Cat));
				else if(currentElement.equalsIgnoreCase("instgram_Icon"))
					assertTrue(isDisplayed(oxoHomePagePO.instgram_Icon));
				else if(currentElement.equalsIgnoreCase("facebook_Icon"))
					assertTrue(isDisplayed(oxoHomePagePO.facebook_Icon));
				else if(currentElement.equalsIgnoreCase("pinterest_Icon"))
					assertTrue(isDisplayed(oxoHomePagePO.pinterest_Icon));
				else if(currentElement.equalsIgnoreCase("youtube_Icon"))
					assertTrue(isDisplayed(oxoHomePagePO.youtube_Icon));
				else if(currentElement.equalsIgnoreCase("twitter_Icon"))
					assertTrue(isDisplayed(oxoHomePagePO.twitter_Icon));
				else if(currentElement.equalsIgnoreCase("BackToHomePage_Btn"))
					assertTrue(isDisplayed(oxoHomePagePO.BackToHomePage_Btn));
				else if(currentElement.equalsIgnoreCase("UK_drpdwn"))
					assertTrue(isDisplayed(oxoHomePagePO.UK_drpdwn));
				else if(currentElement.equalsIgnoreCase("Germany_drpdwn"))
					assertTrue(isDisplayed(oxoHomePagePO.Germany_drpdwn));
				else if(currentElement.equalsIgnoreCase("Japan_drpdwn"))
					assertTrue(isDisplayed(oxoHomePagePO.Japan_drpdwn));
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
