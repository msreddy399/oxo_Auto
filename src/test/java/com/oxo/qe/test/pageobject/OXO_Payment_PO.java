package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_Payment_PO {
	
	@FindBy(xpath="(//*[@class='button--reset opc__step-edit text-link-01'])[1]") public WebElement paymentPageShipEdit_Lnk;
	@FindBy(id="discount-code") public WebElement billingPromoCode_Txt;
	@FindBy(xpath="//*[@class='action action-apply']") public WebElement billingPromoCodeApply_Btn;
	@FindBy(xpath="//*[@class='payment-icon']") public WebElement billingPaypal_RdBtn;
	@FindBy(xpath="//*[text()='Credit Card']") public WebElement billingCredit_RdBtn;
	@FindBy(xpath="(//*[text()='My billing and shipping address are the same'])[1]") public WebElement billingShippingAddressSame_Chkbx;
	
	@FindBy(xpath="(//*[@id='c-ct'])[1]") public WebElement creditCard_Dropdown;
	@FindBy(xpath="(//*[@id='c-cardnumber'])[1]") public WebElement creditCard_Txt;
	@FindBy(xpath="(//*[@id='c-exmth'])[1]") public WebElement creditCardExpMon_Dropdown;
	@FindBy(xpath="(//*[@id='c-exyr'])[1]") public WebElement creditCardExpYear_Dropdown;
	@FindBy(xpath="(//*[@id='c-cvv'])[1]") public WebElement creditCardCvv_Txt;
	@FindBy(xpath="//*[text()='Place Order']") public WebElement billingPlaceOrder_Btn;
	
	
	
}
