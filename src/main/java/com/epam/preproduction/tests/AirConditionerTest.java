package com.epam.preproduction.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.epam.preproduction.configuration.DataProviderLayer;
import com.epam.preproduction.entities.AirConditioner;
import com.epam.preproduction.pages.CataloguePage;
import com.epam.preproduction.pages.ItemPage;

public class AirConditionerTest extends TestBase {

	@Test(dataProvider = "readFromExcel", dataProviderClass = DataProviderLayer.class)
	public void testAirConditioner(String categoryName, String productType)
			throws Exception {

		goToMainPage();
		driver.findElement(By.linkText(productType)).click();

		CataloguePage cataloguePage = PageFactory.initElements(driver,
				CataloguePage.class);
		AirConditioner airConditioner = new AirConditioner();
		ItemPage itemPage = new ItemPage(driver);

		// String url = driver.getCurrentUrl();

		List<String> data = new ArrayList<String>();
		itemPage.gerUrls(data);

	}

}
