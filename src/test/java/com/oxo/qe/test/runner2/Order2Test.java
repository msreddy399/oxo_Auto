
package com.oxo.qe.test.runner2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
  
@CucumberOptions(
		features="src/test/resources/features/web2/OXO_Order2.feature",
		glue="com.oxo.qe.test.stepdefinition.web",
		monochrome=true, 
		dryRun=false,
		//tags= {"@OXO_ORDER_01"},
    	format={"pretty","html:target/cucumber-reports/cucumber-html-reports", "json:target/cucumber-reports/cucumber-html-reports/common.json"}		
		/*plugin={ "html:target/cucumber-html-reports", "json:target/cucumber.json",
		          "pretty:target/cucumber-pretty.txt", "junit:target/cucumber-results.xml" }*/		
		) 
  
  public class Order2Test{
  
  }
