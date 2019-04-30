package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_MiniCart_PO {
	
	
	@FindBy(xpath="//*[@class='action delete']/span") public WebElement minicartRemove_Btn;
	@FindBy(xpath="//*[@class='action-primary action-accept']/span") public WebElement minicartModalRemove_Btn;
	@FindBy(xpath="(//*[@data-role='closeBtn'])[2]") public WebElement minicartModalCancel_Btn;
	

}
