package com.oxo.qe.test.stepdefinition.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Common_Web_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(Common_Web_SD.class);
	OXO_MyAccount_PO oxoMyAccountPO = PageFactory.initElements(driver, OXO_MyAccount_PO.class);

	@Given("^user launches the browser and navigates to \"(.*?)\" page$")
	public void user_launches_the_browser_and_navigates_to_page(String url) throws Throwable {
		initializeDriver();
		openBaseURL(url);
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// waitForPageLoad(driver);
	}

	@Then("^User closes the web application$")
	public void user_closes_the_web_application() throws Throwable {
		logger.debug("User closes the application & Browser.............");
		close();
	}

	
	@Then("^user gets broken page links$") public void
	  user_gets_broken_page_links() throws Throwable {
	  
	  List<WebElement> li = driver.findElements(By.tagName("a"));
	  
	  //System.out.println("links size:" + li.size());
	  logger.info("links size:" +li.size());
	  
	  for (WebElement ele : li) { String url = ele.getAttribute("href");
	  CommonActionHelper.verifyLinks(url); }
	  
	  }
	
}
