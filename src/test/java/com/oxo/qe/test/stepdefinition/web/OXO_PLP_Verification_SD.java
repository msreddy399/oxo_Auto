package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_PLP_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_PLP_Verification_SD extends CommonActionHelper {

	OXO_PLP_PO oxoPLPPo = PageFactory.initElements(driver, OXO_PLP_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_PLP_Verification_SD.class);

	@Then("^Verify below Sub/Main Module of PLP Page$")
	public void verify_below_Sub_Main_Module_of_PLP_Page(DataTable arg1) throws Throwable {
	    
		try {
			List<List<String>> elements = arg1.raw();
			for(int i=1; i<elements.size(); i++) {
				
				String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// PLP
				// ===============================================================================
					
				if (currentElement.equalsIgnoreCase("PlpBanner_Img1"))
					assertTrue(isDisplayed(oxoPLPPo.PlpBanner_Img1));				
				else if (currentElement.equalsIgnoreCase("PlpBanner_Img2"))					
					assertTrue(isDisplayed(oxoPLPPo.PlpBanner_Img2));
				else if(currentElement.equalsIgnoreCase("plpBannerTittle_Txt"))
					assertTrue(isDisplayed(oxoPLPPo.plpBannerTittle_Txt));
				else if(currentElement.equalsIgnoreCase("plpBannerSubTittle_Txt"))
					assertTrue(isDisplayed(oxoPLPPo.plpBannerSubTittle_Txt));
				else if (currentElement.equalsIgnoreCase("PlpProduct_Img"))
					assertTrue(isDisplayed(oxoPLPPo.PlpProduct_Img));
				else if(currentElement.equalsIgnoreCase("plpWishlist_Icon"))
					assertTrue(isDisplayed(oxoPLPPo.plpWishlist_Icon));
				else if(currentElement.equalsIgnoreCase("plpAddToCart_Btn"))
					assertTrue(isDisplayed(oxoPLPPo.plpAddToCart_Btn));
				else if(currentElement.equalsIgnoreCase("loadMoreProdts_Btn"))
					assertTrue(isDisplayed(oxoPLPPo.loadMoreProdts_Btn));
				else if(currentElement.equalsIgnoreCase("plpBreadcrumb_Lnk"))
					assertTrue(isDisplayed(oxoPLPPo.plpBreadcrumb_Lnk));
				else if(currentElement.equalsIgnoreCase("plpProductName_Txt"))
					assertTrue(isDisplayed(oxoPLPPo.plpProductName_Txt));
				else if(currentElement.equalsIgnoreCase("plpProductPrice_Txt"))
					assertTrue(isDisplayed(oxoPLPPo.plpProductPrice_Txt));
				 else if (currentElement.equalsIgnoreCase("plpShopCart_Lnk"))
					  assertTrue(isDisplayed(oxoPLPPo.plpShopCart_Lnk));
				 else if (currentElement.equalsIgnoreCase("plpBreadcrumbcat_Lnk"))
					  assertTrue(isDisplayed(oxoPLPPo.plpBreadcrumbcat_Lnk));
				 else if (currentElement.equalsIgnoreCase("plpSortClr_Lnk"))
					  assertTrue(isDisplayed(oxoPLPPo.plpSortClr_Lnk));
				else {
					logger.error("Element <" + currentElement + "> is not found in the SD list.");
					throw new NullArgumentException("Element <" + currentElement + "> is not found in the SD list.");
					 
				
			}	
			}
		  
		}catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
		    
		}

	}
