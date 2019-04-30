package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_Cart_PO {
	
	
	@FindBy(xpath="(//*[@class='action primary checkout'])[2]") public WebElement cartCheckout_Btn;
	@FindBy(xpath="(//*[@class='paypal checkout paypal-logo paypal-express-in-context-mini-cart-container'])[2]") public WebElement cartPayPal_Btn;
	@FindBy(xpath="(//*[@class='summary title'])[1]") public WebElement cartOrderSummary_Txt;
	@FindBy(xpath="(//*[@class='amount'])[1]/span") public WebElement cartOrderSummaryPrice_Txt;
	@FindBy(xpath="(//*[@class='amount'])[1]/span") public WebElement cartOrderSummarySubtotalPrice_Txt;
	@FindBy(xpath="(//*[@class='price'])[8]") public WebElement cartOrderTotalPrice_Txt;
	
	@FindBy(xpath="//*[text() ='Continue Shopping']") public WebElement cartContShopping_Lnk;
	@FindBy(xpath="(//*[@class ='product-image-photo'])[2]") public WebElement cartPrd_Img;
	@FindBy(xpath="//*[@id ='removeItem']") public WebElement cartRemoveItem_Lnk;
	@FindBy(xpath="(//*[@class='cart-price'])[2]/span") public WebElement cartPrice_Txt;
	@FindBy(xpath="(//*[@class='product-item-name'])[2]/a") public WebElement cartPrdName_Txt;
	@FindBy(xpath="(//*[@class='item-sku__description'])[1]") public WebElement cartSkuId_Txt;
	@FindBy(xpath="(//*[@id='cart-62145-qty'])[1]") public WebElement cartSkuId_Drpdwn;
	
	@FindBy(xpath="(//*[@data-role='cart-item-qty'])[1]") public WebElement cartQty_drpdwn;
	@FindBy(xpath="(//*[text() = 'Move to Wishlist'])[1]") public WebElement cartWishlist_Lnk;
	

}