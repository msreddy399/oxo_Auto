package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_PDP_PO {
	
	@FindBy(xpath="(//*[@id='product-addtocart-button'])[1]") public WebElement PdpAddToCart_Btn;
//	@FindBy(xpath="(//*[text ()='Add to Cart'])[1]") public WebElement PdpAddToCart_Btn;
	@FindBy(xpath="//*[@class='action showcart']") public WebElement miniCart_Icon;
	@FindBy(xpath="(//*[@class='action viewcart'])[1]") public WebElement miniCartViewCart_Btn;
	@FindBy(xpath="(//*[@class='product-image-photo'])[1]") public WebElement minicart_Img;
	@FindBy(xpath="//*[@class='action delete']/span") public WebElement minicartRemove_Btn;
	@FindBy(xpath="(//*[@id='top-cart-btn-checkout'])[1]") public WebElement minicartCheckout_Btn;
	@FindBy(xpath="//*[@class='action-primary action-accept']/span") public WebElement minicartModalRemove_Btn;
	@FindBy(xpath="//*[@class='action-secondary action-dismiss']/span") public WebElement minicartModalCancel_Btn;
	@FindBy(xpath="//*[@class='item Back to cart']") public WebElement checkoutBackCart_Lnk;	
	@FindBy(xpath="//*[@class='cart-empty']/p[1]") public WebElement cartEmpty_msg;
	@FindBy(xpath="(//*[@class='action towishlist'])[2]") public WebElement pdpWishList_Icon;
	@FindBy(xpath="(//*[@id='qty'])[1]") public WebElement pdpQtyUpdate_Icon;
	
	@FindBy(xpath="(//*[@class='breadcrumbs'])[1]") public WebElement pdpBreadcrumb_Lnk;
	@FindBy(xpath="(//*[@class='product-hero-thumb__item product-hero-thumb__item--image '])[1]") public WebElement pdpImgSlider_Img;
	
	@FindBy(xpath="(//*[@class='breadcrumbs'])[1]") public WebElement pdpProductName_Txt;
	@FindBy(xpath="(//*[@class='breadcrumbs'])[1]") public WebElement pdpProductPrice_Txt;
	@FindBy(xpath="//*[@class='item category141']") public WebElement pdpBreadcrumbcat_Lnk;
	@FindBy(xpath="(//*[@class='product-info-main-container__link active'])[1]") public WebElement pdpProductDetails_Lnk;

}
