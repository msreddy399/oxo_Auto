package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_MyAccount_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_MyAccount_Verification_SD extends CommonActionHelper {

	OXO_MyAccount_PO oxoMyAccountPO = PageFactory.initElements(driver, OXO_MyAccount_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_MyAccount_Verification_SD.class);

	@Then("^Verify below Sub/Main Module of MyAccount Page$")
	public void verify_below_Sub_Main_Module_of_MyAccount_Page(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {

				 String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// HomePage
				// ===============================================================================

				if (currentElement.equalsIgnoreCase("signIn_Txt"))
					assertTrue(isDisplayed(oxoMyAccountPO.signIn_Txt));
				else if (currentElement.equalsIgnoreCase("Password_Txt"))
					assertTrue(isDisplayed(oxoMyAccountPO.Password_Txt));
				else if (currentElement.equalsIgnoreCase("login_Btn"))
					assertTrue(isDisplayed(oxoMyAccountPO.login_Btn));
				else if (currentElement.equalsIgnoreCase("forgotPassword_Lnk"))
					assertTrue(isDisplayed(oxoMyAccountPO.forgotPassword_Lnk));
				else if (currentElement.equalsIgnoreCase("createAccount_Btn"))
					assertTrue(isDisplayed(oxoMyAccountPO.createAccount_Btn));
				else if (currentElement.equalsIgnoreCase("signClose_Btn"))
					assertTrue(isDisplayed(oxoMyAccountPO.signClose_Btn));
				else if (currentElement.equalsIgnoreCase("AccountBanner_Img1"))
					assertTrue(isDisplayed(oxoMyAccountPO.AccountBanner_Img1));				
				else if (currentElement.equalsIgnoreCase("AccountBanner_Img2"))					
					assertTrue(isDisplayed(oxoMyAccountPO.AccountBanner_Img2));
				else if(currentElement.equalsIgnoreCase("AccountBannerTittle_Txt"))
					assertTrue(isDisplayed(oxoMyAccountPO.AccountBannerTittle_Txt));
				else if(currentElement.equalsIgnoreCase("AccountBannerSubTittle_Txt"))
					assertTrue(isDisplayed(oxoMyAccountPO.AccountBannerSubTittle_Txt));
				
				else if (currentElement.equalsIgnoreCase("myAccountDash_Lnk"))
					assertTrue(isDisplayed(oxoMyAccountPO.myAccountDash_Lnk));
				else if (currentElement.equalsIgnoreCase("myOrdrDash_Lnk"))
					assertTrue(isDisplayed(oxoMyAccountPO.myOrdrDash_Lnk));
				else if (currentElement.equalsIgnoreCase("myWishListDash_Lnk"))
					assertTrue(isDisplayed(oxoMyAccountPO.myWishListDash_Lnk));
				else if (currentElement.equalsIgnoreCase("myAddrBookDash_Lnk"))
					assertTrue(isDisplayed(oxoMyAccountPO.myAddrBookDash_Lnk));
				else if (currentElement.equalsIgnoreCase("myInfoDash_Lnk"))
					assertTrue(isDisplayed(oxoMyAccountPO.myInfoDash_Lnk));
				else if (currentElement.equalsIgnoreCase("addAnAddress_Btn"))
					assertTrue(isDisplayed(oxoMyAccountPO.addAnAddress_Btn));
				else if (currentElement.equalsIgnoreCase("firstName_Txt"))
					assertTrue(isDisplayed(oxoMyAccountPO.firstName_Txt));
				else if (currentElement.equalsIgnoreCase("lastName_Txt"))
					assertTrue(isDisplayed(oxoMyAccountPO.lastName_Txt));
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
