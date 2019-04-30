package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_Order_PO {
	
   //@FindBy(xpath="//*[@class='order-number-wrapper']/span") public WebElement orderNum_Txt;
	@FindBy(xpath="//*[text()='Order Number: ']/a") public WebElement orderNum_Txt;
	@FindBy(xpath="//*[text()='Order Number: ']/span") public WebElement orderNum2_Txt;
	@FindBy(xpath="//*[@data-bind='text: getEmailAddress()']") public WebElement orderEmail_Txt;
	@FindBy(xpath="//*[@class='action primary']") public WebElement orderCreateAcc_Btn;
	@FindBy(xpath="(//*[@class='box-title'])[1]") public WebElement orderItems_Lnk;
	@FindBy(xpath="(//*[@class='box-title'])[2]") public WebElement orderShipp_Lnk;
	@FindBy(xpath="(//*[@class='box-title'])[3]") public WebElement orderPayment_Lnk;
	
	

}
