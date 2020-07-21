package com.qa.subispeed.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.subispeed.base.TestBase;

public class HomePage extends TestBase {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'15+ WRX')]/parent:: a")
	WebElement wrx;

	public void clickWRXLink() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(wrx));
		WebElement wrxLink=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'15+ WRX')]/parent:: a"))));
		wrxLink.click();
	}

}
