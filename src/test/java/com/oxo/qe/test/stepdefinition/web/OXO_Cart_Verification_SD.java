package com.oxo.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_Cart_PO;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_Cart_Verification_SD extends CommonActionHelper {
	
	OXO_Cart_PO oxoCartPO = PageFactory.initElements(driver, OXO_Cart_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_Cart_Verification_SD.class);
	
	
	@Then("^Verify below Sub/Main Module of CartPage$")
	public void verify_below_Sub_Main_Module_of_CartPage(DataTable arg1) throws Throwable {
		
		try {
		List<List<String>> elements = arg1.raw();
		for(int i=1; i<elements.size(); i++) {
			
			String currentElement = elements.get(i).get(0);
			// ===============================================================================
			//// HomePage
			// ===============================================================================
			if (currentElement.equalsIgnoreCase("cartCheckout_Btn"))
				assertTrue(isDisplayed(oxoCartPO.cartCheckout_Btn));
			else if(currentElement.equalsIgnoreCase("cartPayPal_Btn"))
				assertTrue(isDisplayed(oxoCartPO.cartPayPal_Btn));
			else if(currentElement.equalsIgnoreCase("cartOrderSummary_Txt"))
				assertTrue(isDisplayed(oxoCartPO.cartOrderSummary_Txt));
			else if(currentElement.equalsIgnoreCase("cartOrderSummaryPrice_Txt"))
				assertTrue(isDisplayed(oxoCartPO.cartOrderSummaryPrice_Txt));
			else if(currentElement.equalsIgnoreCase("cartOrderSummarySubtotalPrice_Txt"))
				assertTrue(isDisplayed(oxoCartPO.cartOrderSummarySubtotalPrice_Txt));
			else if(currentElement.equalsIgnoreCase("cartOrderTotalPrice_Txt"))
				assertTrue(isDisplayed(oxoCartPO.cartOrderTotalPrice_Txt));
			else if(currentElement.equalsIgnoreCase("cartContShopping_Lnk"))
				assertTrue(isDisplayed(oxoCartPO.cartContShopping_Lnk));
			else if(currentElement.equalsIgnoreCase("cartPrd_Img"))
				assertTrue(isDisplayed(oxoCartPO.cartPrd_Img));
			else if(currentElement.equalsIgnoreCase("cartRemoveItem_Lnk"))
				assertTrue(isDisplayed(oxoCartPO.cartRemoveItem_Lnk));
			else if(currentElement.equalsIgnoreCase("cartPrice_Txt"))
				assertTrue(isDisplayed(oxoCartPO.cartPrice_Txt));
			else if(currentElement.equalsIgnoreCase("cartPrdName_Txt"))
				assertTrue(isDisplayed(oxoCartPO.cartPrdName_Txt));
			else if(currentElement.equalsIgnoreCase("cartSkuId_Txt"))
				assertTrue(isDisplayed(oxoCartPO.cartSkuId_Txt));
			else if(currentElement.equalsIgnoreCase("cartSkuId_Drpdwn"))
				assertTrue(isDisplayed(oxoCartPO.cartSkuId_Drpdwn));
			else if(currentElement.equalsIgnoreCase("cartQty_drpdwn"))
				assertTrue(isDisplayed(oxoCartPO.cartQty_drpdwn));
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
