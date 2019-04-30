
package com.oxo.qe.test.stepdefinition.web;

import org.apache.log4j.Logger;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.framework.common.Constants;
import com.oxo.qe.framework.common.PropertiesHelper;
import com.oxo.qe.framework.web.helpers.WebDriverHelper;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private static final Logger logger = Logger.getLogger(Hooks.class);
	public Scenario scenario;
	public String testType;
	public String screenshortName;
	public PropertiesHelper loadProps;

	public Hooks() {
	}

	@Before(order = 0)
	public void StartBrowserProxy(Scenario scenario) {
		logger.info("StartBrowserProxy is Comentted");

	}

	@Before
	public void BeforeSteps(Scenario scenario) {
		this.scenario = scenario;
		loadProps = PropertiesHelper.getInstance();
		Constants.screenShortTagNames = "";

		logger.info("exection Start Scenario Name: " + scenario.getName());
		logger.info("exection Start Scenario ID: " + scenario.getSourceTagNames());
		screenshortName = "OXOImage";
		Constants.screenShortTagNames = screenshortName;
		logger.info("screenshortName Name::" + screenshortName);
	}

	@After
	public void AfterSteps() {
		logger.info("exection End Scenario Name: " + scenario.getName() + "  :: Status:" + scenario.getStatus());
		embedScreenshot(scenario);
		logger.info("Closing Webdriver or sessions.........");
		WebDriverHelper.quitDriver();
		logger.info("Scenarion Execution End.");

	}

	@After(order = 0)
	public void stopProxyServer() {
		logger.info("EndBrowserProxy is Comentted");

	}

	private String getTagName(String name) {
		String tName = "";
		for (String tag : scenario.getSourceTagNames()) {
			if (tag != null && tag.contains(name)) {
				tName = tag;
				break;
			}
		}
		return tName;
	}

	private String getTestType() {
		String testType = "";
		for (String tag : scenario.getSourceTagNames()) {
			if (tag != null) {
				tag = tag.toLowerCase();
				if (tag.contains("web")) {
					testType = tag.replaceAll("[^A-Za-z0-9-_]", "");
					break;

				}

			}
		}
		return testType;
	}

	private boolean embedScreenshot(Scenario scenario) {
		boolean flag = false;
		logger.info(scenario.getStatus() + " :Scenario isFailed::" + scenario.isFailed());
		logger.info("Test Type::" + testType);
		if (scenario.isFailed()) {
			flag = CommonActionHelper.embedScreenshot(scenario);
		}
		return flag;
	}
}
