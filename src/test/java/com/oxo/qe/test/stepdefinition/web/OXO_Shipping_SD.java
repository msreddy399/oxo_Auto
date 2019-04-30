package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.oxo.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_CheckoutLogin_PO;
import com.oxo.qe.test.pageobject.OXO_PDP_PO;
import com.oxo.qe.test.pageobject.OXO_Shipping_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OXO_Shipping_SD extends CommonActionHelper {
	
	OXO_CheckoutLogin_PO oxoCheckLoginPO = PageFactory.initElements(driver, OXO_CheckoutLogin_PO.class);
	OXO_Shipping_PO oxoShippPO = PageFactory.initElements(driver, OXO_Shipping_PO.class);
	OXO_PDP_PO oxoPDPPO = PageFactory.initElements(driver, OXO_PDP_PO.class);
	Actions action = new Actions(driver);
	
	
	@When("^user clicks on checkout as a guest in checkout login page$")
	public void user_clicks_on_checkout_as_a_guest_in_checkout_login_page() throws Throwable {
		waitForElement(oxoCheckLoginPO.checkoutLoginGuest_Btn);
		assertTrue(clickOnButton(oxoCheckLoginPO.checkoutLoginGuest_Btn));
	}
	
	@When("^user clicks on back to cart link$")
	public void user_clicks_on_back_to_cart_link() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  //js.executeScript("window.scrollBy(0,0)");
		  js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		waitForElement(oxoShippPO.shippBackToCart_Lnk);
		assertTrue(clickOnButton(oxoShippPO.shippBackToCart_Lnk));
		
	}
	
	@When("^user clicks on item in cart dropdown in shipping page$")
	public void user_clicks_on_item_in_cart_dropdown_in_shipping_page() throws Throwable {
		//Thread.sleep(3000);
		waitForElement(oxoShippPO.shippCartItem_drpdpwn);
		assertTrue(clickOnButton(oxoShippPO.shippCartItem_drpdpwn));
		//Thread.sleep(3000);
	}
	
	@Given("^user enters shipping firstname \"(.*?)\"$")
	public void user_enters_shipping_firstname(String arg1) throws Throwable {
		waitForElement(oxoShippPO.shippFirstName_Txt);
		clearText(oxoShippPO.shippFirstName_Txt);
		setInputText(oxoShippPO.shippFirstName_Txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Given("^user enters shipping lastname \"(.*?)\"$")
	public void user_enters_shipping_lastname(String arg1) throws Throwable {
		waitForElement(oxoShippPO.shippLastName_Txt);
		clearText(oxoShippPO.shippLastName_Txt);
		setInputText(oxoShippPO.shippLastName_Txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Given("^user enters shipping street address \"(.*?)\"$")
	public void user_enters_shipping_street_address(String arg1) throws Throwable {
		waitForElement(oxoShippPO.shippStreetAddress_Txt);
		setInputText(oxoShippPO.shippStreetAddress_Txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Given("^user enters shipping city \"(.*?)\"$")
	public void user_enters_shipping_city(String arg1) throws Throwable {
		waitForElement(oxoShippPO.shippCity_Txt);
		setInputText(oxoShippPO.shippCity_Txt, webPropHelper.getTestDataProperty(arg1));
		tabInputBox(oxoShippPO.shippCity_Txt);
	}

	@Given("^user enters shipping zipcode \"(.*?)\"$")
	public void user_enters_shipping_zipcode(String arg1) throws Throwable {
		setInputText(oxoShippPO.shippZipCode_Txt, webPropHelper.getTestDataProperty(arg1));
	}
	
	@Given("^user selects the state from dropdown$")
	public void user_selects_the_state_from_dropdown() throws Throwable {
		selectByValue(oxoShippPO.shippState_Dropdown, "1");
	}

	@Given("^user enters shipping phonenumber \"(.*?)\"$")
	public void user_enters_shipping_phonenumber(String arg1) throws Throwable {
		setInputText(oxoShippPO.shippPhoneNum_Txt, webPropHelper.getTestDataProperty(arg1));
	}
	
	@Given("^user selects an address from avs popup$")
	public void user_selects_an_address_from_avs_popup() throws Throwable {
		//waitForElement(oxoShippPO.shippAddrValidation_Btn);
		//assertTrue(clickOnButton(oxoShippPO.shippAddrValidation_Btn));
		//waitForElement(oxoShippPO.shippAddrValidation_Btn);
		Thread.sleep(9000);
		assertTrue(clickOnButton(oxoShippPO.shippAddrValidation2_Btn));
		
	}
	
	@Given("^user enters shipping email \"(.*?)\"$")
	public void user_enters_shipping_email(String arg1) throws Throwable {
		setInputText(oxoShippPO.shippEmail_Txt, webPropHelper.getTestDataProperty(arg1));
		tabInputBox(oxoShippPO.shippEmail_Txt);
	}
	
	@Given("^user selects shipping method$")
	public void user_selects_shipping_method() throws Throwable {
		//waitForElement(oxoShippPO.shippingShippMethod2_RadioBtn);
		Thread.sleep(5000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		  //js.executeScript("window.scrollBy(0,400)");
			
		    //oxoShippPO.shippingShippMethod2_RadioBtn.click();
		    
		    List<WebElement> radioBtn = driver.findElements(By.xpath("//*[@class='col col-input']"));
		    
		    radioBtn.get(1).click();
			
			
			
			
	}

	@When("^user clicks on proceed to payment$")
	public void user_clicks_on_proceed_to_payment() throws Throwable {
		//assertTrue(clickOnButton(oxoShippPO.shippingProceedPayment_Btn));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,400)");
		  js.executeScript("arguments[0].click();", oxoShippPO.shippingProceedPayment_Btn); 
		
	}
	
	@Given("^user enters shipping password \"(.*?)\"$")
	public void user_enters_shipping_password(String arg1) throws Throwable {		
		Thread.sleep(3000);
		setInputText(oxoShippPO.shippPass_Txt, webPropHelper.getTestDataProperty(arg1));
		tabInputBox(oxoShippPO.shippPass_Txt);
		
	}
	
	@Given("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		Thread.sleep(3000);
		assertTrue(clickOnButton(oxoShippPO.shippLogin_Btn));		
	}
	
	@Given("^user clicks on checkout button in mini cart$")
	public void user_clicks_on_checkout_button_in_mini_cart() throws Throwable {
		//Thread.sleep(3000);
		 waitForElement(oxoPDPPO.miniCart_Icon);
		action.moveToElement(oxoPDPPO.miniCart_Icon).build().perform();
		assertTrue(clickOnButton(oxoPDPPO.minicartCheckout_Btn));
		
	}

}
