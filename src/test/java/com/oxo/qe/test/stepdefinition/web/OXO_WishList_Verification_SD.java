package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_MyAccount_PO;
import com.oxo.qe.test.pageobject.OXO_WishList_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_WishList_Verification_SD extends CommonActionHelper {

	OXO_MyAccount_PO oxoMyAccountPO = PageFactory.initElements(driver, OXO_MyAccount_PO.class);
	OXO_WishList_PO oxoWishListPO = PageFactory.initElements(driver, OXO_WishList_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_WishList_Verification_SD.class);

	@Then("^Verify below Sub/Main Module of Wish List Page$")
	public void verify_below_Sub_Main_Module_of_MyAccount_Page(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {

				 String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// HomePage
				// ===============================================================================

				if (currentElement.equalsIgnoreCase("wishList_Img"))
					assertTrue(isDisplayed(oxoWishListPO.wishList_Img));				
				else if (currentElement.equalsIgnoreCase("wishListRemove_Btn"))
					assertTrue(isDisplayed(oxoWishListPO.wishListRemove_Btn));
				else if (currentElement.equalsIgnoreCase("wishListAddToCart_Btn"))
					assertTrue(isDisplayed(oxoWishListPO.wishListAddToCart_Btn));
				else if (currentElement.equalsIgnoreCase("wishListAddAllToCart_Btn"))
					assertTrue(isDisplayed(oxoWishListPO.wishListAddAllToCart_Btn));
				else if (currentElement.equalsIgnoreCase("wishListPrdPrice_Txt"))
					assertTrue(isDisplayed(oxoWishListPO.wishListPrdPrice_Txt));
				else if (currentElement.equalsIgnoreCase("wishListPrdName_Txt"))
					assertTrue(isDisplayed(oxoWishListPO.wishListPrdName_Txt));
				//driver.findElementByClassName("dd").get
				
				
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
