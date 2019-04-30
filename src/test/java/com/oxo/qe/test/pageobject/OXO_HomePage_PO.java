package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_HomePage_PO {

		
	@FindBy(xpath="(//*[@class='authorization-link'])[1]") public WebElement signIn_Lnk;
	@FindBy(xpath = "(//*[@class='link wishlist'])[1]") public WebElement wishList_Lnk;
	//@FindBy(xpath = "//*[@class='search-tool__icon']") public WebElement Search_Icon;
	@FindBy(xpath = "(//*[text() ='Search'])[1]") public WebElement Search_Icon;
	@FindBy(xpath = "//*[@class='search-tool__text']") public WebElement Search_Txt;
	@FindBy(xpath = "//*[@name='q']") public WebElement Search_Placeholder_Txt;
	@FindBy(xpath = "//*[@class='block-search-close']") public WebElement Search_Close_btn;
	@FindBy(xpath = "//*[@title='OXO']") public WebElement oxo_Logo;
	@FindBy(xpath = "//*[@class='minicart-wrapper']") public WebElement minicart_Icon;
	@FindBy(xpath = "(//*[text()= 'See Details'])[1]") public WebElement shippingDetails_Lnk;	
	@FindBy(xpath = "(//*[@class='navigation__item navigation__item--parent'])[1]/a") public WebElement L1_Cat_CookingAndBaking;
	@FindBy(xpath = "(//*[@class='navigation__item navigation__item--no-parent'])[1]/a") public WebElement L1_Cat_GoodTipsBlog;
	@FindBy(xpath = "//*[@class='mantle__label']") public WebElement Shop_Now1_Btn;
	@FindBy(xpath = "//*[@class='featured-collection-grid__link']") public WebElement Shop_Now2_Btn;
	@FindBy(xpath = "(//*[@class='featured-collection-grid-slider-image'])[1]") public WebElement Fea_Col_prd_Img;
	@FindBy(xpath = "(//*[@class='action towishlist'])[2]") public WebElement WishListPLP_Icon;
	@FindBy(xpath = "(//*[@class='featured-message-column featured-message-column--cta'])[1]/a") public WebElement LearnMore_Btn;
	@FindBy(xpath = "//*[@class='featured-blog-header__link']") public WebElement GoodTipsBlog_Icon;
	@FindBy(xpath = "(//*[@class='featured-product-image'])[3]") public WebElement Latest_prd_Img;
	@FindBy(xpath = "(//*[@class='featured-social__link'])[1]") public WebElement FollowsUs_Btn;
	@FindBy(xpath = "(//*[@class='sc-dxgOiQ gvEdgE'])[1]") public WebElement Instagram_Slider_Img;
	@FindBy(xpath = "(//*[@class='sc-dxgOiQ gJklMN'])") public WebElement Instagram_Slider_popup_Img;
	@FindBy(xpath = "(//*[@id='newsletter'])") public WebElement StayInEmail_txt;
	@FindBy(xpath = "(//*[@id='newsletter-signup-button'])") public WebElement StayInEmail_btn;
	@FindBy(xpath = "(//*[text()='Back to Homepage'])") public WebElement BackToHomePage_Btn;
	@FindBy(xpath = "//*[@class='footer__logo']") public WebElement oxoFooter_Logo;
	@FindBy(xpath = "//*[@class='footer-region__title us']") public WebElement countrySelector_drpdwn;
	@FindBy(xpath = "(//*[@class='footer-region__item'])[1]") public WebElement UK_drpdwn;
	@FindBy(xpath = "(//*[@class='footer-region__item'])[2]") public WebElement Germany_drpdwn;
	@FindBy(xpath = "(//*[@class='footer-region__item'])[3]") public WebElement Japan_drpdwn;
	@FindBy(xpath = "(//*[@class='footer-bottom-links__link'])[1]") public WebElement termsOfUse_Lnk;
	@FindBy(xpath = "(//*[@class='footer-bottom-links__link'])[2]") public WebElement privacyPolicy_Lnk;
	
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[1]") public WebElement contactUS_Lnk;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[2]") public WebElement faq_Lnk;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[3]") public WebElement storeLoc_Lnk;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[4]") public WebElement prdReg_Lnk;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[5]") public WebElement volRecal_Lnk;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[6]") public WebElement privacyPolicy_Lnk2;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[7]") public WebElement termsOfUse_Lnk2;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[8]") public WebElement BlogOutreach_Lnk;
	
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[9]") public WebElement TrackOrder_Lnk;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[10]") public WebElement ShippInfo_Lnk;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[11]") public WebElement BetterGaurantee_Lnk;
	
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[12]") public WebElement goodTipsBlog_Lnk;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[13]") public WebElement careers_Lnk;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[14]") public WebElement investorSubmission_Lnk;
	@FindBy(xpath = "(//*[@class='footer-column__inner-link'])[15]") public WebElement investRel_Lnk;
	
//	@FindBy(xpath = "(//*[@class='navigation__inner-item navigation__inner-item--level2'])[5]/a") public WebElement L2_Cat;	
	@FindBy(xpath = "(//*[@class='navigation__inner-item navigation__inner-item--level1 navigation__inner-item--parent'])[2]/a") public WebElement L2_Cat;	
	@FindBy(xpath = "//*[@class='footer-social__item icon--social-instagram']/a") public WebElement instgram_Icon;
	@FindBy(xpath = "//*[@class='footer-social__item icon--social-facebook']/a") public WebElement facebook_Icon;
	@FindBy(xpath = "//*[@class='footer-social__item icon--social-pinterest']/a") public WebElement pinterest_Icon;
	@FindBy(xpath = "//*[@class='footer-social__item icon--social-youtube']/a") public WebElement youtube_Icon;
	@FindBy(xpath = "//*[@class='footer-social__item icon--social-twitter']/a") public WebElement twitter_Icon;
	
	@FindBy(xpath = "(//*[@class='item-image-holder'])[1]") public WebElement searchprd_Img;
	
	
		
	

}
