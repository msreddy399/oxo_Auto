package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_MyAccount_PO {
	
	@FindBy(xpath="//*[@id='email']") public WebElement signIn_Txt;
	@FindBy(xpath="//*[@id='pass1']") public WebElement Password_Txt;
	@FindBy(xpath="//*[@id='bnt-social-login-authentication']") public WebElement login_Btn;
	@FindBy(xpath="//*[@id='pass1']") public WebElement forgotPassword_Lnk;
	@FindBy(xpath="//*[@id='pass1']") public WebElement createAccount_Btn;
	@FindBy(xpath="//*[@class='mfp-close']") public WebElement signClose_Btn;
	
	@FindBy(xpath="(//*[@class='hero__info hero__info--'])[1]") public WebElement AccountBanner_Img1;
	@FindBy(xpath="(//*[@class='hero__media hero__media--'])[1]") public WebElement AccountBanner_Img2;
	@FindBy(xpath="//*[@class='hero__title hero__title--']") public WebElement AccountBannerTittle_Txt;
	@FindBy(xpath="//*[@class='hero__copy hero__copy--']") public WebElement AccountBannerSubTittle_Txt;
		
	@FindBy(xpath="(//*[@class='customer-name'])[1]") public WebElement sign_drpdwn;
	@FindBy(xpath="(//*[@class='authorization-link'])[1]/a") public WebElement signOut_Lnk;
	@FindBy(xpath="(//*[@class='header links'])[2]/li[1]") public WebElement myAccount_Lnk;
	
	@FindBy(xpath="(//*[text()='My Account'])[5]") public WebElement myAccountDash_Lnk;
	@FindBy(xpath="(//*[text()='My Orders'])[1]") public WebElement myOrdrDash_Lnk;
	@FindBy(xpath="(//*[text()='My Wish List'])[1]") public WebElement myWishListDash_Lnk;
	@FindBy(xpath="(//*[text()='Address Book'])[2]") public WebElement myAddrBookDash_Lnk;
	@FindBy(xpath="(//*[text()='My Information'])[1]") public WebElement myInfoDash_Lnk;
	
	@FindBy(xpath="//*[@id='email-social']") public WebElement signIn2_Txt;
	
	@FindBy(xpath="//*[@id='pass-social']") public WebElement Password2_Txt;
	@FindBy(xpath="//*[@id='send2']") public WebElement Sign_Btn;
	
	@FindBy(xpath="(//*[@class='action primary add'])[1]") public WebElement addNewAddress_Btn;
	@FindBy(xpath="(//*[@class='action edit'])[2]") public WebElement addrEdit_Lnk;
	@FindBy(xpath="(//*[text()='Delete'])[1]") public WebElement addrDelete_Lnk;
	@FindBy(xpath="//*[text()='Delete Address']") public WebElement addrDelete_Btn;
	
	@FindBy(xpath="//*[text()='Add an Address']") public WebElement addAnAddress_Btn;
	@FindBy(xpath="//*[@id='firstname']") public WebElement firstName_Txt;
	@FindBy(xpath="//*[@id='lastname']") public WebElement lastName_Txt;
	@FindBy(xpath="//*[@id='telephone']") public WebElement phoneNum_Txt;
	@FindBy(xpath="//*[@id='street_1']") public WebElement street_Txt;
	@FindBy(xpath="//*[@id='city']") public WebElement city_Txt;
	@FindBy(xpath="//*[@class='action submit primary']/span") public WebElement saveAddr_Btn;
	
	@FindBy(xpath="//*[text()='View Order']") public WebElement viewOrder_Btn;
	
	
	
	
	
	
	

}
