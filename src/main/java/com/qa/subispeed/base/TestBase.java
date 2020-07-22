package com.qa.subispeed.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public Properties prop;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	@BeforeMethod
	public static void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://subispeed.com/");

	}

	public void teardown() {
		driver.quit();
	}

	public String getPageTitle(String title) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	public WebElement getElement(By locator) {

		WebElement element = driver.findElement(locator);
		return element;
	}
}
