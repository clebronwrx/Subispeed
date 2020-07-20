package com.qa.subispeed.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.subispeed.base.TestBase;
import com.qa.subispeed.pages.HomePage;

public class HomePageTest extends TestBase {
	public HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		homepage = new HomePage();		
	}

	@Test
	public void verifyWRXLinkTest() throws InterruptedException {

		homepage.clickWRXLink();
		
		String title = getPageTitle("2015-2020 Subaru WRX");
		Assert.assertTrue(title.contains("2015-2020 Subaru WRX"));
	}

	@AfterMethod
	public void breakdown() {
		teardown();
	}

}
