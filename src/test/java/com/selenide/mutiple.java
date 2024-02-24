package com.selenide;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

public class mutiple {
	@Test
	public void today() {
		// Configuration.reportsFolder = "SelenidePractice/build/juneReports";
		Configuration.screenshots = true;

		open("https://www.dealsmagnet.com/amazon-deal-finder");
		$(By.id("jbnfkvk")).click();

	}

}
