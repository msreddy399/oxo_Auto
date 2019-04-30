package com.oxo.qe.test.stepdefinition.web;

import java.util.List;

import org.apache.log4j.Logger;

import com.oxo.qe.framework.common.CommonActionHelper;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class OXO_VERIFICATION_MESSAGES_SD extends CommonActionHelper {
	
	private static final Logger logger = Logger.getLogger(OXO_VERIFICATION_MESSAGES_SD.class);
	

	@Then("^Verify the message on the page$")
	public void verify_the_message_on_the_page(DataTable arg1) throws Throwable {
		
		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {
				String currentElement = elements.get(i).get(0);

				VerifyTextPersent(currentElement.trim());
			}
		} catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
	    
	}
	
	@Then("^Verify the message not displayed on the page$")
	public void verify_the_message_not_displayed_on_the_page(DataTable arg1) throws Throwable {
		
		try {
			List<List<String>> messages = arg1.raw();
			for (int i = 1; i < messages.size(); i++) {
				String currentMessage = messages.get(i).get(0);
				VerifyTextNotPersent(currentMessage.trim());
			}
		} catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
		

		
		
	   
	}

}
