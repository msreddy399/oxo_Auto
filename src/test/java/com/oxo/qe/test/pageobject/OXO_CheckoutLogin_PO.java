package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_CheckoutLogin_PO {
	
	@FindBy(xpath="//*[@id='customer-email']") public WebElement checkoutLoginEmail_Txt;
	@FindBy(xpath="//*[@id='pass']") public WebElement checkoutLoginPass_Txt;
	@FindBy(xpath="//*[@id='send2']") public WebElement checkoutLoginSignIn_Btn;
	@FindBy(xpath="//*[@class='action action-register primary']") public WebElement checkoutLoginGuest_Btn;
	@FindBy(xpath="//*[@class='action-close']") public WebElement checkoutLoginClose_Icon;

}
