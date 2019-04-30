package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_WishList_PO {
	
	@FindBy(xpath="(//*[@class='product-image-photo'])[1]") public WebElement wishList_Img;
	@FindBy(xpath="(//*[@class='btn-remove action delete'])[1]") public WebElement wishListRemove_Btn;
	@FindBy(xpath="//*[@title='Add to Cart']") public WebElement wishListAddToCart_Btn;
	@FindBy(xpath="//*[@title='Add All to Cart']") public WebElement wishListAddAllToCart_Btn;
	
	@FindBy(xpath="(//*[@class='product-item-name'])[1]/a") public WebElement wishListPrdName_Txt;
	@FindBy(xpath="(//*[@class='price-container price-configured_price tax weee'])[1]") public WebElement wishListPrdPrice_Txt;

}
