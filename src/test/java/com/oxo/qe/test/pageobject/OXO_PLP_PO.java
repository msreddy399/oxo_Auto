package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_PLP_PO {
	
	@FindBy(xpath="(//*[@class='hero__info hero__info--'])[1]") public WebElement PlpBanner_Img1;
	@FindBy(xpath="(//*[@class='hero__media hero__media--'])[1]") public WebElement PlpBanner_Img2;
	@FindBy(xpath="//*[@class='hero__title hero__title--']") public WebElement plpBannerTittle_Txt;
	@FindBy(xpath="//*[@class='hero__copy hero__copy--']") public WebElement plpBannerSubTittle_Txt;
	@FindBy(xpath="(//*[@class='breadcrumbs'])[1]") public WebElement plpBreadcrumb_Lnk;
	
	@FindBy(xpath="(//*[@class='product-image-photo'])[1]") public WebElement PlpProduct_Img;
	@FindBy(xpath="(//*[@class='action towishlist'])[1]") public WebElement plpWishlist_Icon;
	@FindBy(xpath="(//*[text() = 'Add to Cart'])[1]") public WebElement plpAddToCart_Btn;
	@FindBy(xpath="(//*[text() = 'Add to Cart'])[1]") public WebElement plpProductName_Txt;
	@FindBy(xpath="(//*[@id='product-price-1736'])[1]/span") public WebElement plpProductPrice_Txt;
	@FindBy(xpath="(//*[text()='Load More Products'])[2]") public WebElement loadMoreProdts_Btn;
	
	@FindBy(xpath="//*[text()='shopping cart']") public WebElement plpShopCart_Lnk;
	
	@FindBy(xpath="(//*[@class='link wishlist'])[1]/a") public WebElement plpWishList_Lnk;
	@FindBy(xpath="(//*[@class='item category198'])[1]") public WebElement plpBreadcrumbcat_Lnk;
	@FindBy(xpath="(//*[@class ='product-filter__item '])[2]/a") public WebElement plpSort_Lnk;
	@FindBy(xpath="(//*[@class ='product-filter-active__clear'])[1]") public WebElement plpSortClr_Lnk;
	@FindBy(xpath="//*[@id='footer-search']") public WebElement plpFooterSearck_Txt;
	@FindBy(xpath="//*[@class='search-section__button']") public WebElement plpFooterSearck_Icon;

}
