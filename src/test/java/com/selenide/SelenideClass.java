package com.selenide;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideClass {
	@Test
	public void getLaunch() {
		System.setProperty("selenide.browser", "edge");
		Configuration.headless = true;
		Configuration.screenshots = true;
		open("https://www.amazon.in");

		$(By.id("nav-link-accountList")).click();
		$(By.id("ap_email")).setValue("9642193164");

	}

	@Test
	public void getAnother() {
    	

	}

}
