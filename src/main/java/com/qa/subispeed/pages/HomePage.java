package com.qa.subispeed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.subispeed.base.Base;

public class HomePage extends Base {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[contains(@class,'level-top wide parent parent-fake parent')]//span[contains(text(),'15+ WRX')]")////span[contains(text(),'15+ WRX')]/parent::a
	 WebElement link_WRX;
	
	public void clickOnLinkWRX() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(link_WRX));
		//js.executeScript("arguments[0].click();", link_WRX);
		Actions act = new Actions(driver);
		act.moveToElement(link_WRX).click().build().perform();
	}
	
}
