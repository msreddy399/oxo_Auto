package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_Shipping_PO {
	
	@FindBy(xpath="//*[@class='item Back to cart']/a") public WebElement shippBackToCart_Lnk;
	
	@FindBy(xpath="(//*[@name='firstname'])[2]") public WebElement shippFirstName_Txt;
	@FindBy(xpath="(//*[@name='lastname'])[2]") public WebElement shippLastName_Txt;
	@FindBy(xpath="(//*[@name='company'])[1]") public WebElement shippCompany_Txt;
	@FindBy(xpath="(//*[@name='street[0]'])[1]") public WebElement shippStreetAddress_Txt;
	@FindBy(xpath="(//*[@name='city'])[1]") public WebElement shippCity_Txt;
	@FindBy(xpath="(//*[@name='postcode'])[1]") public WebElement shippZipCode_Txt;
	@FindBy(xpath="(//*[@name='country_id'])[1]") public WebElement shippCountry_Txt;
	@FindBy(xpath="(//*[@class='address_button'])[1]/button") public WebElement shippAddrValidation_Btn;
	@FindBy(xpath="//*[@class='typeahead dropdown-menu checkout-shipping-address']/li[1]") public WebElement shippAddrValidation2_Btn;
	
	@FindBy(xpath="//*[@name='region_id']") public WebElement shippState_Dropdown;
	@FindBy(xpath="(//*[@name='telephone'])[1]") public WebElement shippPhoneNum_Txt;
	@FindBy(xpath="(//*[@type='email'])[6]") public WebElement shippEmail_Txt;
	@FindBy(xpath="(//*[@id='customer-password'])[1]") public WebElement shippPass_Txt;
	@FindBy(xpath="(//*[@class='action login primary'])[2]") public WebElement shippLogin_Btn;
	@FindBy(xpath="(//*[@for='newsletter_subscribe'])[1]/span") public WebElement shippSignUp_Checkbox;
	@FindBy(xpath="(//*[@class='col col-input'])[1]") public WebElement shippingShippMethod_RadioBtn;
	@FindBy(xpath="(//*[@class='col col-input'])[2]") public WebElement shippingShippMethod2_RadioBtn;
	@FindBy(xpath="(//*[@class='button action continue primary'])[1]") public WebElement shippingProceedPayment_Btn;
	
	@FindBy(xpath="(//*[@class='title'])[2]") public WebElement shippCartItem_drpdpwn;
	@FindBy(xpath="(//*[@class='product-image-wrapper'])[2]") public WebElement shippCartItem_Img;
	
	@FindBy(xpath="//*[text() ='Add New Address']") public WebElement shippAddNewAddrs_Btn;
	
	@FindBy(xpath="//*[@id ='BYKUV4C']") public WebElement shippAddNewAddrsFirstName_Txt;
	@FindBy(xpath="//*[@id ='LYM0AD4']") public WebElement shippAddNewAddrsLastName_Txt;
	@FindBy(xpath="//*[@id ='CPI1RBU']") public WebElement shippAddNewAddrstreetName_Txt;
	@FindBy(xpath="//*[@id ='J7WVRI4']") public WebElement shippAddNewAddrsCity_Txt;
	@FindBy(xpath="//*[@id ='CK19OEA']") public WebElement shippAddNewPhoneNum_Txt;
	@FindBy(xpath="//*[text()='Save Address']") public WebElement shippAddNewSaveAddrs_Btn;
	
	

}
