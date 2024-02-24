package com.realtime;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class selenidePractice {

	@Test
	public void EarnKaro() throws InterruptedException {
		// Configuration.browser = "";
		Configuration.screenshots = true;
		Configuration.headless = false;
		
		Configuration.assertionMode = AssertionMode.SOFT;
		Configuration.reportsUrl = "C:\\Users\\katak\\eclipse-workspace\\SelenidePractice\\build\\today";

		open("https://earnkaro.com/");
		$(By.cssSelector("a[id='link_signin']")).click();
		$(By.id("uname")).setValue("9966019169");
		$(By.id("btnLayoutContinue")).click();
		Thread.sleep(30000);
		$(By.id("btnLayoutVerifySignOTP")).click();
		$(By.cssSelector("input[id='uname']")).setValue("dp35021655@gmail.com");
		$(By.id("btnJEmailContinue")).click();
		$(By.cssSelector("input[type='passwor']:nth-child(2)")).setValue("Chinna5237");
		$(By.cssSelector("button[id*='btnLayout']")).click();

	}

}
